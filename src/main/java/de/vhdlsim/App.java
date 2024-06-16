package de.vhdlsim;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import de.vhdl.grammar.VHDLLexer;
import de.vhdl.grammar.VHDLParser;
import de.vhdl.grammar.VHDLParser.Design_fileContext;
import de.vhdl.grammar.VHDLParser.If_statementContext;
import de.vhdlmodel.ModelNode;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) throws IOException {
        // String testFile = "src/test/resources/system_verilog_samples/package.sv";
        // String testFile =
        // "C:\\Users\\wolfg\\dev\\fpga\\Processor-UART-VHDL\\Code\\memory.vhd";
        // String testFile = "VHDLSim\\src\\test\\resources\\vhdl_samples\\if.vhd";
        String testFile = "VHDLSim\\src\\test\\resources\\vhdl_samples\\if_complex_expression.vhd";
        //String testFile = "VHDLSim\\src\\test\\resources\\vhdl_samples\\elsif.vhd";

        System.out.println("Loading: \"" + testFile + "\"");

        final CharStream charStream = CharStreams.fromFileName(testFile);

        final VHDLLexer lexer = new VHDLLexer(charStream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);

        System.out.println("Parsing ...");
        System.out.println("");

        final VHDLParser parser = new VHDLParser(tokens);

        // entire .vhd file
        // final Design_fileContext root = parser.design_file();

        // if statement
        final If_statementContext root = parser.if_statement();

        boolean print = false;
        //boolean print = true;
        if (print) {

            VHDLRawOutputListener printListener = new VHDLRawOutputListener();

            // Create a generic parse tree walker that can trigger callbacks
            final ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(printListener, root);
        }

        //boolean convertToAST = false;
         boolean convertToAST = true;
        if (convertToAST) {
            ASTOutputListener astOutputListener = new ASTOutputListener();

            // Create a generic parse tree walker that can trigger callbacks
            final ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(astOutputListener, root);

            System.out.println(astOutputListener);

            int indent = 0;
            for (ModelNode stmt : astOutputListener.stmts) {

                System.out.println(stmt.toString(indent));
                
            }
        }
    }
}
