package de.vhdlsim;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Test;

import de.vhdl.grammar.VHDLLexer;
import de.vhdl.grammar.VHDLParser;
import de.vhdl.grammar.VHDLParser.ExpressionContext;
import de.vhdlmodel.ModelNode;


public class ExpressionTest {

    @Test
    public void testExpressionNumericLiteral() {

        final CharStream charStream = CharStreams.fromString("1");

        final VHDLLexer lexer = new VHDLLexer(charStream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final VHDLParser parser = new VHDLParser(tokens);

        final ExpressionContext root = parser.expression();

        ASTOutputListener astOutputListener = new ASTOutputListener();
        final ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(astOutputListener, root);

        // Assert

        // the expression is never taken from the stack.
        // the stack has to contain the value 1
        ModelNode<?> expr = astOutputListener.stack.pop();
        assertTrue(expr.value.equals(1));
    }

    @Test
    public void testExpressionNumericAdditionOperator() {

        final CharStream charStream = CharStreams.fromString("Seconds + Minutes");

        final VHDLLexer lexer = new VHDLLexer(charStream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final VHDLParser parser = new VHDLParser(tokens);

        final ExpressionContext root = parser.expression();

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
        assertTrue(expr.operator.equals("+"));
        assertTrue(expr.children.get(0).value.equals("Seconds"));
        assertTrue(expr.children.get(1).value.equals("Minutes"));
    }

    @Test
    public void testExpressionNumericMultiplicationOperator() {

        final CharStream charStream = CharStreams.fromString("Seconds * 60");

        final VHDLLexer lexer = new VHDLLexer(charStream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final VHDLParser parser = new VHDLParser(tokens);

        final ExpressionContext root = parser.expression();

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
        assertTrue(expr.operator.equals("*"));
        assertTrue(expr.children.get(0).value.equals("Seconds"));
        assertTrue(expr.children.get(1).value.equals(60));
    }

    @Test
    public void testExpressionNumericPlusAndMultOperator() {

        final CharStream charStream = CharStreams.fromString("Seconds + Minutes * 60");

        final VHDLLexer lexer = new VHDLLexer(charStream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final VHDLParser parser = new VHDLParser(tokens);

        final ExpressionContext root = parser.expression();

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
        assertTrue(expr.operator.equals("+"));
        assertTrue(expr.children.get(0).value.equals("Seconds"));

        ModelNode<?> rhs = expr.children.get(1);
        assertTrue(rhs.operator.equals("*"));
        assertTrue(rhs.children.get(0).value.equals("Minutes"));
        assertTrue(rhs.children.get(1).value.equals(60));
    }

    @Test
    public void testExpressionNumericMinusAndMultOperator() {

        final CharStream charStream = CharStreams.fromString("TotalSeconds * ClockFrequencyHz - 1");

        final VHDLLexer lexer = new VHDLLexer(charStream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final VHDLParser parser = new VHDLParser(tokens);

        final ExpressionContext root = parser.expression();

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
        assertTrue(expr.operator.equals("-"));

        ModelNode<?> rhs = expr.children.get(0);
        assertTrue(rhs.operator.equals("*"));
        assertTrue(rhs.children.get(0).value.equals("TotalSeconds"));
        assertTrue(rhs.children.get(1).value.equals("ClockFrequencyHz"));

        assertTrue(expr.children.get(1).value.equals(1));
    }

}
