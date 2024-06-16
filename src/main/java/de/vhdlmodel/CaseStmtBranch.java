package de.vhdlmodel;

public class CaseStmtBranch extends Stmt {

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("case-stmt-branch ");

        if (null == value) {
            stringBuffer.append("<others>");
        } else {
            stringBuffer.append(value.toString());
        }
        stringBuffer.append("\n");

        // statements
        indent++;
        for (ModelNode child : children) {
            stringBuffer.append(child.toString(indent));
        }

        return stringBuffer.toString();
    }
}
