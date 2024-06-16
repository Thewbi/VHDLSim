process(Sel, Sig1, Sig2, Sig3, Sig4) is
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
        when others => -- 'U', 'X', '-', etc.
            Output2 <= (others => 'X');
    end case;

end process;