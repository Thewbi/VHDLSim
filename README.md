# VHDLSim
VHDL Simulator

Following versions of VHDL exist:

VHDL-87 (1987, Publication of IEEE Standard)
VHDL-93 (Revised standard (named VHDL 1076-1993))
VHDL-2002 (Revised standard (named VHDL 1076-2002))
VHDL-2008
VHDL-2019

This simulator supports VHDL-2008.

## Grammar

Credit goes to Denis Gavrish.
The grammar was split into a file for the lexer and a file for the parser.

# VHDL components

VHDL allows the user to hierachically combine entities to form more complex entities.

The way in which entities are nested into each other is very, very elaborate.

The simplest way to achieve nesting is to directly instantiate entities within other entities.
This is called entitiy instantiation. Entity is only available in later versions of VHDL.

The more complex version of nesting is done via components.

Components are top-level objects in their own right. Components do not have architectures like entities do. 
Components are used by placing

1. a component declaration into the declaration part of an entitie's architecture
1. a component instantiation into the body (= between begin end) of an entitie's architecture.

## Component Declaration
The declaration part of an architecture is everything before the begin - end block.

A component declaration looks very similar to an entity in that it also defines an interface via ports 
exactly like entities do. The idea is that when an entity has the same interface than a component, the 
entity can be plugged into a component to complete the architecture.

## Component Instantiation
The second part to a component is the component instantiations. The component instantiation is placed
into the entitie's architectures body (between begin and end)

The component instance is necessary because here, the signals and ports are inserted into the 
component instantiation. This means that when an entities is then later resolved and placed into
the component, this entity will receive the same ports and signals that where put into the component instance.

## Binding and Configurations
Plugging entities into components is called binding. Binding is done at compile time by the VHDL compiler.
The VHDL compiler has to solve the following tasks in order to resolve entities for components.

1. determine entities that matches the component's interface and then Pick one of the matching entities to use for the binding
1. select an architecture for the entity that is plugged into the component

### Late Binding
The way to explicitly tell the compiler which entity and which architecture to use for
the component is to use configurations. Configurations again are their own top-level
element in VHDL. 

A component is explicitly created for a specific entity architecture.
This means that if an entity has several architectures, and more than one architecture
uses component declarations and instatioations, then each of these architecture has their
own specific component.

```
configuration MUX2_specified_CFG of MUX2 is -- this is a configuration (called MUX2_specified_CFG) for the entity MUX2
  for STRUCTURE -- this configuration is valid and is used for the entity architecture called STRUCTURE
    for G2 : AOI -- the architecture called STRUCTURE contains a component instance called G2 
                 -- and it's component declaration is AOI
      use entity work.AOI_12345(v1);  -- this defines which entity to use for G2. Here entity: work.AOI_12345
                                -- this also defines which architecture to use for the work.AOI_12345 entity. Here: use the architecture v1
    end for;
  end for;
end MUX2_specified_CFG;
```

## Semi/Automatic Binding
Configurations are optional! When no configuration is defined, then there are strategies
defined by the VHDL specification, which the compiler will then use to automatically resolve
entities and architectures.

### Default Binding
If no configuration is specified at all, then the default binding strategy is used.
Default binding will select the entity for a component instance by 

1. look at the component declaration of the copmonent instance
1. find the name of the component declaration
1. the name of the component declaration is used to search for an entity of that exact name!
1. when an entity of that name is found, then the architecture of that entity is used, which was processed by the compiler most recently
1. this entity and it's most recently scanned architecture is then bound to the component instance.

Most recently processed/scanned architecture means that the compiler will remember the last architecture that it has seen
for each architecture. Basically the compiler has a list of architectures for each entity, to which it appends architectures
as it processes them. When default binding is used, then the last element of this list is used for the binding.

This is a pretty brittly binding imho because it depends on in which order .vhd files are presented to the compiler.
If several .vhd files contain architectures, then the order in which the files are scanned, determines which architecture
is used by the default binding strategy. The user of an IDE or some automated build system such as meson does not have
any way of modifying the order in which files are presented to the compiler. It seems that the user has almost no
advantage of the default binding strategy unless there is only a single architecture for each entity.

## Edge Cases for the Compiler

1. A cycle of entites that use each other either directly or accross a chain/cycle of several entites. This cycle cannot ever successfully be resolved because each entity used a entity the is based on itself recursively without abort condition. The compiler has to detect this condition and abort the compilation process!

### 