package de.vhdlmodel;

import java.beans.Statement;

public class AssignmentStmt extends Stmt {

    public ModelNode lhs;

    public ModelNode rhs;

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("assignment-stmt-branch\n");

        indent++;
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("lhs: ").append(lhs.toString(0));//.append("\n");
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("rhs: ").append(rhs.toString(0));//.append("\n");

        return stringBuffer.toString();
    }

}
