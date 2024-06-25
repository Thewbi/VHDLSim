if rising_edge(clk, a, b, c) then
	q <= d;
    y <= x;
elsif Fifo_valid = '1' then
    read_ptr <= read_ptr + 1;
    a <= b + 2;
elsif falling_edge(clk, x, y, z) then
	q <= d;
    y <= x;
end if;