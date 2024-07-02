package de.vhdlmodel;

public class Relation extends ModelNode<Object> {

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("Relation ").append(operator).append("\n");

        indent++;

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
