--if read_detected = '1'
--if read_detected = '1' and write_detected < '0' then
if read_detected = '1' and read_detected = '2' and write_detected < '0' then
    -- go to a state that will consume a zero
    nstate <= Szero;
end if;