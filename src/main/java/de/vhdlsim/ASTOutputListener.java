package de.vhdlsim;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import de.vhdl.grammar.VHDLParser;
import de.vhdl.grammar.VHDLParser.IdentifierContext;
import de.vhdl.grammar.VHDLParserBaseListener;
import de.vhdlmodel.Architecture;
import de.vhdlmodel.AssignmentStmt;
import de.vhdlmodel.AssignmentType;
import de.vhdlmodel.AssociationElement;
import de.vhdlmodel.Entity;
import de.vhdlmodel.Expr;
import de.vhdlmodel.FunctionCall;
import de.vhdlmodel.IfStmt;
import de.vhdlmodel.IfStmtBranch;
import de.vhdlmodel.ModelNode;
import de.vhdlmodel.Name;
import de.vhdlmodel.PhysicalUnit;
import de.vhdlmodel.Port;
import de.vhdlmodel.PortDirection;
import de.vhdlmodel.PortTarget;
import de.vhdlmodel.Range;
import de.vhdlmodel.RangeDirection;
import de.vhdlmodel.Signal;
import de.vhdlmodel.Stmt;
import de.vhdlmodel.SubtypeIndication;

public class ASTOutputListener extends VHDLParserBaseListener {

    public ASTOutputListenerCallback astOutputListenerCallback;

    public Map<String, PhysicalUnit> units = null;

    public ModelNode<?> stmt;

    private String lastTerminal;

    //
    // Entity (Declaration and Architecture)
    //

    private Entity entity;

    private PortTarget portTarget;

    private Architecture architecture;

    //
    // Signal
    //

    // private Signal signal;

    //
    // Range
    //

    // private Range range;

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

    @Override public void enterConditional_signal_assignment(VHDLParser.Conditional_signal_assignmentContext ctx) { 
        
        AssignmentStmt assignmentStmt = new AssignmentStmt();
        assignmentStmt.assignmentType = AssignmentType.SIGNAL;

        // lhs
        ModelNode<String> lhsModelNode = new ModelNode<>();
        lhsModelNode.name = ctx.getChild(0).getText();
        assignmentStmt.lhs = lhsModelNode;

        connectParentAndChild(assignmentStmt);
        descend(assignmentStmt);
    }
	
    @Override public void exitConditional_signal_assignment(VHDLParser.Conditional_signal_assignmentContext ctx) { 

        AssignmentStmt assignmentStmt = (AssignmentStmt) stmt;
        assignmentStmt.rhs = assignmentStmt.children.get(0);
        assignmentStmt.children.clear();

        // emit
        astOutputListenerCallback.signalAssignment(assignmentStmt);

        ascend();
    }

    //
    // Signal Declaration
    //

    @Override
    public void enterSignal_declaration(VHDLParser.Signal_declarationContext ctx) {

        Signal signal = new Signal();

        connectParentAndChild(signal);
        descend(signal);

        for (ParseTree parseTree : ctx.identifier_list().children) {

            if (!(parseTree instanceof IdentifierContext)) {
                continue;
            }

            IdentifierContext identifierContext = (IdentifierContext) parseTree;
            String identifier = identifierContext.getText();
            signal.name = identifier;

            // String type = ctx.subtype_indication().getText();
            // signal.type = type;

            // signal = new Signal();
            // if (architecture != null) {
            //     architecture.signals.add(signal);
            // }
        }
    }

    @Override
    public void exitSignal_declaration(VHDLParser.Signal_declarationContext ctx) {

        Signal signal = (Signal) stmt;

        signal.type = (SubtypeIndication) signal.children.get(0);
        signal.children.clear();

        // emit
        astOutputListenerCallback.signal(signal);

        ascend();
    }

    //
    // Range
    //

    @Override
    public void enterExplicit_range(VHDLParser.Explicit_rangeContext ctx) {

        Range range = new Range();

        connectParentAndChild(range);
        descend(range);
    }

    @Override
    public void exitExplicit_range(VHDLParser.Explicit_rangeContext ctx) {

        Range range = (Range) stmt;

        range.start = range.children.get(0);
        range.end = range.children.get(1);

        // emit
        astOutputListenerCallback.range(range);

        ascend();
    }

    @Override 
    public void enterDirection(VHDLParser.DirectionContext ctx) { 

        Range range = (Range) stmt;
        range.rangeDirection = RangeDirection.fromString(ctx.getText());
    }

	@Override 
    public void exitDirection(VHDLParser.DirectionContext ctx) { }

    //
    // Name (e.g. CounterVal(Minutes => 1))
    //

    @Override
    public void enterName(VHDLParser.NameContext ctx) {

        Name name = new Name();
        name.name = ctx.identifier().getText();

        connectParentAndChild(name);
        descend(name);
    }

    @Override
    public void exitName(VHDLParser.NameContext ctx) {

        // emit
        astOutputListenerCallback.name((Name) stmt);

        ascend();
    }

    @Override
    public void enterFunction_call_or_indexed_name_part(VHDLParser.Function_call_or_indexed_name_partContext ctx) {

        FunctionCall functionCall = new FunctionCall();

        connectParentAndChild(functionCall);
        descend(functionCall);
    }

    @Override
    public void exitFunction_call_or_indexed_name_part(VHDLParser.Function_call_or_indexed_name_partContext ctx) {

        // emit
        astOutputListenerCallback.functionCall((FunctionCall) stmt);

        ascend();
    }

