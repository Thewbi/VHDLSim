package de.vhdlsim;

import de.vhdlmodel.Architecture;
import de.vhdlmodel.AssignmentStmt;
import de.vhdlmodel.Component;
import de.vhdlmodel.Entity;
import de.vhdlmodel.Signal;
import de.vhdlmodel.Stmt;

public class DebugASTOutputListenerCallback implements ASTOutputListenerCallback {

    @Override
    public void architecture(Architecture architecture) {
        // output the AST
        int indent = 0;
        System.out.println(architecture.toString(indent));
    }

    @Override
    public void entity(Entity entity) {
        int indent = 0;
        System.out.println(entity.toString(indent));
    }

    @Override
    public void component(Component component) {
        int indent = 0;
        System.out.println(component.toString(indent));
    }

    @Override
    public void process(Stmt stmt) {
        int indent = 0;
        System.out.println(stmt.toString(indent));
    }

    @Override
    public void ifStmt(Stmt stmt) {
        int indent = 0;
        System.out.println(stmt.toString(indent));
    }

    @Override
    public void signal(Signal signal) {
        int indent = 0;
        System.out.println(signal.toString(indent));
    }

    @Override
    public void signalAssignment(AssignmentStmt assignmentStmt) {
        int indent = 0;
        System.out.println(assignmentStmt.toString(indent));
    }

    @Override
    public void caseStmt(Stmt stmt) {
        int indent = 0;
        System.out.println(stmt.toString(indent));
    }

}
