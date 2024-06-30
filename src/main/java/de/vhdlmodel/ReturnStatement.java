package de.vhdlmodel;

public class ReturnStatement extends Stmt {

    public ModelNode<?> expr;
    
    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("return-stmt\n");

        indent++;
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("expr: ").append("\n");
        
        indent++;
        stringBuffer.append(expr.toString(indent));
        indent--;

        // stringBuffer.append("\n");

        // for (int i = 0; i < indent; i++) {
        //     stringBuffer.append("  ");
        // }
        // stringBuffer.append("rhs: ").append("\n");

        // indent++;
        // stringBuffer.append(rhs.toString(indent));
        // indent--;

        return stringBuffer.toString();
    }

}
