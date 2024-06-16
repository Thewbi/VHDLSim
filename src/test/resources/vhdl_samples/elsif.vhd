if data_from_fifo = "01110010" or data_from_fifo = "01110111" then 
    nstate <= Saddr;
elsif data_from_fifo = "01110111" then
    write_detected <= '1';
else
    nstate <= Sdollar;
    nstate <= Saddr;
    write_detected <= '1';
end if;