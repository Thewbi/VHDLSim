package de.vhdlmodel;

public class CaseStmt extends Stmt {

    // public ModelNode<?> expr = new ModelNode();

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("case-stmt expr: ").append(((ModelNode) value).toString(0)); //.append("\n");

        indent++;
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("alternatives:\n");

        indent++;
        for (ModelNode alternative : children) {
            stringBuffer.append(alternative.toString(indent));
        }

        return stringBuffer.toString();
    }

}
