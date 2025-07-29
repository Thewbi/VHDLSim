architecture Alias_beh of Alias_Nty is
    --signal Bus_s : bit_vector(31 downto 0) := X"AB_CD_0234";
    signal Bus_s : bit_vector(31 downto 0);
begin
    Test_Lbl : process(Bus_s)
    begin
         Bus_s <= x"AB_CD_0955" after 10 ns;
    --     If OpCode_s = "10101011" then
    --         If Source_s = "1100" then
    --             Data16_s <= X"F904";
    --         end if;
    --     end if;
    end process Test_Lbl;
end Alias_beh;