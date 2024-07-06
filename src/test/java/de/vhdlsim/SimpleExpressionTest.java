package de.vhdlsim;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Test;

import de.vhdl.grammar.VHDLLexer;
import de.vhdl.grammar.VHDLParser;
import de.vhdl.grammar.VHDLParser.Signal_assignment_statementContext;
import de.vhdl.grammar.VHDLParser.Simple_expressionContext;
import de.vhdlmodel.AssignmentStmt;
import de.vhdlmodel.AssignmentType;
import de.vhdlmodel.Expr;
import de.vhdlmodel.ModelNode;
import de.vhdlmodel.FunctionCall;
import de.vhdlmodel.FunctionCallActualParameter;
import de.vhdlmodel.NumericLiteral;

public class SimpleExpressionTest {

    @Test
    public void testSimpleExpression() {

        final CharStream charStream = CharStreams.fromString("CounterVal(Minutes => 1) + 2");

        final VHDLLexer lexer = new VHDLLexer(charStream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final VHDLParser parser = new VHDLParser(tokens);

        final Simple_expressionContext root = parser.simple_expression();

        ASTOutputListener astOutputListener = new ASTOutputListener();

        class cccc extends ASTOutputListenerCallbackAdapter {

            public ModelNode<?> expr;

            @Override
            public void expression(ModelNode<?> expr) {
                this.expr = expr;
            }
        }

        cccc adpt = new cccc();
        astOutputListener.astOutputListenerCallback = adpt;

        final ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(astOutputListener, root);

        // Assert

        ModelNode<?> expr = adpt.expr;

        assertEquals("+", expr.operator);

        FunctionCall functionCall = (FunctionCall) expr.children.get(0);
        assertEquals(functionCall.name, "CounterVal");
        FunctionCallActualParameter functionCallActualParameter = (FunctionCallActualParameter) functionCall.children.get(0);
        assertEquals(functionCallActualParameter.name, "Minutes");

        NumericLiteral numericLiteral = (NumericLiteral) expr.children.get(1);
        assertEquals(numericLiteral.value, 2);

        System.out.println("");
    }
}
