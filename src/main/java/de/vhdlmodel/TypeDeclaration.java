package de.vhdlmodel;

import java.util.ArrayList;
import java.util.List;

public class TypeDeclaration extends ModelNode<Object> {

    public TypeDeclarationType typeDeclarationType = TypeDeclarationType.UNKNOWN;

    public List<String> enumValues = new ArrayList<>();

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("TypeDeclaration ").append(name).append(" ").append(typeDeclarationType).append(" ");


        switch (typeDeclarationType) {

            case ENUM:

                stringBuffer.append("{ ");

                int index = 0;
                for (String string : enumValues) {

                    stringBuffer.append(string);
                    
                    if (index < enumValues.size() - 1) {
                        stringBuffer.append(", ");
                    }

                    index++;
                }

                stringBuffer.append(" }");
                break;

            default:
                throw new RuntimeException("Unkown type: " + typeDeclarationType);
        }
        

        return stringBuffer.toString();
    }
    
}
