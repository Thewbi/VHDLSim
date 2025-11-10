-- start symbol: subprogram_body

function abs_f(input: std_ulogic_vector; is_signed: std_ulogic) return std_ulogic_vector is
begin

    -- start symbol: if_statement
    if ((input(input'left) = '1') and (is_signed = '1')) then
        return std_ulogic_vector(0 - unsigned(input));
    else
        return input;
    end if;

end function abs_f;