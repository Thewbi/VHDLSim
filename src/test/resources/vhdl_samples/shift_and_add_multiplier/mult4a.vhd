-- https://www.youtube.com/watch?v=iF1BTl1Cf6U

-- start symbol: 

-- Example 34: 4-bit mutliplier
library IEEE;
use IEEE.STD_LOGIC_1164.all;
use IEEE.STD_LOGIC_unsigned.all;

entity mult4a is
    port(
            a: in STD_LOGIC_VECTOR(3 downto 0);
            b: in STD_LOGIC_VECTOR(3 downto 0);
            p: out STD_LOGIC_VECTOR(7 downto 0)
        );
end mult4a;

architecture mult4a of mult4a is
begin
    process(a, b)
    variable pv, bp: STD_LOGIC_VECTOR(7 downto 0);
    begin
        pv := "00000000";
        bp := "0000" & b;
        for i in 0 to 3 loop
            if a(i) = '1' then
                pv := pv + bp;
            end if;
            bp := bp(6 downto 0) & '0';
        end loop;
        p <= pv;
    end process;
end mult4a;