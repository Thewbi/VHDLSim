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

        int branchCount = branches.size();
        int i = 1;
        for (IfStmtBranch branch : branches) {
            stringBuffer.append(branch.toString(indent));
            // do not output a newline after the last branch
            if (i < branchCount) {
                stringBuffer.append("\n");
            }
            i++;
        }

        return stringBuffer.toString();
    }

}
