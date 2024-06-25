--Library IEEE;
--use IEEE.std_logic_1164.all;

-- testbench generator: https://vhdl.lapinoo.net/testbench/

entity AND_gate is
    port(A : in std_logic;     
         B : in std_logic;     
         Y : out std_logic); 
end AND_gate;

architecture andLogic of AND_gate is
begin
    Y <= A AND B;
end andLogic;