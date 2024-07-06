package de.vhdlsim;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Test;

import de.vhdl.grammar.VHDLLexer;
import de.vhdl.grammar.VHDLParser;
import de.vhdl.grammar.VHDLParser.Type_declarationContext;
import de.vhdlmodel.Record;
import de.vhdlmodel.RecordField;

public class RecordTest {
    
    @Test
    public void testRecord() {

        final CharStream charStream = CharStreams.fromString("type t_FROM_FIFO is record\r\n" + //
                        "    wr_full  : std_logic;\r\n" + //
                        "    rd_empty : std_logic;\r\n" + //
                        "end record t_FROM_FIFO;");

        final VHDLLexer lexer = new VHDLLexer(charStream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final VHDLParser parser = new VHDLParser(tokens);

        final Type_declarationContext root = parser.type_declaration();

        ASTOutputListener astOutputListener = new ASTOutputListener();

        class cccc extends ASTOutputListenerCallbackAdapter {

            public Record record;

            @Override
            public void record(Record record) {
                this.record = record;
            }
        }

        cccc adpt = new cccc();
        astOutputListener.astOutputListenerCallback = adpt;

        final ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(astOutputListener, root);

        Record record = adpt.record;
        assertEquals(record.name, "t_FROM_FIFO");

        RecordField recordField1 = (RecordField) record.children.get(0);
        assertEquals(recordField1.identifier, "wr_full");
        assertEquals(recordField1.type, "std_logic");

        RecordField recordField2 = (RecordField) record.children.get(1);
        assertEquals(recordField2.identifier, "rd_empty");
        assertEquals(recordField1.type, "std_logic");

        System.out.println("");

    }
}
