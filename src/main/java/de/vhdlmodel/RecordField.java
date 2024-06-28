package de.vhdlmodel;

public class RecordField extends ModelNode<String> {

    public String identifier;

    public String type;

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("RecordField: ").append(identifier).append(" ").append(type).append("\n");

        indent++;
        for (ModelNode<?> child : children) {
            RecordField recordField = (RecordField) child;
            stringBuffer.append(recordField.toString(indent));
        }

        return stringBuffer.toString();
    }
    
}
