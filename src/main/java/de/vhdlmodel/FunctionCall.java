package de.vhdlmodel;

public class FunctionCall extends ModelNode<Object> {
    
    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("FunctionCall: ").append(name).append("\n");

        // if (operator == null) {
        //     stringBuffer.append("Expr: ").append(constantValue).append("\n");
        // } else {
        //     stringBuffer.append("Expr: ").append(operator).append("\n");
        // }

        indent++;
        for (ModelNode child : children) {
            stringBuffer.append(child.toString(indent));
        }

        return stringBuffer.toString();

    }

}
