package de.vhdlmodel;

import java.util.ArrayList;
import java.util.List;

public class IfStmt extends Stmt {

    public List<IfStmtBranch> branches = new ArrayList<>();

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("if-stmt\n");

        indent++;
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("branches:\n");

        indent++;
        for (IfStmtBranch branch : branches) {
            stringBuffer.append(branch.toString(indent));
        }

        return stringBuffer.toString();
    }

}
