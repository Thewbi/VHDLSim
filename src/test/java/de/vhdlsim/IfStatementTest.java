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
import de.vhdl.grammar.VHDLParser.If_statementContext;
import de.vhdl.grammar.VHDLParser.Signal_assignment_statementContext;
import de.vhdlmodel.AssignmentStmt;
import de.vhdlmodel.AssignmentType;
import de.vhdlmodel.Expr;
import de.vhdlmodel.IfStmt;
import de.vhdlmodel.IfStmtBranch;
import de.vhdlmodel.ModelNode;
import de.vhdlmodel.Relation;
import de.vhdlmodel.Stmt;

public class IfStatementTest {
    
    @Test
    public void testSignalAssignment() {

        final CharStream charStream = CharStreams.fromString(
            "if Fifo_valid = '1' then\r\n" + //
                        "    read_ptr <= read_ptr + 1;\r\n" + //
                        "    a <= b + 2;\r\n" + //
                        "end if;");

        final VHDLLexer lexer = new VHDLLexer(charStream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final VHDLParser parser = new VHDLParser(tokens);

        final If_statementContext root = parser.if_statement();

        ASTOutputListener astOutputListener = new ASTOutputListener();

        class cccc extends ASTOutputListenerCallbackAdapter {

            public Stmt stmt;

            @Override
            public void ifStmt(Stmt stmt) {
                this.stmt = stmt;
            }
        }

        cccc adpt = new cccc();
        astOutputListener.astOutputListenerCallback = adpt;
            
        final ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(astOutputListener, root);

        // Assert

        IfStmt ifStmt = (IfStmt) adpt.stmt;

        IfStmtBranch ifStmtBranch = ifStmt.branches.get(0);

        // if condition
        ModelNode<?> condition = ifStmtBranch.exprRoot;
        Relation relation = (Relation) condition.children.get(0);

        assertEquals(relation.operator, "=");

        assertEquals(relation.children.get(0).value, "Fifo_valid");
        assertEquals(relation.children.get(1).value, "1");

        System.out.println("");

        // statement 1
        AssignmentStmt assignmentStmt = (AssignmentStmt) ifStmtBranch.children.get(0);
        assertTrue(assignmentStmt.assignmentType == AssignmentType.SIGNAL);

        ModelNode<?> lhs = assignmentStmt.lhs;
        assertEquals(lhs.value, "read_ptr");

        Expr expr = (Expr) assignmentStmt.rhs;
        assertTrue(expr.operator.equals("+"));
        assertTrue(expr.children.get(0).value.equals("read_ptr"));
        assertTrue(expr.children.get(1).value.equals(1));

        // statement 2
        assignmentStmt = (AssignmentStmt) ifStmtBranch.children.get(1);
        assertTrue(assignmentStmt.assignmentType == AssignmentType.SIGNAL);

        lhs = assignmentStmt.lhs;
        assertEquals(lhs.value, "a");

        expr = (Expr) assignmentStmt.rhs;
        assertTrue(expr.operator.equals("+"));
        assertTrue(expr.children.get(0).value.equals("b"));
        assertTrue(expr.children.get(1).value.equals(2));
    }

}
