package de.vhdlmodel;

public class InterfaceConstant extends ModelNode<Object> {

    public String type;

    public Expr expr;

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("Generic ").append(name).append(" ").append(type).append("\n");

        // initial value expression is optional
        if (expr != null) {
            stringBuffer.append(expr.toString(indent + 1));
        }

        indent++;
        for (ModelNode<?> child : children) {
            stringBuffer.append(child.toString(indent));
        }

        return stringBuffer.toString();
    }
    
}
