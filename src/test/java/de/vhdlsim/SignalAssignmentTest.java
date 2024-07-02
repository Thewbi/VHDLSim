package de.vhdlsim;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Test;

import de.vhdl.grammar.VHDLLexer;
import de.vhdl.grammar.VHDLParser;
import de.vhdl.grammar.VHDLParser.Signal_assignment_statementContext;
import de.vhdlmodel.AssignmentStmt;
import de.vhdlmodel.AssignmentType;
import de.vhdlmodel.Expr;
import de.vhdlmodel.ModelNode;

public class SignalAssignmentTest {
    
    @Test
    public void testSignalAssignment() {

        final CharStream charStream = CharStreams.fromString("read_ptr <= read_ptr + 1;");

        final VHDLLexer lexer = new VHDLLexer(charStream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final VHDLParser parser = new VHDLParser(tokens);

        final Signal_assignment_statementContext root = parser.signal_assignment_statement();

        ASTOutputListener astOutputListener = new ASTOutputListener();

        class cccc extends ASTOutputListenerCallbackAdapter {

            public AssignmentStmt assignmentStmt;

            @Override
            public void signalAssignment(AssignmentStmt assignmentStmt) {
                this.assignmentStmt = assignmentStmt;
            }
        }

        cccc adpt = new cccc();
        astOutputListener.astOutputListenerCallback = adpt;
            
        final ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(astOutputListener, root);

        // Assert

        AssignmentStmt assignmentStmt = adpt.assignmentStmt;

        AssignmentType assignmentType = assignmentStmt.assignmentType;
        assertTrue(assignmentType == AssignmentType.SIGNAL);

        ModelNode<?> lhs = assignmentStmt.lhs;
        assertEquals(lhs.value, "read_ptr");

        Expr expr = (Expr) assignmentStmt.rhs;

        assertTrue(expr.operator.equals("+"));
        assertTrue(expr.children.get(0).value.equals("read_ptr"));
        assertTrue(expr.children.get(1).value.equals(1));
    }

}
