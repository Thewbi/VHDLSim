package de.vhdlsim;

import de.vhdlmodel.ModelNode;
import de.vhdlmodel.Name;

public class AliasDeclaration extends ModelNode<String> {

    public Name alias;

    public Name source;

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("AliasDeclaration: ").append(name).append("\n");

        indent++;

        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("Alias Typeifier: ").append(alias.toString(indent)); //.append("\n");

        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("Source Typeifier: ").append(source.toString(indent)); //.append("\n");

        // for (ModelNode<?> child : children) {
        //     RecordField recordField = (RecordField) child;
        //     stringBuffer.append(recordField.toString(indent));
        // }

        return stringBuffer.toString();
    }

}
