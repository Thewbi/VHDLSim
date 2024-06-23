-- https://www.allaboutcircuits.com/technical-articles/how-to-use-vhdl-components-to-create-a-neat-hierarchical-design/

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity Four_Bit_Adder is
    Port ( a : in  STD_LOGIC_VECTOR (3 downto 0);
           b : in  STD_LOGIC_VECTOR (3 downto 0);
           c0 : in  STD_LOGIC;
           s : out  STD_LOGIC_VECTOR (3 downto 0);
           c4 : out  STD_LOGIC);
end Four_Bit_Adder;

architecture Behavioral of Four_Bit_Adder is
	
	signal c3, c2, c1: std_logic;
    
begin
	
	-- The first full adder
	s(0) <= a(0) xor b(0) xor c0;
	c1 <= ( (a(0) xor b(0)) and c0 ) or (a(0) and b(0));
	
	-- The second full adder
	s(1) <= a(1) xor b(1) xor c1;
	c2 <= ( (a(1) xor b(1)) and c1 ) or (a(1) and b(1));
	
	-- The third full adder
	s(2) <= a(2) xor b(2) xor c2;
	c3 <= ( (a(2) xor b(2)) and c2 ) or (a(2) and b(2));
	
	-- The fourth full adder
	s(3) <= a(3) xor b(3) xor c3;
	c4 <= ( (a(3) xor b(3)) and c3 ) or (a(3) and b(3));

end Behavioral;
