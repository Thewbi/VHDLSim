-- start symbol: function_specification

function Change(signal Sig_s : integer) return integer is
    -- following constant is "dynamically" defined
    -- and its value depends on the actual parameter
    -- (passed to the formal parameter) during the function call.
    --constant Changed_c : boolean := Sig_s'event;
begin
    if Changed_c then
        return 100;
    else
        return 0;
    end if;
end Change; 