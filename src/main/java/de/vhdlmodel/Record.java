package de.vhdlmodel;

public class Record extends ModelNode<String> {

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("Record: ").append(name).append("\n");

        indent++;
        for (ModelNode<?> child : children) {
            RecordField recordField = (RecordField) child;
            stringBuffer.append(recordField.toString(indent));
        }

        return stringBuffer.toString();
    }

}
