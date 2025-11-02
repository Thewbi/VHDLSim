if Fifo_valid = '1' then
    read_ptr <= read_ptr + 1;
    a <= b + 2;
end if;