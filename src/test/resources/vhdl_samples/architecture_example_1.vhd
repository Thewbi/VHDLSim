-- start symbol: architecture_body

architecture Alias_beh of Alias_Nty is
    signal Bus_s : bit_vector(31 downto 0) := X"AB_CD_0234";
    --signal Bus_s : bit_vector(31 downto 0);

    alias OpCode_s : bit_vector(7 downto 0) is Bus_s(31 downto 24);
    alias Source_s : bit_vector(3 downto 0) is Bus_s(23 downto 20);
    alias Dest_s : bit_vector(3 downto 0) is Bus_s(19 downto 16);
    alias Data16_s : bit_vector(15 downto 0) is Bus_s(15 downto 0);
begin
    Test_Lbl : process(Bus_s)
    begin
        Bus_s <= x"AB_CD_0955" after 10 ns;
        if OpCode_s = "10101011" then
            if Source_s = "1100" then
                Data16_s <= X"F904";
            end if;
        end if;
    end process Test_Lbl;
end Alias_beh;