package de.vhdlmodel;

public class AssociationElement extends ModelNode<String> {

    public ModelNode<?> expr;

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("AssociationElement ").append(name).append(" => ").append(expr.toString(0)).append("\n");

        indent++;
        for (ModelNode<?> child : children) {
            stringBuffer.append(child.toString(indent));
        }

        return stringBuffer.toString();
    }
    
}
