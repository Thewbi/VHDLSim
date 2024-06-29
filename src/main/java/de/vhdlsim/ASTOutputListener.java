package de.vhdlsim;

import java.util.Stack;

import org.antlr.v4.parse.ANTLRParser.parserRule_return;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import de.vhdl.grammar.VHDLLexer;
import de.vhdl.grammar.VHDLParser;
import de.vhdl.grammar.VHDLParser.DirectionContext;
import de.vhdl.grammar.VHDLParser.IdentifierContext;
import de.vhdl.grammar.VHDLParser.Identifier_listContext;
import de.vhdl.grammar.VHDLParser.Selected_nameContext;
import de.vhdl.grammar.VHDLParser.Simple_expressionContext;
import de.vhdl.grammar.VHDLParser.Subtype_indicationContext;
import de.vhdl.grammar.VHDLParserBaseListener;
import de.vhdlmodel.ActualParameter;
import de.vhdlmodel.Architecture;
import de.vhdlmodel.AssignmentStmt;
import de.vhdlmodel.CaseStmt;
import de.vhdlmodel.CaseStmtBranch;
import de.vhdlmodel.CharacterLiteral;
import de.vhdlmodel.Component;
import de.vhdlmodel.Entity;
import de.vhdlmodel.Expr;
import de.vhdlmodel.FunctionCall;
import de.vhdlmodel.FunctionCallActualParameter;
import de.vhdlmodel.FunctionSpecification;
import de.vhdlmodel.IfStmt;
import de.vhdlmodel.IfStmtBranch;
import de.vhdlmodel.ModelNode;
import de.vhdlmodel.DummyNode;
import de.vhdlmodel.NumericLiteral;
import de.vhdlmodel.Port;
import de.vhdlmodel.PortDirection;
import de.vhdlmodel.PortTarget;
import de.vhdlmodel.Relation;
import de.vhdlmodel.Signal;
import de.vhdlmodel.Stmt;
import de.vhdlmodel.StringLiteral;
import de.vhdlmodel.Process;
import de.vhdlmodel.Range;
import de.vhdlmodel.RangeDirection;
import de.vhdlmodel.Record;
import de.vhdlmodel.RecordField;

/**
 * Constructs an abstract syntac tree (AST) out of the parse tree (PT).
 * 
 * In the resources folder, you will find .ast and .pt files.
 * .pt files contain the parse trees.
 * .ast files contain the abstract syntax trees.
 */
public class ASTOutputListener extends VHDLParserBaseListener {

    public Stmt stmt;

    public ModelNode<?> expr;

    public ASTOutputListenerCallback astOutputListenerCallback;

    private Stack<ModelNode<?>> stack = new Stack<>();

    private boolean case_statement_alternative_others;

    private String lastIdentifier;

    private FunctionCall lastFunctionCall;

    private boolean functionCall;

    private Process lastProcess;

    private boolean sensitivityList;

    private Entity entity;

    private Architecture architecture;

    private Component component;

    private PortTarget portTarget;

    private Record record;

    private PortDirection portDirection = PortDirection.UNKNOWN;

    private Range range;

    private String subtype_indication;

    private FunctionSpecification functionSpecification;

    private ActualParameter actualParameter;

    @Override
    public void enterFunction_specification(VHDLParser.Function_specificationContext ctx) {
        final String functionName = ctx.designator().getText();
        functionSpecification = new FunctionSpecification();
        functionSpecification.name = functionName;
    }

    @Override
    public void exitFunction_specification(VHDLParser.Function_specificationContext ctx) {
        astOutputListenerCallback.functionSpecification(functionSpecification);
        functionSpecification = null;
    }

    @Override
    public void enterInterface_constant_declaration(VHDLParser.Interface_constant_declarationContext ctx) {
        // mark start of this interface on the stack
        stack.push(new DummyNode());
    }

    @Override
    public void exitInterface_constant_declaration(VHDLParser.Interface_constant_declarationContext ctx) {
        processInterfaceDeclaration(ctx.identifier_list(), ctx.subtype_indication());
    }

