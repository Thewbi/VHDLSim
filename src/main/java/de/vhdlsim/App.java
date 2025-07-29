package de.vhdlsim;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

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
import de.vhdl.grammar.VHDLParser.Component_instantiation_statementContext;
import de.vhdl.grammar.VHDLParser.Configuration_declarationContext;
import de.vhdl.grammar.VHDLParser.Design_fileContext;
import de.vhdl.grammar.VHDLParser.Entity_declarationContext;
import de.vhdl.grammar.VHDLParser.Enumeration_type_definitionContext;
import de.vhdl.grammar.VHDLParser.ExpressionContext;
import de.vhdl.grammar.VHDLParser.Function_specificationContext;
import de.vhdl.grammar.VHDLParser.If_statementContext;
import de.vhdl.grammar.VHDLParser.Instantiated_unitContext;
import de.vhdl.grammar.VHDLParser.Name_partContext;
import de.vhdl.grammar.VHDLParser.Physical_literalContext;
import de.vhdl.grammar.VHDLParser.Port_map_aspectContext;
import de.vhdl.grammar.VHDLParser.Process_statementContext;
import de.vhdl.grammar.VHDLParser.Range_constraintContext;
import de.vhdl.grammar.VHDLParser.Record_type_definitionContext;
import de.vhdl.grammar.VHDLParser.Signal_assignment_statementContext;
import de.vhdl.grammar.VHDLParser.Signal_declarationContext;
import de.vhdl.grammar.VHDLParser.Simple_expressionContext;
import de.vhdl.grammar.VHDLParser.Subprogram_declarative_itemContext;
import de.vhdl.grammar.VHDLParser.Type_declarationContext;
import de.vhdl.grammar.VHDLParser.Type_definitionContext;
import de.vhdl.grammar.VHDLParser.Wait_statementContext;
import de.vhdlmodel.PhysicalUnit;

/**
 * Use this generator to generate your testbenches:
 * https://vhdl.lapinoo.net/testbench/
 *
 * To test the grammar use http://lab.antlr.org/
 * top level element of the grammar is design_file
 *
 */
public class App {

    final static String PATH = "src\\test\\resources\\vhdl_samples\\";

    public static void main(String[] args) throws IOException {

        boolean print = false;
        // boolean print = true;

        // boolean convertToAST = false;
        boolean convertToAST = true;

        Map<String, PhysicalUnit> units = new HashMap<>();

        DebugASTOutputListenerCallback astOutputListenerCallback = new DebugASTOutputListenerCallback();
        astOutputListenerCallback.units = units;

        ASTOutputListener astOutputListener = new ASTOutputListener();
        astOutputListener.units = units;
        astOutputListener.astOutputListenerCallback = astOutputListenerCallback;

        // top level element of the grammar is design_file

        // @formatter:off 

        // // TODO: finish the entity Declaration statement and port map processing here
        //testArchitecture(astOutputListener, print, convertToAST, PATH + "architecture_testbench.vhd");
        testArchitecture(astOutputListener, print, convertToAST, PATH + "architecture_example_1.vhd");
        //testPhysicalUnits(astOutputListener, print, convertToAST, PATH + "physical_units.vhd");
        //testExpression(astOutputListener, print, convertToAST, PATH + "expression.vhd");
        //testSimpleExpression(astOutputListener, print, convertToAST, PATH + "simple_expression.vhd");
        //testSignalDeclaration(astOutputListener, print, convertToAST, PATH + "signal_declaration.vhd");
        //testRangeConstraint(astOutputListener, print, convertToAST, PATH + "range_constraint.vhd");
        //testAssignment(astOutputListener, print, convertToAST, PATH + "signal_assignment.vhd");
        //testAssignment(astOutputListener, print, convertToAST, PATH + "signal_assignment_logical.vhd");
        //testIf1(astOutputListener, print, convertToAST, PATH + "if.vhd");
        //testIf2(astOutputListener, print, convertToAST, PATH + "if_complex_expression.vhd");
        //testIf3(astOutputListener, print, convertToAST, PATH + "elsif.vhd");
        //testIf4(astOutputListener, print, convertToAST, PATH + "if_with_function_predicate.vhd");
        //testFunctionCall(astOutputListener, print, convertToAST, PATH + "function_call.vhd");
        //testIf5(astOutputListener, print, convertToAST, PATH + "if_with_expression.vhd");
        //testCase(astOutputListener, print, convertToAST, PATH + "case.vhd");
        //testProcess(astOutputListener, print, convertToAST, PATH + "process.vhd");
        testProcess(astOutputListener, print, convertToAST, PATH + "process_2.vhd");
        // // entity and architecture
        // //
        // https://circuitdigest.com/microcontroller-projects/implementation-of-basic-logic-gates-using-vhdl-in-modelsim
        // testEntity(astOutputListener, print, convertToAST, PATH + "entity.vhd");
        // testEntityInstantiation(astOutputListener, print, convertToAST, PATH + "entity_instantiation.vhd");
        // testPortMap(astOutputListener, print, convertToAST, PATH + "port_map.vhd");
        // testInstantiatedUnit(astOutputListener, print, convertToAST, PATH + "instantiated_unit.vhd");
        // testArchitecture(astOutputListener, print, convertToAST, PATH + "architecture.vhd");
        // // TODO: implement port map
        // testArchitecture(astOutputListener, print, convertToAST, PATH + "architecture_with_signal.vhd");
        // testArchitecture(astOutputListener, print, convertToAST, PATH + "architecture_with_process_with_if.vhd");
        // testComponent(astOutputListener, print, convertToAST, PATH + "component.vhd");
        // testRecord(astOutputListener, print, convertToAST, PATH + "record.vhd");
        // testFunctionSpecification(astOutputListener, print, convertToAST, PATH + "function_specification.vhd");
        // TODO unit test
        // testFunctionImplementation(astOutputListener, print, convertToAST, PATH + "function_implementation.vhd");
        // // and-gate
        // //https://circuitdigest.com/microcontroller-projects/implementation-of-basic-logic-gates-using-vhdl-in-modelsim
        // testEntityAndArchitecture(astOutputListener, print, convertToAST, PATH + "and_gate.vhd");
        // testEntityAndArchitecture(astOutputListener, print, convertToAST, PATH + "multiplexer.vhd");
        // testEntityAndArchitecture(astOutputListener, print, convertToAST, PATH + "thermostat_example.vhd");
        // testEnum(astOutputListener, print, convertToAST, PATH + "enum.vhd");
        // testConfiguration(astOutputListener, print, convertToAST, PATH + "configuration.vhd");
        // testWaitStatement(astOutputListener, print, convertToAST, PATH + "wait_for_time_unit_statement.vhd");
        // // DEBUG output the AST from the stmt inside the astOutputListener
        // int indent = 0;
        // System.out.println(astOutputListener.stmt.toString(indent));

        // @formatter:on

        if (astOutputListener.stmt != null) {
            throw new RuntimeException("listener is not keeping house correctly!");
        }

        // https://www.mikrocontroller.net/articles/VHDL_Testbench
    }

