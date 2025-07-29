-- Start Symbol: process_statement

Test_Lbl : process(Bus_s)
begin
    Bus_s <= x"AB_CD_0955" after 10 ns;
end process Test_Lbl;