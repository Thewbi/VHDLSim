package de.vhdlmodel;

import java.util.ArrayList;
import java.util.List;

public class ComponentInstantiationStatement extends Stmt {

    public List<AssociationElement> portMap = new ArrayList<>();

    public List<Identifier> entity = new ArrayList<>();

    public String architecture;

    public String toString(int indent) {

        String name = "";

        int counter = 0;
        for (Identifier identifier : entity) {
            if (counter > 0) {
                name += ".";
            }
            name += identifier.value;
            counter++;
        }

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("ComponentInstantiation name=").append(name).append(" architecture=").append(architecture)
                .append("\n");

        indent++;

        // portMap
        for (AssociationElement associationElement : portMap) {
            for (int i = 0; i < indent; i++) {
                stringBuffer.append("  ");
            }
            stringBuffer.append(associationElement.name).append("\n");
        }

        return stringBuffer.toString();
    }

}
