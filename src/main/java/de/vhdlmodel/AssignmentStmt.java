package de.vhdlmodel;

public class AssignmentStmt extends Stmt {

    public ModelNode<?> lhs;

    public ModelNode<?> rhs;

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("assignment-stmt\n");

        indent++;
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("lhs: ").append(lhs.toString(indent));

        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("rhs: ").append(rhs.toString(indent));

        return stringBuffer.toString();
    }

}
