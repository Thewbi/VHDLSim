rom_access: process(clk_i)
  begin
    if rising_edge(clk_i) then
      if (bus_req_i.stb = '1') then
  --      rdata <= bootloader_image_data_c(to_integer(unsigned(bus_req_i.addr(awidth_c+1 downto 2))));
      end if;
    end if;
  end process rom_access;