    private void processInterfaceDeclaration(Identifier_listContext identifier_listContext,
            Subtype_indicationContext subtype_indicationContext) {

        actualParameter = new ActualParameter();
        functionSpecification.actualParameters.add(actualParameter);

        // System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        // despite the name, this is used when parsing function declarations

        // for every parameter this is entered in a function declaration

        //
        // parameter name
        //

        final String parameterName = identifier_listContext.getText();
        //System.out.println(parameterName);

        actualParameter.name = parameterName;

        //
        // PortDirection
        //

        // // the IN token can be null or it can be present.
        // // when it is present, this is the signal mode (IN, OUT, INOUT, BUFFER,
        // LINKAGE)
        // // when the signal mode is OUT, INPUT, BUFFER or LINKAGE a specific
        // Signal_mode
        // // node will
        // // be part of the parse tree! Just for IN, there will not be a Signal_mode
        // node
        // // but there
        // // will be a IN token!
        // TerminalNode inTerminalNode = ctx.IN();
        // System.out.println(inTerminalNode);

        // by default, set the portDirection to IN because this is the default for
        // formal parameters
        // If a specific mode node is present in the tree, override the default there
        if (portDirection == PortDirection.UNKNOWN) {
            portDirection = PortDirection.IN;
        }

        actualParameter.direction = portDirection;

        // System.out.println(portDirection);

        //
        // datatype
        //

        // final String subtype = subtype_indicationContext.getText();
        // System.out.println(subtype);

        // System.out.println(subtype_indication);
        actualParameter.subtype_indication = subtype_indication;

        if (range != null) {
            // System.out.println(range.toString(0));

            actualParameter.range = range;
        }

        ModelNode<?> node = null;
        if (!stack.empty()) {
            do {

                node = stack.pop();

                if (!(node instanceof DummyNode)) {
                    actualParameter.expression = node;
                }

            } while (!(node instanceof DummyNode));
        }

        // System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        // reset
        portDirection = PortDirection.UNKNOWN;
        range = null;
        subtype_indication = null;
    }

    @Override
    public void enterInterface_variable_declaration(VHDLParser.Interface_variable_declarationContext ctx) {

    }

    @Override
    public void exitInterface_variable_declaration(VHDLParser.Interface_variable_declarationContext ctx) {
        processInterfaceDeclaration(ctx.identifier_list(), ctx.subtype_indication());
    }

    @Override
    public void enterSignal_mode(VHDLParser.Signal_modeContext ctx) {
        // System.out.println(ctx.getText());
        portDirection = PortDirection.fromString(ctx.getText());

        actualParameter.direction = portDirection;
    }

    @Override
    public void exitSignal_mode(VHDLParser.Signal_modeContext ctx) {
    }

    @Override
    public void enterSubtype_indication(VHDLParser.Subtype_indicationContext ctx) {

    }

    @Override
    public void exitSubtype_indication(VHDLParser.Subtype_indicationContext ctx) {
        //System.out.println(ctx.getText());

        StringBuffer stringBuffer = new StringBuffer();
        for (Selected_nameContext selected_nameContext : ctx.selected_name()) {
            //System.out.println(selected_nameContext.getText());
            stringBuffer.append(selected_nameContext.getText());
        }

        subtype_indication = stringBuffer.toString();
    }

    @Override
    public void enterExplicit_range(VHDLParser.Explicit_rangeContext ctx) {
        
    }

    @Override
    public void exitExplicit_range(VHDLParser.Explicit_rangeContext ctx) {

        range = new Range();

        DirectionContext directionContext = ctx.direction();
        range.rangeDirection = RangeDirection.fromString(directionContext.getText());

        range.end = stack.pop();
        range.start = stack.pop();
    }

    @Override
    public void enterRecord_type_definition(VHDLParser.Record_type_definitionContext ctx) {
        record = new Record();
        record.name = ctx.identifier().getText();
    }

