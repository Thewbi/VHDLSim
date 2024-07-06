package de.vhdlsim;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Test;

import de.vhdl.grammar.VHDLLexer;
import de.vhdl.grammar.VHDLParser;
import de.vhdl.grammar.VHDLParser.Function_specificationContext;
import de.vhdlmodel.ActualParameter;
import de.vhdlmodel.FunctionSpecification;
import de.vhdlmodel.NumericLiteral;
import de.vhdlmodel.PortDirection;
import de.vhdlmodel.Range;

public class FunctionSpecificationTest {

    @Test
    public void testRecord() {

        final CharStream charStream = CharStreams.fromString("function Bitwise_AND (\r\n" + //
                "    Seconds : integer := 0;\r\n" + //
                "    a_vector : in std_logic_vector(3 downto 0);\r\n" + //
                "    b_vector : out std_logic_vector(4 downto 1)\r\n" + //
                ") return std_logic;");

        final VHDLLexer lexer = new VHDLLexer(charStream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final VHDLParser parser = new VHDLParser(tokens);

        final Function_specificationContext root = (Function_specificationContext) parser.function_specification();

        ASTOutputListener astOutputListener = new ASTOutputListener();

        class cccc extends ASTOutputListenerCallbackAdapter {

            public FunctionSpecification functionSpecification;

            @Override
            public void functionSpecification(FunctionSpecification functionSpecification) {
                this.functionSpecification = functionSpecification;
            }
        }

        cccc adpt = new cccc();
        astOutputListener.astOutputListenerCallback = adpt;

        final ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(astOutputListener, root);

        FunctionSpecification functionSpecification = adpt.functionSpecification;
        assertEquals(functionSpecification.name, "Bitwise_AND");
        assertEquals(functionSpecification.returnType, "std_logic");

        ActualParameter actualParameter = functionSpecification.actualParameters.get(0);
        assertEquals(actualParameter.name, "Seconds");
        assertEquals(actualParameter.subtypeIndication, "integer");
        assertEquals(actualParameter.direction, PortDirection.IN);
        assertNull(actualParameter.range);
        NumericLiteral numericLiteral = (NumericLiteral) actualParameter.expression;
        assertEquals(numericLiteral.value, 0);

        actualParameter = functionSpecification.actualParameters.get(1);
        assertEquals(actualParameter.name, "a_vector");
        assertEquals(actualParameter.subtypeIndication, "std_logic_vector");
        assertEquals(actualParameter.direction, PortDirection.IN);
        Range range = actualParameter.range;
        assertEquals(range.start.value, 3);
        assertEquals(range.end.value, 0);
        assertNull(actualParameter.expression);

        actualParameter = functionSpecification.actualParameters.get(2);
        assertEquals(actualParameter.name, "b_vector");
        assertEquals(actualParameter.subtypeIndication, "std_logic_vector");
        assertEquals(actualParameter.direction, PortDirection.OUT);
        range = actualParameter.range;
        assertEquals(range.start.value, 4);
        assertEquals(range.end.value, 1);
        assertNull(actualParameter.expression);

        System.out.println("");
    }

}
