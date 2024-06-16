package de.vhdlsim;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.management.RuntimeErrorException;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.stringtemplate.v4.ST;

import de.vhdl.grammar.VHDLLexer;
import de.vhdl.grammar.VHDLParser;
import de.vhdl.grammar.VHDLParser.Relational_operatorContext;
import de.vhdl.grammar.VHDLParserBaseListener;
import de.vhdlmodel.AssignmentStmt;
import de.vhdlmodel.Expr;
import de.vhdlmodel.Identifier;
import de.vhdlmodel.IfStmt;
import de.vhdlmodel.IfStmtBranch;
import de.vhdlmodel.ModelNode;
import de.vhdlmodel.NumericLiteral;
import de.vhdlmodel.Relation;
import de.vhdlmodel.Stmt;
import de.vhdlmodel.StringLiteral;

/**
 * Constructs an abstract syntac tree (AST) out of the parse tree (PT).
 * 
 * In the resources folder, you will find .ast and .pt files.
 * .pt files contain the parse trees.
 * .ast files contain the abstract syntax trees.
 */
public class ASTOutputListener extends VHDLParserBaseListener {

    public Stmt stmt;

    public List<Stmt> stmts = new ArrayList<>();

    public ModelNode expr;

    private Stack<ModelNode> stack = new Stack<>();

    @Override
    public void exitRelation(VHDLParser.RelationContext ctx) {

        Relational_operatorContext relational_operatorContext = ctx.relational_operator();
        if (relational_operatorContext != null) {

            Relation newRelation = new Relation();
            ModelNode oldExpr = expr;

            // parent
            newRelation.parent = oldExpr;

            // child
            oldExpr.children.add(newRelation);

            expr = newRelation;

            switch (relational_operatorContext.start.getType()) {

                case VHDLLexer.EQ:
                    TerminalNode eq = relational_operatorContext.EQ();
                    System.out.println("Relation: " + eq);

                    expr.operator = eq.toString();
                    break;

                case VHDLLexer.NEQ:
                    TerminalNode neq = relational_operatorContext.NEQ();
                    System.out.println("Relation: " + neq);

                    expr.operator = neq.toString();
                    break;

                case VHDLLexer.GE:
                    TerminalNode ge = relational_operatorContext.GE();
                    System.out.println("Relation: " + ge);

                    expr.operator = ge.toString();
                    break;

                case VHDLLexer.GREATERTHAN:
                    TerminalNode gt = relational_operatorContext.GREATERTHAN();
                    System.out.println("Relation: " + gt);

                    expr.operator = gt.toString();
                    break;

                case VHDLLexer.LE:
                    TerminalNode le = relational_operatorContext.LE();
                    System.out.println("Relation: " + le);

                    expr.operator = le.toString();
                    break;

                case VHDLLexer.LOWERTHAN:
                    TerminalNode lt = relational_operatorContext.LOWERTHAN();
                    System.out.println("Relation: " + lt);

                    expr.operator = lt.toString();
                    break;

                default:
                    throw new RuntimeException("Unknown type: " + relational_operatorContext.start.getType());
            }

            ModelNode rhs = stack.pop();
            expr.children.add(stack.pop());
            expr.children.add(rhs);
        }
    }

    @Override
    public void exitLogical_operator(VHDLParser.Logical_operatorContext ctx) {

        Expr newExpr = null;

        if (expr instanceof Relation) {

            newExpr = new Expr();
            ModelNode oldExpr = expr;

            // parent
            ModelNode parent = oldExpr.parent;
            if (parent != null) {
                parent.children.remove(oldExpr);
                parent.children.add(newExpr);
                newExpr.parent = parent;
            }

            // children
            oldExpr.parent = newExpr;
            newExpr.children.add(oldExpr);

            expr = newExpr;

        } else if (expr instanceof Expr) {

            throw new RuntimeException();

        }

        switch (ctx.start.getType()) {

            case VHDLLexer.AND:
                System.out.println("Logical_operator: " + ctx.AND());
                newExpr.operator = ctx.AND().toString();
                break;

            case VHDLParser.OR:
                System.out.println("Logical_operator: " + ctx.OR());
                newExpr.operator = ctx.OR().toString();
                break;

            case VHDLParser.NAND:
                System.out.println("Logical_operator: " + ctx.NAND());
                newExpr.operator = ctx.NAND().toString();
                break;

            case VHDLParser.NOR:
                System.out.println("Logical_operator: " + ctx.NOR());
                newExpr.operator = ctx.NOR().toString();
                break;

            case VHDLParser.XOR:
                System.out.println("Logical_operator: " + ctx.XOR());
                newExpr.operator = ctx.XOR().toString();
                break;

            case VHDLParser.XNOR:
                System.out.println("Logical_operator: " + ctx.XNOR());
                newExpr.operator = ctx.XNOR().toString();
                break;

            default:
                throw new RuntimeException("Unknown type: " + ctx.start.getType());
        }

    }