    @Override
    public void exitRecord_type_definition(VHDLParser.Record_type_definitionContext ctx) {
        astOutputListenerCallback.record(record);
        record = null;
    }

    @Override
    public void enterElement_declaration(VHDLParser.Element_declarationContext ctx) {
        final String name = ctx.identifier_list().getText();

        final String subtype = ctx.element_subtype_definition().getText();

        RecordField recordField = new RecordField();
        record.children.add(recordField);

        recordField.identifier = name;
        recordField.type = subtype;
    }

    @Override
    public void exitElement_declaration(VHDLParser.Element_declarationContext ctx) {
    }

    @Override
    public void enterSignal_declaration(VHDLParser.Signal_declarationContext ctx) {

        String identifier = ctx.identifier_list().getChild(0).getText();

        String type = ctx.subtype_indication().getText();

        Signal signal = new Signal();

        if (architecture != null) {
            architecture.signals.add(signal);
        }

        signal.name = identifier;
        signal.type = type;

        astOutputListenerCallback.signal(signal);
    }

    @Override
    public void exitSignal_declaration(VHDLParser.Signal_declarationContext ctx) {
    }

    @Override
    public void enterArchitecture_body(VHDLParser.Architecture_bodyContext ctx) {

        String architectureName = null;
        String entityName = null;

        // System.out.println(ctx.getText());

        ParseTree child1 = ctx.getChild(0); // ARCHITECTURE (TOKEN)
        ParseTree child2 = ctx.getChild(1); // architecture identifier
        architectureName = child2.getText();

        ParseTree child3 = ctx.getChild(2); // OF (TOKEN)
        ParseTree child4 = ctx.getChild(3); // entitiy identifier
        entityName = child4.getText();

        ParseTree child5 = ctx.getChild(4); // IS (TOKEN)

        ParseTree child6 = ctx.getChild(5); // architecture_declarative_part
        // System.out.println(child6.getText());

        ParseTree child7 = ctx.getChild(6); // BEGIN (TOKEN)
        // System.out.println(child7.getText());

        ParseTree child8 = ctx.getChild(7); // inner source code inside the architecture
        // System.out.println(child8.getText());

        ParseTree child9 = ctx.getChild(8); // END (TOKEN)
        // System.out.println(child9.getText());
        ParseTree child10 = ctx.getChild(9); // architecture identifier (see child 2)
        // System.out.println(child10.getText());
        ParseTree child11 = ctx.getChild(10); // semicolon (TOKEN)
        // System.out.println(child11.getText());

        architecture = new Architecture();
        if (stmt != null) {
            stmt.children.add(architecture);
            architecture.parent = stmt;
        }
        stmt = architecture;

        architecture.architectureName = architectureName;
        architecture.entityName = entityName;
    }

    @Override
    public void exitArchitecture_body(VHDLParser.Architecture_bodyContext ctx) {

        astOutputListenerCallback.architecture(architecture);

        // Commenting out this line will leave the stmt alive for printing
        stmt = architecture.parent;
        architecture = null;
    }

