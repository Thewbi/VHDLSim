package de.vhdlsim;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Test;

import de.vhdl.grammar.VHDLLexer;
import de.vhdl.grammar.VHDLParser;
import de.vhdl.grammar.VHDLParser.Case_statementContext;
import de.vhdlmodel.AssignmentStmt;
import de.vhdlmodel.CaseStmt;
import de.vhdlmodel.CaseStmtBranch;
import de.vhdlmodel.CharacterLiteral;
import de.vhdlmodel.ModelNode;
import de.vhdlmodel.Stmt;
import de.vhdlmodel.StringLiteral;

public class CaseStatementTest {
    
    @Test
    public void testSignalAssignment() {

        final CharStream charStream = CharStreams.fromString(
            "case Sel is\r\n" + //
            "    when \"00\" =>\r\n" + //
            "        Output2 <= Sig1;\r\n" + //
            "    when \"01\" =>\r\n" + //
            "        Output2 <= Sig2;\r\n" + //
            "    when \"10\" =>\r\n" + //
            "        Output2 <= Sig3;\r\n" + //
            "    when \"11\" =>\r\n" + //
            "        Output2 <= Sig4;\r\n" + //
            "    when others =>\r\n" + //
            "        Output2 <= (others => 'X');\r\n" + //
            "end case;");

        final VHDLLexer lexer = new VHDLLexer(charStream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final VHDLParser parser = new VHDLParser(tokens);

        final Case_statementContext root = parser.case_statement();

        ASTOutputListener astOutputListener = new ASTOutputListener();

        class cccc extends ASTOutputListenerCallbackAdapter {

            public Stmt stmt;

            @Override
            public void caseStmt(Stmt stmt) {
                this.stmt = stmt;
            }
        }

        cccc adpt = new cccc();
        astOutputListener.astOutputListenerCallback = adpt;
            
        final ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(astOutputListener, root);

        // Assert

        CaseStmt caseStmt = (CaseStmt) adpt.stmt;

        StringLiteral casePredicate = (StringLiteral) caseStmt.value;

        assertEquals(casePredicate.value, "Sel");

        List<ModelNode<?>> children = caseStmt.children;

        int index = 0;
        for (ModelNode<?> child : children) {

            CaseStmtBranch caseStmtBranch = (CaseStmtBranch) child;

            String branchIdentifier = (String) caseStmtBranch.value;

            if (index == 0) {

                assertEquals(branchIdentifier, "\"00\"");
                AssignmentStmt assignmentStmt = (AssignmentStmt) caseStmtBranch.children.get(0);
                assertEquals(((StringLiteral) assignmentStmt.lhs).value, "Output2");
                assertEquals(((StringLiteral) assignmentStmt.rhs).value, "Sig1");

            } else if (index == 1) {

                assertEquals(branchIdentifier, "\"01\"");
                AssignmentStmt assignmentStmt = (AssignmentStmt) caseStmtBranch.children.get(0);
                assertEquals(((StringLiteral) assignmentStmt.lhs).value, "Output2");
                assertEquals(((StringLiteral) assignmentStmt.rhs).value, "Sig2");

            } else if (index == 2) {

                assertEquals(branchIdentifier, "\"10\"");
                AssignmentStmt assignmentStmt = (AssignmentStmt) caseStmtBranch.children.get(0);
                assertEquals(((StringLiteral) assignmentStmt.lhs).value, "Output2");
                assertEquals(((StringLiteral) assignmentStmt.rhs).value, "Sig3");

            } else if (index == 3) {

                assertEquals(branchIdentifier, "\"11\"");
                AssignmentStmt assignmentStmt = (AssignmentStmt) caseStmtBranch.children.get(0);
                assertEquals(((StringLiteral) assignmentStmt.lhs).value, "Output2");
                assertEquals(((StringLiteral) assignmentStmt.rhs).value, "Sig4");

            } else if (index == 4) {

                assertNull(branchIdentifier);
                AssignmentStmt assignmentStmt = (AssignmentStmt) caseStmtBranch.children.get(0);
                assertEquals(((StringLiteral) assignmentStmt.lhs).value, "Output2");

                ModelNode<?> rhs = assignmentStmt.rhs;
                CharacterLiteral rhsCharacterLiteral = (CharacterLiteral) rhs;
                assertEquals(rhsCharacterLiteral.value, "X");

            }

            index++;
        }
    }

}