    @Override
    public void exitIdentifier(VHDLParser.IdentifierContext ctx) {

        switch (ctx.start.getType()) {

            case VHDLParser.BASIC_IDENTIFIER:
                System.out.println("BASIC_IDENTIFIER: \"" + ctx.getText() + "\"");

                Identifier identifier = new Identifier();
                identifier.value = ctx.getText();
                stack.push(identifier);
                break;

            case VHDLParser.EXTENDED_IDENTIFIER:
                System.out.println("EXTENDED_IDENTIFIER: \"" + ctx.getText() + "\"");
                break;

            default:
                throw new RuntimeException("Unknown type: " + ctx.start.getType());
        }
    }

    @Override
    public void exitLiteral(VHDLParser.LiteralContext ctx) {

        switch (ctx.start.getType()) {

            case VHDLParser.CHARACTER_LITERAL:
                System.out.println("CHARACTER_LITERAL: \"" + ctx.getText() + "\"");

                NumericLiteral numericLiteral = new NumericLiteral();
                numericLiteral.value = Integer.parseInt(ctx.getText().substring(1, ctx.getText().length()-1));
                stack.push(numericLiteral);
                break;

            case VHDLParser.NULL_:
                // System.out.println("NULL_: \"" + ctx.NULL_() + "\"");
                break;

            case VHDLParser.BIT_STRING_LITERAL:
                // System.out.println("BIT_STRING_LITERAL: \"" + ctx.BIT_STRING_LITERAL() +
                // "\"");
                break;

            case VHDLParser.STRING_LITERAL:
                // System.out.println("STRING_LITERAL: \"" + ctx.STRING_LITERAL() + "\"");
                StringLiteral stringLiteral = new StringLiteral();
                stringLiteral.value = ctx.getText();
                stack.push(stringLiteral);
                break;

            case VHDLParser.BASIC_IDENTIFIER:

                // System.out.println("BASIC_IDENTIFIER: \"" + ctx + "\"");

                // StringLiteral basicStringLiteral = new StringLiteral();
                // basicStringLiteral.value = ctx.getText();
                // stack.push(basicStringLiteral);
                break;

            default:
                throw new RuntimeException("Unknown type: " + ctx.start.getType());
        }
    }

    @Override public void enterCondition(VHDLParser.ConditionContext ctx) {

        if (stmt instanceof IfStmtBranch) {
            stmt = (Stmt) stmt.parent;
        } 
        
        if (stmt instanceof IfStmt) {

            IfStmt ifStmt = (IfStmt) stmt;

            IfStmtBranch ifStmtBranch = new IfStmtBranch();
            ifStmt.branches.add(ifStmtBranch);
            ifStmtBranch.parent = ifStmt;

            stmt = ifStmtBranch;

            ifStmtBranch.exprRoot = new ModelNode("exprRoot");
            expr = ifStmtBranch.exprRoot;
        
        }
    }

    @Override
    public void enterIf_statement(VHDLParser.If_statementContext ctx) {
        System.out.println("If_statement context!");

        IfStmt ifStmt = new IfStmt();
        stmts.add(ifStmt);

        stmt = ifStmt;
    }

    public void exitIf_statement(VHDLParser.If_statementContext ctx) {
        System.out.println("If_statement context!");

        // reset on exit
        stmt = null;
        expr = null;

        // assert stack empty
        // if (stack.size() != 0) {
        //     throw new RuntimeException();
        // }

        // DEBUG
        stack.clear();
    }

    @Override
    public void exitSignal_assignment_statement(VHDLParser.Signal_assignment_statementContext ctx) {

        System.out.println("Signal_assignment_statement context!");

        AssignmentStmt assignmentStmt = new AssignmentStmt();

        ModelNode rhs = stack.pop();
        assignmentStmt.lhs = stack.pop();
        assignmentStmt.rhs = rhs;

        stmt.children.add(assignmentStmt);
    }

    @Override
    public void visitTerminal(TerminalNode node) {

        if (node.getText().toLowerCase().equals("else")) {
            if (stmt instanceof IfStmtBranch) {
                stmt = (Stmt) stmt.parent;
            } 
            
            if (stmt instanceof IfStmt) {
    
                IfStmt ifStmt = (IfStmt) stmt;
    
                IfStmtBranch ifStmtBranch = new IfStmtBranch();
                ifStmt.branches.add(ifStmtBranch);
                ifStmtBranch.parent = ifStmt;
    
                stmt = ifStmtBranch;
    
                ifStmtBranch.exprRoot = new ModelNode("exprRoot");
                expr = ifStmtBranch.exprRoot;

                // the else branch has a condition of type true so it is always taken
                expr.children.add(Expr.TRUE);
            
            }
        }

    }
}