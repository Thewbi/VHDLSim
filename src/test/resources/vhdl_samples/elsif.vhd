if data_from_fifo_1 = "01110010" or data_from_fifo_2 = "01110111" then 
    nstate <= Saddr;
elsif data_from_fifo_3 = "01110111" then
    write_detected <= '1';
else
    nstate <= Sdollar;
    nstate <= Saddr + 1;
    write_detected <= '1';
end if;