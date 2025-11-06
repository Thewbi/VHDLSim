package de.vhdlmodel;

import java.util.ArrayList;
import java.util.List;

public abstract class PortTarget extends Stmt {

    public List<Port> ports = new ArrayList<>();
    
    public List<InterfaceConstant> interfaceConstants = new ArrayList<>();
    
}
