architecture neorv32_cpu_cp_shifter_rtl of neorv32_cpu_cp_shifter is
begin

    serial_shifter:
    if not FAST_SHIFT_EN generate

        serial_shifter_core: process(rstn_i, clk_i)
        begin
            if (rstn_i = '0') then
                shifter.busy <= '0';
            end if;
        end process serial_shifter_core;
        
    end generate;
  
end neorv32_cpu_cp_shifter_rtl;