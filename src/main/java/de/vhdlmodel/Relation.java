package de.vhdlmodel;

public class Relation extends ModelNode {

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("Relation ").append(operator).append("\n");

        indent++;
        for (ModelNode child : children) {
            stringBuffer.append(child.toString(indent));
        }

        return stringBuffer.toString();

    }
}
