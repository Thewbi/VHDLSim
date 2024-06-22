--Library IEEE;
--use IEEE.std_logic_1164.all;

architecture orLogic of OR_gate is
begin

    Y <= A OR B;

    P1: process (Sel)
    begin
        case Sel is
            when "00" =>
                Output2 <= Sig1;
            when "01" =>
                Output2 <= Sig2;
            when "10" =>
                Output2 <= Sig3;
            when "11" =>
                Output2 <= Sig4;
            when others =>
                Output2 <= (others => 'X');
        end case;
    end process;

    

end orLogic;