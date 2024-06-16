package de.vhdlmodel;

import java.util.ArrayList;
import java.util.List;

public class IfStmtBranch extends Stmt {

    public ModelNode<?> exprRoot;

    public List<ModelNode<?>> stmts = new ArrayList<>();

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("if-stmt-branch\n");

        indent++;
        stringBuffer.append(exprRoot.toString(indent));

        // statements
        for (ModelNode child : children) {
            stringBuffer.append(child.toString(indent));
        }

        return stringBuffer.toString();
    }
}
