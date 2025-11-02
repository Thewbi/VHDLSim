if read_detected = '1' and read_detected = '2' and write_detected < '0' then
    nstate <= Szero;
    y <= x;
end if;