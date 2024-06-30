package de.vhdlmodel;

public class AssignmentStmt extends Stmt {

    public AssignmentType assignmentType;

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
        stringBuffer.append("lhs: ").append("\n");
        
        indent++;
        stringBuffer.append(lhs.toString(indent));
        indent--;

        stringBuffer.append("\n");

        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("rhs: ").append("\n");

        indent++;
        stringBuffer.append(rhs.toString(indent));
        indent--;

        return stringBuffer.toString();
    }

}
