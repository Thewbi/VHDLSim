package de.vhdlmodel;

public class Identifier extends ModelNode<String> {

    public String toString(int indent) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append(value).append("\n");

        return stringBuffer.toString();
    }

}
