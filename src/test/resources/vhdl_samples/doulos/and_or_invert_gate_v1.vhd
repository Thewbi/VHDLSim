-- VHDL code for AND-OR-INVERT gate

library IEEE;
use IEEE.STD_LOGIC_1164.all;

entity AOI is
port (
  A, B, C, D: in STD_LOGIC;
  F : out STD_LOGIC
);
end AOI;

architecture V1 of AOI is
begin
  F <= not ((A and B) or (C and D));
end V1;

-- end of VHDL code