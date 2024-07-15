package de.vhdlmodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TypeDeclaration extends ModelNode<Object> {

    public TypeDeclarationType typeDeclarationType = TypeDeclarationType.UNKNOWN;

    public List<String> enumValues = new ArrayList<>();

    public Range range;

    public PhysicalUnit physicalUnit = new PhysicalUnit();

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("TypeDeclaration ").append(name).append(" ").append(typeDeclarationType).append(" ");

        int index = 0;

        switch (typeDeclarationType) {

            case ENUM:
                stringBuffer.append("{ ");
                index = 0;
                for (String string : enumValues) {

                    stringBuffer.append(string);
                    
                    if (index < enumValues.size() - 1) {
                        stringBuffer.append(", ");
                    }

                    index++;
                }
                stringBuffer.append(" }");
                break;

            case PHYSICAL_TYPE:
                if (range != null) {
                    stringBuffer.append(" ").append(range.toString(0)).append("\n");
                }
                for (Map.Entry<String, SubPhysicalUnit> entry : physicalUnit.subPhysicalUnits.entrySet()) {
                    stringBuffer.append(entry.getValue().toString(indent+1)).append("\n");
                    index++;
                }
                break;

            default:
                throw new RuntimeException("Unkown type: " + typeDeclarationType);
        }
        

        return stringBuffer.toString();
    }
    
}
