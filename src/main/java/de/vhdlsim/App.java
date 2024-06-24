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
import de.vhdl.grammar.VHDLParser.Component_declarationContext;
import de.vhdl.grammar.VHDLParser.Design_fileContext;
import de.vhdl.grammar.VHDLParser.Entity_declarationContext;
import de.vhdl.grammar.VHDLParser.If_statementContext;
import de.vhdl.grammar.VHDLParser.Process_statementContext;
import de.vhdl.grammar.VHDLParser.Signal_assignment_statementContext;
import de.vhdl.grammar.VHDLParser.Signal_declarationContext;

/**
 * Use this generator to generate your testbenches:
 * https://vhdl.lapinoo.net/testbench/
 *
 */
public class App {

    public static void main(String[] args) throws IOException {

        // boolean print = false;
        boolean print = true;

        // boolean convertToAST = false;
        boolean convertToAST = true;

        // ASTOutputListener astOutputListener = testSignalDeclaration(print, convertToAST,
        // "src\\test\\resources\\vhdl_samples\\signal_declaration.vhd");

        // ASTOutputListener astOutputListener = testAssignment(print, convertToAST,
        // "src\\test\\resources\\vhdl_samples\\signal_assignment.vhd");
        
        // ASTOutputListener astOutputListener = testAssignment(print, convertToAST,
        // "src\\test\\resources\\vhdl_samples\\signal_assignment_logical.vhd");

        // ASTOutputListener astOutputListener = testIf1(print, convertToAST, "src\\test\\resources\\vhdl_samples\\if.vhd");
        
        // ASTOutputListener astOutputListener = testIf2(print, convertToAST,
        // "src\\test\\resources\\vhdl_samples\\if_complex_expression.vhd");
        
        // ASTOutputListener astOutputListener = testIf3(print, convertToAST,
        // "src\\test\\resources\\vhdl_samples\\elsif.vhd");
        
        //ASTOutputListener astOutputListener = testIf4(print, convertToAST,
        // "src\\test\\resources\\vhdl_samples\\if_with_function_predicate.vhd");

        // ASTOutputListener astOutputListener = testIf5(print, convertToAST,
        // "src\\test\\resources\\vhdl_samples\\if_with_expression.vhd");

        // ASTOutputListener astOutputListener = testCase(print, convertToAST,
        // "src\\test\\resources\\vhdl_samples\\case.vhd");

        // ASTOutputListener astOutputListener = testProcess(print, convertToAST,
        // "src\\test\\resources\\vhdl_samples\\process.vhd");

        // entity and architecture
        //
        // https://circuitdigest.com/microcontroller-projects/implementation-of-basic-logic-gates-using-vhdl-in-modelsim
        // ASTOutputListener astOutputListener = testEntity(print, convertToAST,
        // "src\\test\\resources\\vhdl_samples\\entity.vhd");

        // ASTOutputListener astOutputListener = testArchitecture(print, convertToAST,
        // "src\\test\\resources\\vhdl_samples\\architecture.vhd");

        ASTOutputListener astOutputListener = testArchitecture(print, convertToAST,
        "src\\test\\resources\\vhdl_samples\\architecture_with_process_with_if.vhd");

        // ASTOutputListener astOutputListener = testComponent(print, convertToAST,
        // "src\\test\\resources\\vhdl_samples\\component.vhd");

        // TODO: and-gate -
        // https://circuitdigest.com/microcontroller-projects/implementation-of-basic-logic-gates-using-vhdl-in-modelsim
        //ASTOutputListener astOutputListener = testEntityAndArchitecture(print, convertToAST, "src\\test\\resources\\vhdl_samples\\and_gate.vhd");

        // TODO parsing is broken!!!!
        // ASTOutputListener astOutputListener = testEntityAndArchitecture(print, convertToAST,
        // "src\\test\\resources\\vhdl_samples\\thermostat_example.vhd");

        // output the AST
        int indent = 0;
        System.out.println(astOutputListener.stmt.toString(indent));

        // https://www.mikrocontroller.net/articles/VHDL_Testbench
    }

    private static ASTOutputListener testSignalDeclaration(boolean print, boolean convertToAST, String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Signal_declarationContext root = parser.signal_declaration();

        return traverseTree(root, print, convertToAST);
    }

    private static ASTOutputListener testAssignment(boolean print, boolean convertToAST, String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Signal_assignment_statementContext root = parser.signal_assignment_statement();

        return traverseTree(root, print, convertToAST);
    }

    private static ASTOutputListener testIf1(boolean print, boolean convertToAST, String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final If_statementContext root = parser.if_statement();

        return traverseTree(root, print, convertToAST);
    }

    private static ASTOutputListener testIf2(boolean print, boolean convertToAST, String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final If_statementContext root = parser.if_statement();

        return traverseTree(root, print, convertToAST);
    }

    private static ASTOutputListener testIf3(boolean print, boolean convertToAST, String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final If_statementContext root = parser.if_statement();

        return traverseTree(root, print, convertToAST);
    }

    /**
     * https://www2.cs.sfu.ca/~ggbaker/reference/std_logic/1164/rising_edge.html
     * 
     * @param print
     * @param convertToAST
     * @throws IOException
     */
    private static ASTOutputListener testIf4(boolean print, boolean convertToAST, String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final If_statementContext root = parser.if_statement();

        return traverseTree(root, print, convertToAST);
    }

    private static ASTOutputListener testIf5(boolean print, boolean convertToAST, String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final If_statementContext root = parser.if_statement();

        return traverseTree(root, print, convertToAST);
    }

    private static ASTOutputListener testCase(boolean print, boolean convertToAST, String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Case_statementContext root = parser.case_statement();

        return traverseTree(root, print, convertToAST);
    }

    private static ASTOutputListener testProcess(boolean print, boolean convertToAST, String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Process_statementContext root = parser.process_statement();

        return traverseTree(root, print, convertToAST);
    }

    private static ASTOutputListener testEntity(boolean print, boolean convertToAST, String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Entity_declarationContext root = parser.entity_declaration();

        return traverseTree(root, print, convertToAST);
    }

    private static ASTOutputListener testArchitecture(boolean print, boolean convertToAST, String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Architecture_bodyContext root = parser.architecture_body();

        return traverseTree(root, print, convertToAST);
    }

    private static ASTOutputListener testComponent(boolean print, boolean convertToAST, String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Component_declarationContext root = parser.component_declaration();

        return traverseTree(root, print, convertToAST);
    }

    private static ASTOutputListener testEntityAndArchitecture(boolean print, boolean convertToAST, String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Design_fileContext root = parser.design_file();

        return traverseTree(root, print, convertToAST);
    }

    private static ASTOutputListener testDesignFile(boolean print, boolean convertToAST, String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Design_fileContext root = parser.design_file();

        return traverseTree(root, print, convertToAST);
    }

    private static ASTOutputListener traverseTree(final ParseTree root, boolean print, boolean convertToAST) {

        if (print) {

            VHDLRawOutputListener printListener = new VHDLRawOutputListener();

            // Create a generic parse tree walker that can trigger callbacks
            final ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(printListener, root);
        }

        ASTOutputListener astOutputListener = new ASTOutputListener();

        if (convertToAST) {

            // Create a generic parse tree walker that can trigger callbacks
            final ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(astOutputListener, root);

            // output the AST
            // int indent = 0;
            // for (ModelNode<?> stmt : astOutputListener.stmts) {
            // System.out.println(stmt.toString(indent));
            // }
            // System.out.println(astOutputListener.stmt.toString(indent));
        }

        return astOutputListener;
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
