package de.vhdlmodel;

public class ConstantDeclaration extends ModelNode<Object> {

    public SubtypeIndication type;

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("ConstantDeclaration name: ").append(name);

        stringBuffer.append(type.toString(indent + 1));

        indent++;

        for (ModelNode<?> child : children) {
            stringBuffer.append(child.toString(indent));
        }

        return stringBuffer.toString();

    }
    
}