    @Override
    public void enterEntity_declaration(VHDLParser.Entity_declarationContext ctx) {
        entity = new Entity();
        if (stmt != null) {
            stmt.children.add(entity);
            entity.parent = stmt;
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
    public void enterComponent_declaration(VHDLParser.Component_declarationContext ctx) {
        component = new Component();
        if (stmt != null) {
            stmt.children.add(component);
            component.parent = stmt;
        }
        stmt = component;
        portTarget = component;

        component.name = ctx.identifier().get(0).getText();
    }

    @Override
    public void exitComponent_declaration(VHDLParser.Component_declarationContext ctx) {
        stmt = component.parent;

        astOutputListenerCallback.component(component);

        component = null;
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
    public void enterSensitivity_list(VHDLParser.Sensitivity_listContext ctx) {
        sensitivityList = true;
    }

    @Override
    public void exitSensitivity_list(VHDLParser.Sensitivity_listContext ctx) {
        sensitivityList = false;
    }

    @Override
    public void enterSimple_expression(VHDLParser.Simple_expressionContext ctx) {
        // mark start of this expression on the stack
        stack.push(new DummyNode());
    }

    @Override
    public void exitSimple_expression(VHDLParser.Simple_expressionContext ctx) {
        processExpression();
    }

    @Override
    public void enterAdding_operator(VHDLParser.Adding_operatorContext ctx) {
    }

    @Override
    public void exitAdding_operator(VHDLParser.Adding_operatorContext ctx) {

        Expr operatorModelNode = new Expr();

        switch (ctx.start.getType()) {

            case VHDLLexer.PLUS:
                operatorModelNode.value = "+";
                break;

            case VHDLLexer.MINUS:
                operatorModelNode.value = "-";
                break;
        }

        stackPush(operatorModelNode);
    }

    @Override
    public void enterExpression(VHDLParser.ExpressionContext ctx) {

        // System.out.println("enter expression " + ctx);

        // a dummy node is entered to mark the bottom of the stack where
        // the current expression stops. Without marking the end of the expression stack
        // it becomes excessively hard to visit expressions because the expression
        // element
        // is used in so many contexts that it is not always clear how to combine
        // elements.
        stack.push(new DummyNode());
    }

    @Override
    public void exitExpression(VHDLParser.ExpressionContext ctx) {
        processExpression();
    }

    @Override
    public void enterRelational_operator(VHDLParser.Relational_operatorContext ctx) {
    }

    @Override
    public void exitRelational_operator(VHDLParser.Relational_operatorContext ctx) {

        Expr operatorModelNode = new Expr();

        switch (ctx.start.getType()) {

            case VHDLLexer.EQ:
                TerminalNode eq = ctx.EQ();
                operatorModelNode.operator = eq.toString();
                break;

            case VHDLLexer.NEQ:
                TerminalNode neq = ctx.NEQ();
                operatorModelNode.operator = neq.toString();
                break;

            case VHDLLexer.GE:
                TerminalNode ge = ctx.GE();
                operatorModelNode.operator = ge.toString();
                break;

            case VHDLLexer.GREATERTHAN:
                TerminalNode gt = ctx.GREATERTHAN();
                operatorModelNode.operator = gt.toString();
                break;

            case VHDLLexer.LE:
                TerminalNode le = ctx.LE();
                operatorModelNode.operator = le.toString();
                break;

            case VHDLLexer.LOWERTHAN:
                TerminalNode lt = ctx.LOWERTHAN();
                operatorModelNode.operator = lt.toString();
                break;

            default:
                throw new RuntimeException("Unknown type: " + ctx.start.getType());
        }

        stackPush(operatorModelNode);
    }

    @Override
    public void exitRelation(VHDLParser.RelationContext ctx) {

        // System.out.println("exit relation " + ctx);

        int operatorCount = ctx.children.size() / 2;

        if (operatorCount == 0) {

            // Do nothing, let exitExpression take care of this case

        } else {

            ModelNode<?> rhs = stackPop();
            ModelNode<String> operator = (ModelNode<String>) stackPop();
            ModelNode<?> lhs = stackPop();

            Relation localExpr = new Relation();
            stackPush(localExpr);

            localExpr.operator = operator.operator;
            localExpr.name = operator.operator;
            localExpr.value = operator.operator;

            lhs.parent = localExpr;
            rhs.parent = localExpr;
            localExpr.children.add(lhs);
            localExpr.children.add(rhs);
        }
    }

    @Override
    public void exitLogical_operator(VHDLParser.Logical_operatorContext ctx) {

        Expr operatorModelNode = new Expr();
        switch (ctx.start.getType()) {

            case VHDLLexer.AND:
                operatorModelNode.value = ctx.AND().toString();
                break;

            case VHDLParser.OR:
                operatorModelNode.value = ctx.OR().toString();
                break;

            case VHDLParser.NAND:
                operatorModelNode.value = ctx.NAND().toString();
                break;

            case VHDLParser.NOR:
                operatorModelNode.value = ctx.NOR().toString();
                break;

            case VHDLParser.XOR:
                operatorModelNode.value = ctx.XOR().toString();
                break;

            case VHDLParser.XNOR:
                operatorModelNode.value = ctx.XNOR().toString();
                break;

            default:
                throw new RuntimeException("Unknown type: " + ctx.start.getType());
        }

        stackPush(operatorModelNode);
    }

    @Override
    public void exitIdentifier(VHDLParser.IdentifierContext ctx) {
        lastIdentifier = ctx.getText();
        if ((stmt != null) && (stmt instanceof Process) && sensitivityList) {

            ModelNode<String> signal = new ModelNode<>();
            signal.name = ctx.getText();
            lastProcess.sensitivityList.add(signal);
        }
    }

    @Override
    public void exitPrimary(VHDLParser.PrimaryContext ctx) {

        // System.out.println("exitPrimary: \"" + ctx.getText() + "\"");

        switch (ctx.start.getType()) {

            case VHDLParser.CHARACTER_LITERAL:
                // System.out.println("CHARACTER_LITERAL: \"" + ctx.getText() + "\"");
                CharacterLiteral characterLiteral = new CharacterLiteral();
                // characterLiteral.value = Integer.parseInt(ctx.getText().substring(1,
                // ctx.getText().length() - 1));
                characterLiteral.value = ctx.getText().substring(1, ctx.getText().length() - 1);
                stackPush(characterLiteral);
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
                stackPush(stringLiteral);
                break;

            case VHDLParser.BASIC_IDENTIFIER:
                // System.out.println("BASIC_IDENTIFIER: \"" + ctx + "\"");
                StringLiteral basicStringLiteral = new StringLiteral();
                basicStringLiteral.value = ctx.getText();

                // A function call is wrapped inside a primary.
                // If there currently is a function call processed, do not add the
                // BASIC_IDENTIFIER for that function call!
                if (!functionCall) {
                    stackPush(basicStringLiteral);
                } else {
                    functionCall = false;
                }
                break;

            case VHDLParser.INTEGER:
                NumericLiteral numericLiteral = new NumericLiteral();
                numericLiteral.value = Integer.parseInt(ctx.getText());
                stackPush(numericLiteral);
                break;

            case VHDLParser.LPAREN:
                break;

            default:
                throw new RuntimeException("Unknown type: " + ctx.start.getType());
        }
    }

    @Override
    public void exitTarget(VHDLParser.TargetContext ctx) {

        // System.out.println("exitTarget: \"" + ctx.getText() + "\"");

        switch (ctx.start.getType()) {

            case VHDLParser.CHARACTER_LITERAL:
                // System.out.println("CHARACTER_LITERAL: \"" + ctx.getText() + "\"");

                CharacterLiteral characterLiteral = new CharacterLiteral();
                // characterLiteral.value = Integer.parseInt(ctx.getText().substring(1,
                // ctx.getText().length() - 1));
                characterLiteral.value = ctx.getText().substring(1, ctx.getText().length() - 1);
                stackPush(characterLiteral);
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
                stackPush(stringLiteral);
                break;

            case VHDLParser.BASIC_IDENTIFIER:
                // System.out.println("BASIC_IDENTIFIER: \"" + ctx + "\"");
                StringLiteral basicStringLiteral = new StringLiteral();
                basicStringLiteral.value = ctx.getText();
                stackPush(basicStringLiteral);
                break;

            case VHDLParser.LPAREN:
                break;

            default:
                throw new RuntimeException("Unknown type: " + ctx.start.getType());
        }
    }

    @Override
    public void enterCondition(VHDLParser.ConditionContext ctx) {

        if (stmt instanceof IfStmtBranch) {
            stmt = (Stmt) stmt.parent;
        }

        if (stmt instanceof IfStmt) {

            IfStmt ifStmt = (IfStmt) stmt;

            IfStmtBranch ifStmtBranch = new IfStmtBranch();
            ifStmt.branches.add(ifStmtBranch);
            ifStmtBranch.parent = ifStmt;

            stmt = ifStmtBranch;

            ifStmtBranch.exprRoot = new ModelNode<String>("exprRoot");
        }
    }

    @Override
    public void exitCondition(VHDLParser.ConditionContext ctx) {

        IfStmtBranch ifStmtBranch = (IfStmtBranch) stmt;

        expr = null;

        ModelNode<?> localExpr = stackPop();
        ifStmtBranch.exprRoot.children.add(localExpr);
    }

    @Override
    public void enterIf_statement(VHDLParser.If_statementContext ctx) {

        IfStmt ifStmt = new IfStmt();
        if (stmt != null) {
            stmt.children.add(ifStmt);
            ifStmt.parent = stmt;
        }
        stmt = ifStmt;
    }

    @Override
    public void exitIf_statement(VHDLParser.If_statementContext ctx) {

        // reset on exit
        expr = null;

        // DEBUG
        stack.clear();

        astOutputListenerCallback.ifStmt(stmt);

        // stmt = stmt.parent == null ? stmt : stmt.parent;
        stmt = stmt.parent;
    }

    @Override
    public void enterSequential_statement(VHDLParser.Sequential_statementContext ctx) {
    }

    @Override
    public void exitSequential_statement(VHDLParser.Sequential_statementContext ctx) {

    }

    @Override
    public void enterSequence_of_statements(VHDLParser.Sequence_of_statementsContext ctx) {
    }

    @Override
    public void exitSequence_of_statements(VHDLParser.Sequence_of_statementsContext ctx) {

        if (stmt instanceof IfStmtBranch) {
            stmt = stmt.parent;
        }
    }

    @Override
    public void enterCase_statement(VHDLParser.Case_statementContext ctx) {

        CaseStmt caseStmt = new CaseStmt();
        if (stmt != null) {
            stmt.children.add(caseStmt);
            caseStmt.parent = stmt;
        }
        stmt = caseStmt;
    }

    @Override
    public void exitCase_statement(VHDLParser.Case_statementContext ctx) {

        // write the discriminator into the case-statement
        stmt.value = stackPop();

        // reset on exit
        expr = null;

        // DEBUG
        stack.clear();

        astOutputListenerCallback.caseStmt(stmt);

        // stmt = stmt.parent == null ? stmt : stmt.parent;
        stmt = stmt.parent;
    }

    @Override
    public void enterSimultaneous_case_statement(VHDLParser.Simultaneous_case_statementContext ctx) {

        CaseStmt caseStmt = new CaseStmt();
        if (stmt != null) {
            stmt.children.add(caseStmt);
            caseStmt.parent = stmt;
        }
        stmt = caseStmt;
    }

    @Override
    public void exitSimultaneous_case_statement(VHDLParser.Simultaneous_case_statementContext ctx) {

        // write the discriminator into the case-statement
        stmt.value = stackPop();

        // reset on exit
        expr = null;

        // DEBUG
        stack.clear();

        stmt = stmt.parent == null ? stmt : stmt.parent;
    }

    @Override
    public void enterChoice(VHDLParser.ChoiceContext ctx) {
    }

    @Override
    public void exitChoice(VHDLParser.ChoiceContext ctx) {

        // only if this is not the others case, retrieve the expression from the stack
        // The others case has no expression! It is like the else branch of an
        // if-statement which also has no expression
        if (!case_statement_alternative_others) {
            stmt.value = stackPop().value;
        }

        case_statement_alternative_others = false;
    }

    @Override
    public void enterCase_statement_alternative(VHDLParser.Case_statement_alternativeContext ctx) {

        CaseStmtBranch caseStmtBranch = new CaseStmtBranch();
        caseStmtBranch.parent = stmt;
        stmt.children.add(caseStmtBranch);
        stmt = caseStmtBranch;
    }

    @Override
    public void exitCase_statement_alternative(VHDLParser.Case_statement_alternativeContext ctx) {
        stmt = stmt.parent == null ? stmt : stmt.parent;
    }

    @Override
    public void enterFunction_call_or_indexed_name_part(VHDLParser.Function_call_or_indexed_name_partContext ctx) {

        FunctionCall localFunctionCall = new FunctionCall();
        localFunctionCall.name = lastIdentifier;

        lastFunctionCall = localFunctionCall;

        if (stmt instanceof IfStmtBranch) {

            IfStmtBranch ifStmtBranch = (IfStmtBranch) stmt;
            // ifStmtBranch.exprRoot.children.add(localFunctionCall);
            stackPush(localFunctionCall);
        }
    }

    @Override
    public void exitFunction_call_or_indexed_name_part(VHDLParser.Function_call_or_indexed_name_partContext ctx) {
        lastFunctionCall = null;
        functionCall = true;
    }

    @Override
    public void exitActual_part(VHDLParser.Actual_partContext ctx) {
        // System.out.println("Actual Parameter: \"" + ctx + "\"");

        // this code was tested with and written for a function call with several actual
        // parameters

        FunctionCallActualParameter actualParameter = new FunctionCallActualParameter();
        actualParameter.name = lastIdentifier;
        actualParameter.value = lastIdentifier;

        lastFunctionCall.children.add(actualParameter);

        // take the value from the stack so that it is not falsely processed by the
        // expression handler
        stackPop();
    }

    @Override
    public void enterProcess_statement(VHDLParser.Process_statementContext ctx) {

        Process process = new Process();
        IdentifierContext identifierContext = ctx.identifier();
        if (identifierContext != null) {
            process.name = ctx.identifier().getText();
        }

        lastProcess = process;

        if (stmt != null) {
            stmt.children.add(process);
            process.parent = stmt;
        }
        stmt = process;
    }

    @Override
    public void exitProcess_statement(VHDLParser.Process_statementContext ctx) {

        astOutputListenerCallback.process(stmt);

        stmt = stmt.parent;
    }

    @Override
    public void exitSignal_assignment_statement(VHDLParser.Signal_assignment_statementContext ctx) {
        processSignalAssignmentStatement();
    }

    @Override
    public void enterConcurrent_signal_assignment_statement(
            VHDLParser.Concurrent_signal_assignment_statementContext ctx) {
    }

    @Override
    public void exitConcurrent_signal_assignment_statement(
            VHDLParser.Concurrent_signal_assignment_statementContext ctx) {
        processSignalAssignmentStatement();
    }

    private void processSignalAssignmentStatement() {

        AssignmentStmt assignmentStmt = new AssignmentStmt();

        ModelNode<?> rhs = stackPop();
        assignmentStmt.lhs = stackPop();
        assignmentStmt.rhs = rhs;

        this.astOutputListenerCallback.signalAssignment(assignmentStmt);

        if (stmt != null) {
            stmt.children.add(assignmentStmt);
        } else {
            stmt = assignmentStmt;
        }
    }

    private void processExpression() {

        boolean done = false;
        while (!done) {

            ModelNode<?> rhs = stackPop();

            if (stack.peek() instanceof DummyNode) {

                // remove dummy node
                stackPop();

                done = true;
                stackPush(rhs);

                continue;
            }

            ModelNode<String> operator = (ModelNode<String>) stackPop();
            ModelNode<?> lhs = stackPop();

            Expr localExpr = new Expr();
            stackPush(localExpr);

            localExpr.operator = operator.value;

            lhs.parent = localExpr;
            rhs.parent = localExpr;
            localExpr.children.add(lhs);
            localExpr.children.add(rhs);

            expr = localExpr;
        }
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

        } else if (node.getText().toLowerCase().equals("others")) {

            case_statement_alternative_others = true;

        }

    }

    private void stackPush(ModelNode<?> node) {
        // System.out.println("Push: " + node.name + " " + node.value);
        stack.push(node);
    }

    private ModelNode<?> stackPop() {
        // System.out.println("Pop");
        return stack.pop();
    }
}
