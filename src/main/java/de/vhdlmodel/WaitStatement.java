package de.vhdlmodel;

public class WaitStatement extends Stmt {

    public NumericLiteral numericLiteral;

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("wait-stmt\n");

        indent++;
        stringBuffer.append(numericLiteral.toString(indent));
        indent--;

        return stringBuffer.toString();

    }
    
}
