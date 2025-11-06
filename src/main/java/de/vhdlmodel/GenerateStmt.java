package de.vhdlmodel;

import java.util.ArrayList;
import java.util.List;

public class GenerateStmt extends ModelNode<Object> {

    public String identifier;

    public List<IfStmtBranch> branches = new ArrayList<>();

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("GenerateStmt: ").append(identifier)/*.append(" ").append(type) */.append("\n");

        indent++;

        for (int i = 0; i < (indent + 1); i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("IfStmtBranch: \n");
        for (IfStmtBranch ifStmtBranchChild : branches) {
            IfStmtBranch ifStmtBranch = (IfStmtBranch) ifStmtBranchChild;
            stringBuffer.append(ifStmtBranch.toString(indent + 1));
        }

        // statements
        int index = 0;
        for (ModelNode<?> child : children) {
            stringBuffer.append(child.toString(indent));

            if (index < children.size() - 1) {
                stringBuffer.append("\n");
            }

            index++;
        }

        return stringBuffer.toString();
    }
    
}
