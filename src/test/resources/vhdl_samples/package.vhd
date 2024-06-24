-- If we define our own types for ports, the type names must be declared in a package, 
-- so that they are visible in the entity declaration. 
--
-- We will describe packages in more detail in Chapter 7;

PACKAGE eight_bit_int IS 
    SUBTYPE BYTE IS INTEGER RANGE -128 TO 127;
END eight_bit_int;

-- This defines a package named int_types, which provides the type named small_int.
--
-- The package is a separate design unit and is analyzed before any entity declaration
-- that needs to use the type it provides.
package int_types is
    type small_int is range 0 to 255;
end package int_types;

-- We can use the type by preceding an entity declaration with a use clause, for example:
use work.int_types.all;

entity small_adder is
    port (a, b : in small_int; 
        s : out small_int);
end entity small_adder;