entity reg4 is
    port (  d0, d1, d2, d3, en, clk : in bit;
            q0, q1, q2, q3 : out bit);
end entity reg4;

architecture behav of reg4 is
begin
 storage : process is
 variable stored_d0, stored_d1, stored_d2, stored_d3 : bit;
 begin
 wait until clk;
 if en then
 stored_d0 := d0;
 stored_d1 := d1;
 stored_d2 := d2;
 stored_d3 := d3;
 end if;
 q0 <= stored_d0 after 5 ns;
 q1 <= stored_d1 after 5 ns;
 q2 <= stored_d2 after 5 ns;
 q3 <= stored_d3 after 5 ns;
 end process storage;
end architecture behav;