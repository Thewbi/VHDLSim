package de.vhdlmodel;

public class CaseStmt extends Stmt {

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("case-stmt expr: ").append(((ModelNode) value).toString(0)).append("\n");

        indent++;
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("alternatives:\n");

        indent++;

        int index = 0;
        for (ModelNode<?> alternative : children) {

            stringBuffer.append(alternative.toString(indent));

            if (index < children.size() - 1) {
                stringBuffer.append("\n");
            }

            index++;
        }

        return stringBuffer.toString();
    }

}
