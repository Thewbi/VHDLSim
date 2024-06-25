package de.vhdlsim;

import de.vhdlmodel.Architecture;
import de.vhdlmodel.AssignmentStmt;
import de.vhdlmodel.Component;
import de.vhdlmodel.Entity;
import de.vhdlmodel.Signal;
import de.vhdlmodel.Stmt;

public interface ASTOutputListenerCallback {

    void architecture(Architecture architecture);

    void entity(Entity entity);

    void component(Component component);

    void process(Stmt stmt);

    void ifStmt(Stmt stmt);

    void signal(Signal signal);

    void signalAssignment(AssignmentStmt assignmentStmt);

    void caseStmt(Stmt stmt);
    
}
