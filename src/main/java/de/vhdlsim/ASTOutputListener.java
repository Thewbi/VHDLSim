package de.vhdlsim;

import java.util.Map;

import org.antlr.v4.runtime.tree.TerminalNode;

import de.vhdl.grammar.VHDLParser;
import de.vhdl.grammar.VHDLParserBaseListener;
import de.vhdlmodel.AssignmentStmt;
import de.vhdlmodel.AssignmentType;
import de.vhdlmodel.Expr;
import de.vhdlmodel.IfStmt;
import de.vhdlmodel.IfStmtBranch;
import de.vhdlmodel.ModelNode;
import de.vhdlmodel.PhysicalUnit;
import de.vhdlmodel.Stmt;

public class ASTOutputListener extends VHDLParserBaseListener {

    public ASTOutputListenerCallback astOutputListenerCallback;

    public Map<String, PhysicalUnit> units = null;

    public Stmt stmt;

    private String lastTerminal;

    //
    // Assignment
    //

    @Override
    public void enterSignal_assignment_statement(VHDLParser.Signal_assignment_statementContext ctx) {

        AssignmentStmt assignmentStmt = new AssignmentStmt();
        assignmentStmt.assignmentType = AssignmentType.SIGNAL;

        // lhs
        ModelNode<String> lhsModelNode = new ModelNode<>();
        lhsModelNode.name = ctx.getChild(0).getText();
        assignmentStmt.lhs = lhsModelNode;

        connectParentAndChild(assignmentStmt);
        descend(assignmentStmt);
    }

    @Override
    public void exitSignal_assignment_statement(VHDLParser.Signal_assignment_statementContext ctx) {

        AssignmentStmt assignmentStmt = (AssignmentStmt) stmt;
        assignmentStmt.rhs = assignmentStmt.children.get(0);
        assignmentStmt.children.clear();

        // emit
        astOutputListenerCallback.signalAssignment(assignmentStmt);

        ascend();
    }

    //
    // If Statement
    //

    @Override
    public void enterIf_statement(VHDLParser.If_statementContext ctx) {

        IfStmt ifStmt = new IfStmt();

        connectParentAndChild(ifStmt);
        descend(ifStmt);
    }

    @Override
    public void exitIf_statement(VHDLParser.If_statementContext ctx) {
        // emit
        astOutputListenerCallback.ifStmt(stmt);
        ascend();
    }

    //
    // Expression, Relation, Term
    //

    @Override
    public void enterExpression(VHDLParser.ExpressionContext ctx) {
        // System.out.println(ctx.getText());
        if (ctx.getChildCount() >= 3) {
            Expr expr = new Expr();
            expr.operator = ctx.getChild(1).getText();
            connectParentAndChild(expr);
            descend(expr);
        }
    }

    @Override
    public void exitExpression(VHDLParser.ExpressionContext ctx) {
        if (ctx.getChildCount() > 1) {
            ascend();
        }
    }

    @Override
    public void enterSimple_expression(VHDLParser.Simple_expressionContext ctx) {
        // System.out.println(ctx.getText());
        if (ctx.getChildCount() == 1) {
            // Expr expr = new Expr();
            // expr.value = ctx.getText();
            // connectParentAndChild(expr);
        } else if (ctx.getChildCount() == 3) {
            Expr expr = new Expr();
            expr.operator = ctx.getChild(1).getText();
            connectParentAndChild(expr);
            descend(expr);
        } else {
            throw new RuntimeException("Unknown child amount!");
        }
    }

    @Override
    public void exitSimple_expression(VHDLParser.Simple_expressionContext ctx) {
        // emit
        astOutputListenerCallback.expression(stmt);
        if (ctx.getChildCount() > 1) {
            ascend();
        }
    }

    @Override
    public void enterRelation(VHDLParser.RelationContext ctx) {
        // System.out.println(ctx.getText());
        if (ctx.getChildCount() == 3) {
            Expr expr = new Expr();
            expr.operator = ctx.getChild(1).getText();
            connectParentAndChild(expr);
            descend(expr);
        }
    }

    @Override
    public void exitRelation(VHDLParser.RelationContext ctx) {
        if (ctx.getChildCount() > 1) {
            ascend();
        }
    }

    @Override
    public void enterTerm(VHDLParser.TermContext ctx) {
        // System.out.println(ctx.getText());
        if (ctx.getChildCount() == 3) {
            Expr expr = new Expr();
            expr.operator = ctx.getChild(1).getText();
            connectParentAndChild(expr);
            descend(expr);
        }
    }

    @Override
    public void exitTerm(VHDLParser.TermContext ctx) {
        if (ctx.getChildCount() > 1) {
            ascend();
        }
    }

    //
    // Literal
    //

    @Override
    public void enterLiteral(VHDLParser.LiteralContext ctx) {
        Expr expr = new Expr();
        expr.value = ctx.getText();
        connectParentAndChild(expr);
    }

    @Override
    public void exitLiteral(VHDLParser.LiteralContext ctx) {
    }

    //
    // Terminal
    //

    @Override
    public void visitTerminal(TerminalNode node) {
        // System.out.println(node.getText());

        if (node.getText().toLowerCase().equals("if")) {

            if ("end".equalsIgnoreCase(lastTerminal)) {
                ascend();
            } else {
                IfStmtBranch ifStmtBranch = new IfStmtBranch();

                // connect parent and child
                IfStmt ifStmt = (IfStmt) stmt;
                ifStmt.branches.add(ifStmtBranch);
                ifStmtBranch.parent = ifStmt;

                descend(ifStmtBranch);
            }

        } else if (node.getText().toLowerCase().equals("elsif")) {

            if (stmt instanceof IfStmtBranch) {
                ascend();
            }

            if (stmt instanceof IfStmt) {

                IfStmtBranch ifStmtBranch = new IfStmtBranch();

                // connect parent and child
                IfStmt ifStmt = (IfStmt) stmt;
                ifStmt.branches.add(ifStmtBranch);
                ifStmtBranch.parent = ifStmt;

                // descend
                stmt = ifStmtBranch;
            }

        } else if (node.getText().toLowerCase().equals("else")) {

            if (stmt instanceof IfStmtBranch) {
                ascend();
            }

            if (stmt instanceof IfStmt) {

                IfStmt ifStmt = (IfStmt) stmt;

                IfStmtBranch ifStmtBranch = new IfStmtBranch();

                Expr trueExpr = new Expr();
                trueExpr.value = "TRUE";
                ifStmtBranch.children.add(trueExpr);

                // connect parent and child
                ifStmt.branches.add(ifStmtBranch);
                ifStmtBranch.parent = ifStmt;

                // descend
                stmt = ifStmtBranch;
            }
        } else {
            // System.out.println(node.getText());
        }

        // remember the last terminal because the last 'if' in 'end if'
        // is detected by the preceding 'end' which will appear in lastTerminal
        lastTerminal = node.getText();
    }

    //
    // Utility
    //

    private void connectParentAndChild(Stmt newStmt) {
        if (stmt != null) {
            stmt.children.add(newStmt);
            newStmt.parent = stmt;
        }
    }

    private void descend(Stmt newStmt) {
        stmt = newStmt;
    }

    private void ascend() {
        stmt = stmt.parent;
    }
}
