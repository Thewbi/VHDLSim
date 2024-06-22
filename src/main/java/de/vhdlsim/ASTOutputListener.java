package de.vhdlsim;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import de.vhdl.grammar.VHDLLexer;
import de.vhdl.grammar.VHDLParser;
import de.vhdl.grammar.VHDLParser.Adding_operatorContext;
import de.vhdl.grammar.VHDLParser.Relational_operatorContext;
import de.vhdl.grammar.VHDLParserBaseListener;
import de.vhdlmodel.Architecture;
import de.vhdlmodel.AssignmentStmt;
import de.vhdlmodel.CaseStmt;
import de.vhdlmodel.CaseStmtBranch;
import de.vhdlmodel.CharacterLiteral;
import de.vhdlmodel.Entity;
import de.vhdlmodel.Expr;
import de.vhdlmodel.FunctionCall;
import de.vhdlmodel.FunctionCallActualParameter;
import de.vhdlmodel.IfStmt;
import de.vhdlmodel.IfStmtBranch;
import de.vhdlmodel.ModelNode;
import de.vhdlmodel.DummyNode;
import de.vhdlmodel.NumericLiteral;
import de.vhdlmodel.Port;
import de.vhdlmodel.PortDirection;
import de.vhdlmodel.Relation;
import de.vhdlmodel.Stmt;
import de.vhdlmodel.StringLiteral;
import de.vhdlmodel.Process;

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

    private Stack<ModelNode<?>> stack = new Stack<>();

    private boolean case_statement_alternative_others;

    private String lastIdentifier;

    private FunctionCall lastFunctionCall;

    private Process lastProcess;

    private boolean sensitivityList;

    private Entity entity;

    private Architecture architecture;

    @Override
    public void enterArchitecture_body(VHDLParser.Architecture_bodyContext ctx) {

        String architectureName = null;
        String entityName = null;

        System.out.println(ctx.getText());

        ParseTree child1 = ctx.getChild(0); // ARCHITECTURE (TOKEN)
        ParseTree child2 = ctx.getChild(1); // architecture identifier
        architectureName = child2.getText();

        ParseTree child3 = ctx.getChild(2); // OF (TOKEN)
        ParseTree child4 = ctx.getChild(3); // entitiy identifier
        entityName = child4.getText();

        ParseTree child5 = ctx.getChild(4); // IS (TOKEN)

        ParseTree child6 = ctx.getChild(5); // architecture_declarative_part
        System.out.println(child6.getText());

        ParseTree child7 = ctx.getChild(6); // BEGIN (TOKEN)
        System.out.println(child7.getText());

        ParseTree child8 = ctx.getChild(7); // inner source code inside the architecture
        System.out.println(child8.getText());

        ParseTree child9 = ctx.getChild(8); // END (TOKEN)
        System.out.println(child9.getText());
        ParseTree child10 = ctx.getChild(9); // architecture identifier (see child 2)
        System.out.println(child10.getText());
        ParseTree child11 = ctx.getChild(10); // semicolon (TOKEN)
        System.out.println(child11.getText());

        // for (int i = 0; i < ctx.getChildCount(); i++) {
        // System.out.println(ctx.getChild(i).getText());
        // }

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
        stmt = architecture.parent != null ? architecture.parent : architecture;
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

        entity.name = ctx.identifier().get(0).getText();
    }

    @Override
    public void enterInterface_port_declaration(VHDLParser.Interface_port_declarationContext ctx) {

        String identifier = ctx.identifier_list().getChild(0).getText();

        String type = ctx.subtype_indication().getText();

        String mode = ctx.signal_mode().getText();

        Port port = new Port();
        entity.ports.add(port);

        port.name = identifier;
        port.type = type;
        port.portDirection = PortDirection.fromString(mode);
    }

    @Override
    public void exitEntity_declaration(VHDLParser.Entity_declarationContext ctx) {
        stmt = entity.parent != null ? entity.parent : entity;
        entity = null;
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
    public void exitSimple_expression(VHDLParser.Simple_expressionContext ctx) {

        List<Adding_operatorContext> addingOperators = ctx.adding_operator();

    }

    @Override
    public void enterAdding_operator(VHDLParser.Adding_operatorContext ctx) {
    }

    @Override
    public void exitAdding_operator(VHDLParser.Adding_operatorContext ctx) {

        // if (addingOperators.size() == 0) {
        // return;
        // }

        // if (addingOperators.size() == 1) {

        // ModelNode<?> rhs = stackPop();
        // ModelNode<?> lhs = stackPop();

        // if (lhs.parent != null) {
        // throw new RuntimeException("Has parent!");
        // }
        // if (rhs.parent != null) {
        // throw new RuntimeException("Has parent!");
        // }

        // Expr localExpr = new Expr();
        // stackPush(localExpr);

        // lhs.parent = localExpr;
        // rhs.parent = localExpr;
        // localExpr.children.add(lhs);
        // localExpr.children.add(rhs);

        Expr operatorModelNode = new Expr();

        // for (Adding_operatorContext adding_operatorContext : ctx.addingOperators) {

        switch (ctx.start.getType()) {

            case VHDLLexer.PLUS:
                operatorModelNode.value = "+";
                break;

            case VHDLLexer.MINUS:
                operatorModelNode.value = "-";
                break;
        }
        // }

        stackPush(operatorModelNode);

        // return;
        // }

        // throw new RuntimeException("How to deal with this case?");
    }

    @Override
    public void enterExpression(VHDLParser.ExpressionContext ctx) {
        System.out.println("enter expression " + ctx);

        // a dummy node is entered to mark the bottom of the stack where
        // the current expression stops. Without marking the end of the expression stack
        // it becomes excessively hard to visit expressions because the expression element
        // is used in so many contexts that it is not always clear how to combine elements.
        stack.push(new DummyNode());
    }

    @Override
    public void exitExpression(VHDLParser.ExpressionContext ctx) {

        System.out.println("exit expression " + ctx);

        // if (ctx.children.size() == 1) {
        //     return;
        // }

        boolean done = false;
        while (!done) {

            ModelNode<?> rhs = stackPop();

            //if (stack.size() < 2) {
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

            // add this expression into the exression root created in enterCondition()
            // expr.children.add(localExpr);

            expr = localExpr;
        }

    }

    @Override
    public void enterRelational_operator(VHDLParser.Relational_operatorContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation does nothing.
     * </p>
     */
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

        System.out.println("exit relation " + ctx);

        int operatorCount = ctx.children.size() / 2;

        if (operatorCount == 0) {

            // Do nothing, let exitExpression take care of this case

            // ModelNode<String> localExpr2 = new ModelNode<>();
            // stackPush(localExpr2);

            // localExpr2.value = ctx.getText();
            // localExpr2.name = ctx.getText();

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

            // Relational_operatorContext relational_operatorContext =
            // ctx.relational_operator();
            // if (relational_operatorContext != null) {

            // Relation newRelation = new Relation();
            // ModelNode<?> oldExpr = expr;

            // // parent
            // newRelation.parent = oldExpr;

            // // child
            // oldExpr.children.add(newRelation);

            // expr = newRelation;

            // switch (relational_operatorContext.start.getType()) {

            // case VHDLLexer.EQ:
            // TerminalNode eq = relational_operatorContext.EQ();
            // expr.operator = eq.toString();
            // break;

            // case VHDLLexer.NEQ:
            // TerminalNode neq = relational_operatorContext.NEQ();
            // expr.operator = neq.toString();
            // break;

            // case VHDLLexer.GE:
            // TerminalNode ge = relational_operatorContext.GE();
            // expr.operator = ge.toString();
            // break;

            // case VHDLLexer.GREATERTHAN:
            // TerminalNode gt = relational_operatorContext.GREATERTHAN();
            // expr.operator = gt.toString();
            // break;

            // case VHDLLexer.LE:
            // TerminalNode le = relational_operatorContext.LE();
            // expr.operator = le.toString();
            // break;

            // case VHDLLexer.LOWERTHAN:
            // TerminalNode lt = relational_operatorContext.LOWERTHAN();
            // expr.operator = lt.toString();
            // break;

            // default:
            // throw new RuntimeException("Unknown type: " +
            // relational_operatorContext.start.getType());
            // }

            // stackPush(expr);

            // // ModelNode rhs = stackPop();
            // // expr.children.add(stackPop());
            // // expr.children.add(rhs);
            // }
        }
    }

    @Override
    public void exitLogical_operator(VHDLParser.Logical_operatorContext ctx) {

        // Expr localExpr = null;

        // if (expr instanceof Relation) {

        // localExpr = new Expr();
        // ModelNode<?> oldExpr = expr;

        // // parent
        // ModelNode<?> parent = oldExpr.parent;
        // if (parent != null) {
        // parent.children.remove(oldExpr);
        // parent.children.add(localExpr);
        // localExpr.parent = parent;
        // }

        // // children
        // oldExpr.parent = localExpr;
        // localExpr.children.add(oldExpr);

        // expr = localExpr;

        // } else if (expr instanceof Expr) {

        // throw new RuntimeException();

        // }

        // if (expr == null) {
        // ModelNode<?> rhs = stackPop();
        // ModelNode<?> lhs = stackPop();

        // if (lhs.parent != null) {
        // throw new RuntimeException("Has parent!");
        // }
        // if (rhs.parent != null) {
        // throw new RuntimeException("Has parent!");
        // }

        // localExpr = new Expr();
        // stackPush(localExpr);

        // lhs.parent = localExpr;
        // rhs.parent = localExpr;
        // localExpr.children.add(lhs);
        // localExpr.children.add(rhs);
        // }

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
                stackPush(basicStringLiteral);
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
            // expr = ifStmtBranch.exprRoot;
        }
    }

    @Override
    public void exitCondition(VHDLParser.ConditionContext ctx) {
        IfStmtBranch ifStmtBranch = (IfStmtBranch) stmt;

        // ifStmtBranch.exprRoot.children.add(expr);
        expr = null;
        // stmt = ifStmtBranch.parent;

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

        stmt = stmt.parent == null ? stmt : stmt.parent;
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

        System.out.println("FunctionCall: \"" + lastIdentifier + "\"");

        FunctionCall functionCall = new FunctionCall();
        functionCall.name = lastIdentifier;

        lastFunctionCall = functionCall;

        if (stmt instanceof IfStmtBranch) {

            IfStmtBranch ifStmtBranch = (IfStmtBranch) stmt;
            ifStmtBranch.exprRoot.children.add(functionCall);
        }
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

        stackPop();
    }

    @Override
    public void enterProcess_statement(VHDLParser.Process_statementContext ctx) {

        System.out.println("ProcessStatement: \"" + lastIdentifier + "\"");

        Process process = new Process();
        process.name = lastIdentifier;

        lastProcess = process;

        if (stmt != null) {
            stmt.children.add(process);
            process.parent = stmt;
        }
        stmt = process;
    }

    @Override
    public void exitProcess_statement(VHDLParser.Process_statementContext ctx) {
        stmt = stmt.parent == null ? stmt : stmt.parent;
    }

    @Override
    public void exitSignal_assignment_statement(VHDLParser.Signal_assignment_statementContext ctx) {

        AssignmentStmt assignmentStmt = new AssignmentStmt();

        ModelNode<?> rhs = stackPop();
        assignmentStmt.lhs = stackPop();
        assignmentStmt.rhs = rhs;

        // System.out.println(assignmentStmt.toString(1));

        if (stmt != null) {
            stmt.children.add(assignmentStmt);
        } else {
            stmt = assignmentStmt;
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
        System.out.println("Push: " + node.name + " " + node.value);
        stack.push(node);
    }

    private ModelNode<?> stackPop() {
        System.out.println("Pop");
        return stack.pop();
    }
}
