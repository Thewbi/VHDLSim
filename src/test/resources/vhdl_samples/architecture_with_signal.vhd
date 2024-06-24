architecture struct of reg4 is
    signal int_clk : bit;
begin

    bit0 : entity work.d_ff(basic)
        port map (d0, int_clk, q0);

    bit1 : entity work.d_ff(basic)
        port map (d1, int_clk, q1);

    bit2 : entity work.d_ff(basic)
        port map (d2, int_clk, q2);

    bit3 : entity work.d_ff(basic)
        port map (d3, int_clk, q3);

    gate : entity work.and2(basic)
        port map (en, clk, int_clk);

end architecture struct;
