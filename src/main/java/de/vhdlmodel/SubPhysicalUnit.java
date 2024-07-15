package de.vhdlmodel;

public class SubPhysicalUnit {

    public PhysicalUnit physicalUnit;
    
    public String name;

    public int factor;

    public SubPhysicalUnit parent;

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("SubType ").append(name);
        
        if (parent != null) {
            stringBuffer.append(" ").append(factor).append(" x ").append(parent.name);
        }

        return stringBuffer.toString();
    }

}
