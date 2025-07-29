package de.vhdlmodel;

public class WaveFormElement extends ModelNode<Object> {

    public NumericLiteral numericLiteral;

    public String separator;

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("WaveFormElement - ").append(value).append(" ").append(separator).append(" ").append(numericLiteral.value).append(" ").append(numericLiteral.unit);

        return stringBuffer.toString();
    }
    
}
