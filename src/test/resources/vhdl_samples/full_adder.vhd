-- https://www.allaboutcircuits.com/technical-articles/how-to-use-vhdl-components-to-create-a-neat-hierarchical-design/

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity FA is
	port(a, b, c_in : in std_logic;
	     s, c_out : out std_logic);
end FA;

architecture Behavioral of FA is
begin

	s <= a xor b xor c_in;
	c_out <= ( (a xor b) and c_in ) or (a and b);
    
end Behavioral;
