package de.vhdlmodel;

public class BitStringLiteral extends ModelNode<String> {

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();

        // indent
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append(value).append("\n");

        return stringBuffer.toString();
    }

}
