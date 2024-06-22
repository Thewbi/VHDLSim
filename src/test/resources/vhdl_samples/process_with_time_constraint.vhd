process (bcd, S)
begin
    case bcd is
        when "00" => S <= "0001" after 5 ns;
        when "01" => S <= "0010" after 5 ns;
        when "10" => S <= "0100" after 5 ns;
        when "11" => S <= "1000" after 5 ns;
    end case;
    led <= S;
end process;