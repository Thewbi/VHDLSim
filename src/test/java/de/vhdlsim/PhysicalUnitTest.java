package de.vhdlsim;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Test;

import de.vhdl.grammar.VHDLLexer;
import de.vhdl.grammar.VHDLParser;
import de.vhdl.grammar.VHDLParser.Type_declarationContext;
import de.vhdlmodel.NumericLiteral;
import de.vhdlmodel.PhysicalUnit;
import de.vhdlmodel.SubPhysicalUnit;
import de.vhdlmodel.TypeDeclaration;

public class PhysicalUnitTest {
    
    @Test
    public void testExpressionNumericLiteral() {

        final CharStream charStream = CharStreams.fromString("type time is range -2147483647 to 2147483647\r\n" + //
                        "    units\r\n" + //
                        "        fs;\r\n" + //
                        "        ps = 1000 fs;\r\n" + //
                        "        ns = 1000 ps;\r\n" + //
                        "        us = 1000 ns;\r\n" + //
                        "        ms = 1000 us;\r\n" + //
                        "        sec = 1000 ms;\r\n" + //
                        "        min = 60 sec;\r\n" + //
                        "        hr = 60 min;\r\n" + //
                        "    end units;");

        final VHDLLexer lexer = new VHDLLexer(charStream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final VHDLParser parser = new VHDLParser(tokens);

        final Type_declarationContext root = parser.type_declaration();

        ASTOutputListener astOutputListener = new ASTOutputListener();

        class cccc extends ASTOutputListenerCallbackAdapter {

            public TypeDeclaration typeDeclaration;

            @Override
            public void typeDeclaration(TypeDeclaration typeDeclaration) {
                this.typeDeclaration = typeDeclaration;
            }
        }

        cccc adpt = new cccc();
        astOutputListener.astOutputListenerCallback = adpt;

        final ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(astOutputListener, root);

        // Assert

        TypeDeclaration typeDeclaration = adpt.typeDeclaration;

        assertNotNull(typeDeclaration);

        assertEquals("time", typeDeclaration.name);

        NumericLiteral startNumericLiteral = (NumericLiteral) typeDeclaration.range.start;
        assertEquals(-2147483647, startNumericLiteral.value.intValue());

        NumericLiteral endNumericLiteral = (NumericLiteral) typeDeclaration.range.end;
        assertEquals(2147483647, endNumericLiteral.value.intValue());

        assertEquals("TO", typeDeclaration.range.rangeDirection.toString());

        PhysicalUnit physicalUnit = typeDeclaration.physicalUnit;
        assertEquals("time", physicalUnit.name);

        boolean fsFound = false;
        boolean psFound = false;
        boolean nsFound = false;
        boolean usFound = false;
        boolean msFound = false;
        boolean secFound = false;
        boolean minFound = false;
        boolean hrFound = false;

        for (SubPhysicalUnit subPhysicalUnit : physicalUnit.subPhysicalUnits.values()) {

            if (subPhysicalUnit.name.equals("fs")) {
                assertEquals(1, subPhysicalUnit.factor);
                assertNull(subPhysicalUnit.parent);
                fsFound = true;
            }

            if (subPhysicalUnit.name.equals("ps")) {
                assertEquals(1000, subPhysicalUnit.factor);
                assertEquals("fs", subPhysicalUnit.parent.name);
                psFound = true;
            }

            if (subPhysicalUnit.name.equals("ns")) {
                assertEquals(1000, subPhysicalUnit.factor);
                assertEquals("ps", subPhysicalUnit.parent.name);
                nsFound = true;
            }

            if (subPhysicalUnit.name.equals("us")) {
                assertEquals(1000, subPhysicalUnit.factor);
                assertEquals("ns", subPhysicalUnit.parent.name);
                usFound = true;
            }

            if (subPhysicalUnit.name.equals("ms")) {
                assertEquals(1000, subPhysicalUnit.factor);
                assertEquals("us", subPhysicalUnit.parent.name);
                msFound = true;
            }

            if (subPhysicalUnit.name.equals("sec")) {
                assertEquals(1000, subPhysicalUnit.factor);
                assertEquals("ms", subPhysicalUnit.parent.name);
                secFound = true;
            }

            if (subPhysicalUnit.name.equals("min")) {
                assertEquals(60, subPhysicalUnit.factor);
                assertEquals("sec", subPhysicalUnit.parent.name);
                minFound = true;
            }

            if (subPhysicalUnit.name.equals("hr")) {
                assertEquals(60, subPhysicalUnit.factor);
                assertEquals("min", subPhysicalUnit.parent.name);
                hrFound = true;
            }
        }

        assertTrue(fsFound);
        assertTrue(psFound);
        assertTrue(nsFound);
        assertTrue(usFound);
        assertTrue(msFound);
        assertTrue(secFound);
        assertTrue(minFound);
        assertTrue(hrFound);
    }

}