    @Override
    public void enterAssociation_element(VHDLParser.Association_elementContext ctx) {

        AssociationElement associationElement = new AssociationElement();
        associationElement.name = ctx.getChild(0).getText();

        connectParentAndChild(associationElement);
        descend(associationElement);
    }

    @Override
    public void exitAssociation_element(VHDLParser.Association_elementContext ctx) {

        // System.out.println(ctx.getText());

        // AssociationElement associationElement = new AssociationElement();
        // associationElement.value = lastIdentifier;
        // associationElement.name = lastIdentifier;
        // associationElement.expr = stackPop();

        // stackPush(associationElement);

        AssociationElement associationElement = (AssociationElement) stmt;
        associationElement.expr = stmt.children.get(0);

        stmt.children.clear();

        ascend();
    }

    @Override
    public void enterSubtype_indication(VHDLParser.Subtype_indicationContext ctx) {
        SubtypeIndication subtypeIndication = new SubtypeIndication();
        subtypeIndication.name = ctx.getChild(0).getText();

        connectParentAndChild(subtypeIndication);
        descend(subtypeIndication);
    }

    @Override
    public void exitSubtype_indication(VHDLParser.Subtype_indicationContext ctx) {
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
        astOutputListenerCallback.ifStmt((Stmt) stmt);
        ascend();
    }

    //
    // Entity (Declaration and Architecture)
    //

    @Override
    public void enterEntity_declaration(VHDLParser.Entity_declarationContext ctx) {

        entity = new Entity();
        if (stmt != null) {
            stmt.children.add(entity);
            entity.parent = (Stmt) stmt;
        }
        stmt = entity;
        portTarget = entity;

        entity.name = ctx.identifier().get(0).getText();
    }

    @Override
    public void exitEntity_declaration(VHDLParser.Entity_declarationContext ctx) {

        astOutputListenerCallback.entity(entity);

        stmt = entity.parent;
        entity = null;
        portTarget = null;
    }

    @Override
    public void enterInterface_port_declaration(VHDLParser.Interface_port_declarationContext ctx) {

        String identifier = ctx.identifier_list().getChild(0).getText();

        String type = ctx.subtype_indication().getText();

        // port direction (in, out, inout)
        String mode = ctx.signal_mode().getText();

        Port port = new Port();
        portTarget.ports.add(port);

        port.name = identifier;
        port.type = type;
        port.portDirection = PortDirection.fromString(mode);
    }

    @Override
    public void enterArchitecture_body(VHDLParser.Architecture_bodyContext ctx) {

        String architectureName = null;
        String entityName = null;

        // System.out.println(ctx.getText());

        // ParseTree child1 = ctx.getChild(0); // ARCHITECTURE (TOKEN)
        ParseTree child2 = ctx.getChild(1); // architecture identifier
        architectureName = child2.getText();

        // ParseTree child3 = ctx.getChild(2); // OF (TOKEN)
        ParseTree child4 = ctx.getChild(3); // entitiy identifier
        entityName = child4.getText();

        // ParseTree child5 = ctx.getChild(4); // IS (TOKEN)

        // ParseTree child6 = ctx.getChild(5); // architecture_declarative_part
        // System.out.println(child6.getText());

        // ParseTree child7 = ctx.getChild(6); // BEGIN (TOKEN)
        // System.out.println(child7.getText());

        // ParseTree child8 = ctx.getChild(7); // inner source code inside the
        // architecture
        // System.out.println(child8.getText());

        // ParseTree child9 = ctx.getChild(8); // END (TOKEN)
        // System.out.println(child9.getText());
        // ParseTree child10 = ctx.getChild(9); // architecture identifier (see child 2)
        // System.out.println(child10.getText());
        // ParseTree child11 = ctx.getChild(10); // semicolon (TOKEN)
        // System.out.println(child11.getText());

        architecture = new Architecture();
        if (stmt != null) {
            stmt.children.add(architecture);
            architecture.parent = (Stmt) stmt;
        }
        stmt = architecture;

        architecture.architectureName = architectureName;
        architecture.entityName = entityName;
    }

    @Override
    public void exitArchitecture_body(VHDLParser.Architecture_bodyContext ctx) {

        moveSignals(architecture);

        astOutputListenerCallback.architecture(architecture);

        // Commenting out this line will leave the stmt alive for printing
        stmt = architecture.parent;
        architecture = null;
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
        if (ctx.getChildCount() >= 3) { 
            // emit
            astOutputListenerCallback.expression(stmt);
            if (ctx.getChildCount() > 1) {
                ascend();
            }
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

    private void connectParentAndChild(ModelNode<?> newStmt) {
        if (stmt != null) {
            stmt.children.add(newStmt);
            newStmt.parent = stmt;
        }
    }

    private void descend(ModelNode<?> newStmt) {
        stmt = newStmt;
    }

    private void ascend() {
        stmt = stmt.parent;
    }

    private void moveSignals(Architecture architecture) {
        List<Signal> signals = new ArrayList<>();
        for (ModelNode<?> child : architecture.children) {
            if (child instanceof Signal) {
                signals.add((Signal) child);
            }
        }
        architecture.signals.addAll(signals);
        architecture.children.removeAll(signals);
    }
}