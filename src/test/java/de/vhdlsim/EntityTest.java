package de.vhdlsim;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Test;

import de.vhdl.grammar.VHDLLexer;
import de.vhdl.grammar.VHDLParser;
import de.vhdl.grammar.VHDLParser.Entity_declarationContext;
import de.vhdlmodel.Entity;
import de.vhdlmodel.Port;
import de.vhdlmodel.PortDirection;

public class EntityTest {

    @Test
    public void testEntity() {

        final CharStream charStream = CharStreams.fromString("entity OR_gate is\r\n" + //
                        "    port(A : in std_logic;     \r\n" + //
                        "         B : in std_logic;     \r\n" + //
                        "         Y : out std_logic); \r\n" + //
                        "end OR_gate;");

        final VHDLLexer lexer = new VHDLLexer(charStream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final VHDLParser parser = new VHDLParser(tokens);

        final Entity_declarationContext root = parser.entity_declaration();

        ASTOutputListener astOutputListener = new ASTOutputListener();

        class cccc extends ASTOutputListenerCallbackAdapter {

            public Entity entity;

            @Override
            public void entity(Entity entity) {
                this.entity = entity;
            }
        }

        cccc adpt = new cccc();
        astOutputListener.astOutputListenerCallback = adpt;
            
        final ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(astOutputListener, root);

        // Assert

        Entity entity = adpt.entity;
        assertEquals(entity.name, "OR_gate");

        Port port = entity.ports.get(0);
        assertEquals(port.name, "A");
        assertEquals(port.type, "std_logic");
        assertEquals(port.portDirection, PortDirection.IN);

        port = entity.ports.get(1);
        assertEquals(port.name, "B");
        assertEquals(port.type, "std_logic");
        assertEquals(port.portDirection, PortDirection.IN);

        port = entity.ports.get(2);
        assertEquals(port.name, "Y");
        assertEquals(port.type, "std_logic");
        assertEquals(port.portDirection, PortDirection.OUT);
    }
    
}
