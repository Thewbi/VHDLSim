package de.vhdlmodel;

public class Configuration {

    // MUX2_specified_CFG
    public String name;

    // MUX2
    // this configuration applies to this entity
    public String targetEntity;

    // STRUCTURE
    // this configuration applies to this architecture for the targetEntity
    public String targetEntityArchitecture;

    // G2
    // Within the targetEntityArchitecture this component instance name is bound
    public String componentInstance;

    // AOI
    // Within the targetEntityArchitecture this component declaration is bound
    public String componentDeclaration;

    // work.AOI_12345
    // this is the value that is bound
    public String boundEntity;

    // v1
    // this is the value that is bound
    public String boundEntityArchitecture;

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("configuration\n");

        indent++;
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("name: ").append(name).append("\n");
        
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("targetEntity: ").append(targetEntity).append("\n");

        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("targetEntityArchitecture: ").append(targetEntityArchitecture).append("\n");

        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("componentInstance: ").append(componentInstance).append("\n");

        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("componentDeclaration: ").append(componentDeclaration).append("\n");

        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("boundEntity: ").append(boundEntity).append("\n");

        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("boundEntityArchitecture: ").append(boundEntityArchitecture).append("\n");

        return stringBuffer.toString();
    }
    
}