    private static ASTOutputListener testFunctionCall(ASTOutputListener astOutputListener, boolean print,
            boolean convertToAST,
            String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Simple_expressionContext root = parser.simple_expression();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testConfiguration(final ASTOutputListener astOutputListener,
            final boolean print, final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Configuration_declarationContext root = parser.configuration_declaration();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testExpression(final ASTOutputListener astOutputListener,
            final boolean print, final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final ExpressionContext root = parser.expression();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testSimpleExpression(final ASTOutputListener astOutputListener,
            final boolean print, final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Simple_expressionContext root = parser.simple_expression();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testSignalDeclaration(final ASTOutputListener astOutputListener,
            final boolean print, final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Signal_declarationContext root = parser.signal_declaration();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testRangeConstraint(final ASTOutputListener astOutputListener,
            final boolean print, final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Range_constraintContext root = parser.range_constraint();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testAssignment(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Signal_assignment_statementContext root = parser.signal_assignment_statement();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testIf1(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final If_statementContext root = parser.if_statement();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testIf2(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final If_statementContext root = parser.if_statement();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testIf3(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final If_statementContext root = parser.if_statement();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testIf4(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile) throws IOException {

        // https://www2.cs.sfu.ca/~ggbaker/reference/std_logic/1164/rising_edge.html

        final VHDLParser parser = processFile(testFile);
        final If_statementContext root = parser.if_statement();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testIf5(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final If_statementContext root = parser.if_statement();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testCase(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Case_statementContext root = parser.case_statement();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testProcess(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Process_statementContext root = parser.process_statement();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testEntity(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Entity_declarationContext root = parser.entity_declaration();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    /**
     * A entity instantiation is a component instantiation statement
     */
    private static ASTOutputListener testEntityInstantiation(final ASTOutputListener astOutputListener,
            final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Component_instantiation_statementContext root = parser.component_instantiation_statement();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testPortMap(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Port_map_aspectContext root = parser.port_map_aspect();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testInstantiatedUnit(final ASTOutputListener astOutputListener,
            final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Instantiated_unitContext root = parser.instantiated_unit();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testArchitecture(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Architecture_bodyContext root = parser.architecture_body();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testComponent(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Component_declarationContext root = parser.component_declaration();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testRecord(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Type_declarationContext root = parser.type_declaration();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testFunctionSpecification(final ASTOutputListener astOutputListener,
            final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Function_specificationContext root = parser.function_specification();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testFunctionImplementation(final ASTOutputListener astOutputListener,
            final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Subprogram_declarative_itemContext root = parser.subprogram_declarative_item();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testEntityAndArchitecture(final ASTOutputListener astOutputListener,
            final boolean print, final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Design_fileContext root = parser.design_file();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testEnum(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Type_declarationContext root = parser.type_declaration();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testDesignFile(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Design_fileContext root = parser.design_file();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testWaitStatement(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Wait_statementContext root = parser.wait_statement();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testPhysicalUnits(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Type_declarationContext root = parser.type_declaration();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener traverseTree(final ASTOutputListener astOutputListener, final ParseTree root,
            final boolean print, final boolean convertToAST, final String originalFilename)
            throws FileNotFoundException {

        if (print) {

            VHDLRawOutputListener printListener = new VHDLRawOutputListener();

            // Create a generic parse tree walker that can trigger callbacks
            final ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(printListener, root);

            // exchange the extension from .vhd to .pt (pt == parse tree)
            int indexOfLastDot = originalFilename.lastIndexOf(".");
            String newFileName = originalFilename.substring(0, indexOfLastDot) + ".pt";

            try (PrintWriter out = new PrintWriter(newFileName)) {
                out.println(printListener.stringBuilder.toString());
            }
        }

        if (convertToAST) {

            System.out.println("");
            System.out.println("AST GENERATION:");

            // create a generic parse tree walker that can trigger callbacks
            final ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(astOutputListener, root);

            // DEBUG output the AST
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
