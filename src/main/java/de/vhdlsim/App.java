package de.vhdlsim;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTree;

import de.vhdl.grammar.VHDLLexer;
import de.vhdl.grammar.VHDLParser;
import de.vhdl.grammar.VHDLParser.Case_statementContext;
import de.vhdl.grammar.VHDLParser.Design_fileContext;
import de.vhdl.grammar.VHDLParser.If_statementContext;
import de.vhdl.grammar.VHDLParser.Process_statementContext;
import de.vhdl.grammar.VHDLParser.Signal_assignment_statementContext;
import de.vhdlmodel.ModelNode;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) throws IOException {

        boolean print = false;
        //boolean print = true;

        //boolean convertToAST = false;
        boolean convertToAST = true;

        testAssignment(print, convertToAST);
        
        testIf1(print, convertToAST);
        testIf2(print, convertToAST);
        testIf3(print, convertToAST);
        testIf4(print, convertToAST);
        
        testProcess(print, convertToAST);
        
        testCase(print, convertToAST);
    }

    private static void testAssignment(boolean print, boolean convertToAST) throws IOException {

        String testFile = "src\\test\\resources\\vhdl_samples\\signal_assignment.vhd";
        final VHDLParser parser = processFile(testFile);
        final Signal_assignment_statementContext root = parser.signal_assignment_statement();

        traverseTree(root, print, convertToAST);
    }

    private static void testIf1(boolean print, boolean convertToAST) throws IOException {
        
        String testFile = "src\\test\\resources\\vhdl_samples\\if.vhd";
        final VHDLParser parser = processFile(testFile);
        final If_statementContext root = parser.if_statement();

        traverseTree(root, print, convertToAST);
    }
    private static void testIf2(boolean print, boolean convertToAST) throws IOException {
        
        String testFile = "src\\test\\resources\\vhdl_samples\\if_complex_expression.vhd";
        final VHDLParser parser = processFile(testFile);
        final If_statementContext root = parser.if_statement();

        traverseTree(root, print, convertToAST);
    }
    private static void testIf3(boolean print, boolean convertToAST) throws IOException {
        
        String testFile = "src\\test\\resources\\vhdl_samples\\elsif.vhd";
        final VHDLParser parser = processFile(testFile);
        final If_statementContext root = parser.if_statement();

        traverseTree(root, print, convertToAST);
    }
    /**
     * https://www2.cs.sfu.ca/~ggbaker/reference/std_logic/1164/rising_edge.html
     * 
     * @param print
     * @param convertToAST
     * @throws IOException
     */
    private static void testIf4(boolean print, boolean convertToAST) throws IOException {
        
        String testFile = "src\\test\\resources\\vhdl_samples\\if_with_function_predicate.vhd";
        final VHDLParser parser = processFile(testFile);
        final If_statementContext root = parser.if_statement();

        traverseTree(root, print, convertToAST);
    }

    private static void testProcess(boolean print, boolean convertToAST) throws IOException {

        String testFile = "src\\test\\resources\\vhdl_samples\\process.vhd";
        final VHDLParser parser = processFile(testFile);
        final Process_statementContext root = parser.process_statement();

        traverseTree(root, print, convertToAST);
    }

    private static void testCase(boolean print, boolean convertToAST) throws IOException {
        
        String testFile = "src\\test\\resources\\vhdl_samples\\case.vhd";
        final VHDLParser parser = processFile(testFile);
        final Case_statementContext root = parser.case_statement();

        traverseTree(root, print, convertToAST);
    }

    private static void traverseTree(final ParseTree root, boolean print, boolean convertToAST) {
        
        if (print) {

            VHDLRawOutputListener printListener = new VHDLRawOutputListener();

            // Create a generic parse tree walker that can trigger callbacks
            final ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(printListener, root);
        }
        
        if (convertToAST) {
            
            ASTOutputListener astOutputListener = new ASTOutputListener();

            // Create a generic parse tree walker that can trigger callbacks
            final ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(astOutputListener, root);

            int indent = 0;
            for (ModelNode<?> stmt : astOutputListener.stmts) {

                System.out.println(stmt.toString(indent));
                
            }
        }
    }

    private static VHDLParser processFile(String testFile) throws IOException {

        System.out.println("Loading: \"" + testFile + "\"");

        final CharStream charStream = CharStreams.fromFileName(testFile);

        final VHDLLexer lexer = new VHDLLexer(charStream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final VHDLParser parser = new VHDLParser(tokens);

        return parser;
    }
}
