package de.vhdlsim;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTree;

import de.vhdl.grammar.VHDLLexer;
import de.vhdl.grammar.VHDLParser;
import de.vhdl.grammar.VHDLParser.Architecture_bodyContext;
import de.vhdl.grammar.VHDLParser.Case_statementContext;
import de.vhdl.grammar.VHDLParser.Entity_declarationContext;
import de.vhdl.grammar.VHDLParser.If_statementContext;
import de.vhdl.grammar.VHDLParser.Process_statementContext;
import de.vhdl.grammar.VHDLParser.Signal_assignment_statementContext;

/**
 * Use this generator to generate your testbenches: https://vhdl.lapinoo.net/testbench/
 *
 */
public class App {

    public static void main(String[] args) throws IOException {

        //boolean print = false;
        boolean print = true;

        //boolean convertToAST = false;
        boolean convertToAST = true;

        //testAssignment(print, convertToAST, "src\\test\\resources\\vhdl_samples\\signal_assignment.vhd");
        //testAssignment(print, convertToAST, "src\\test\\resources\\vhdl_samples\\signal_assignment_logical.vhd");
        
        //testIf1(print, convertToAST, "src\\test\\resources\\vhdl_samples\\if.vhd");
        //testIf2(print, convertToAST, "src\\test\\resources\\vhdl_samples\\if_complex_expression.vhd");
        //testIf3(print, convertToAST, "src\\test\\resources\\vhdl_samples\\elsif.vhd");

        //testIf4(print, convertToAST, "src\\test\\resources\\vhdl_samples\\if_with_function_predicate.vhd");
        
        //testCase(print, convertToAST, "src\\test\\resources\\vhdl_samples\\case.vhd");

        //testProcess(print, convertToAST, "src\\test\\resources\\vhdl_samples\\process.vhd");

        // entity and architecture
        //
        // https://circuitdigest.com/microcontroller-projects/implementation-of-basic-logic-gates-using-vhdl-in-modelsim
        //testEntity(print, convertToAST, "src\\test\\resources\\vhdl_samples\\entity.vhd");
        
        // TODO: statements are missing
        testArchitecture(print, convertToAST, "src\\test\\resources\\vhdl_samples\\architecture.vhd");

        // TODO: and-gate - https://circuitdigest.com/microcontroller-projects/implementation-of-basic-logic-gates-using-vhdl-in-modelsim
        //testAndGate(print, convertToAST, "src\\test\\resources\\vhdl_samples\\and_gate.vhd");

        // https://www.mikrocontroller.net/articles/VHDL_Testbench
    }

    private static void testAssignment(boolean print, boolean convertToAST, String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Signal_assignment_statementContext root = parser.signal_assignment_statement();

        traverseTree(root, print, convertToAST);
    }

    private static void testIf1(boolean print, boolean convertToAST, String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final If_statementContext root = parser.if_statement();

        traverseTree(root, print, convertToAST);
    }
    private static void testIf2(boolean print, boolean convertToAST, String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final If_statementContext root = parser.if_statement();

        traverseTree(root, print, convertToAST);
    }
    private static void testIf3(boolean print, boolean convertToAST, String testFile) throws IOException {
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
    private static void testIf4(boolean print, boolean convertToAST, String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final If_statementContext root = parser.if_statement();

        traverseTree(root, print, convertToAST);
    }

    private static void testCase(boolean print, boolean convertToAST, String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Case_statementContext root = parser.case_statement();

        traverseTree(root, print, convertToAST);
    }

    private static void testProcess(boolean print, boolean convertToAST, String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Process_statementContext root = parser.process_statement();

        traverseTree(root, print, convertToAST);
    }

    private static void testEntity(boolean print, boolean convertToAST, String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Entity_declarationContext root = parser.entity_declaration();

        traverseTree(root, print, convertToAST);
    }

    private static void testArchitecture(boolean print, boolean convertToAST, String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Architecture_bodyContext root = parser.architecture_body();

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

            // output the AST
            int indent = 0;
            // for (ModelNode<?> stmt : astOutputListener.stmts) {
            //     System.out.println(stmt.toString(indent));
            // }
            System.out.println(astOutputListener.stmt.toString(indent));
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
