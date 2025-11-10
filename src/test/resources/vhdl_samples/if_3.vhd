-- start-symbol: if_statement

if ((input(input'left) = '1') and (is_signed = '1')) then
-- if (is_signed = '1') then
-- if (input(input'left) = '1') then
    Data16_s <= X"F904";
end if;