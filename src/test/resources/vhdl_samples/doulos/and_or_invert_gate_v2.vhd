library IEEE;
use IEEE.STD_LOGIC_1164.all;

entity AOI is
  port (A, B, C, D: in STD_LOGIC;
  F : out STD_LOGIC);
end AOI;

architecture V2 of AOI is
  signal AB, CD, O: STD_LOGIC;
begin
  AB <= A and B after 2 NS;
  CD <= C and D after 2 NS;
  O <= AB or CD after 2 NS;
  F <= not O after 1 NS;
end V2;