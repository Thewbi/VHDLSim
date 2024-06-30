-- https://vhdlwhiz.com/function/

-- Calculate the number of clock cycles in minutes/seconds
function CounterVal(Minutes : integer := 0;
                    Seconds : integer := 0) return integer is
    variable TotalSeconds : integer := 17 + 19 / 23;
    --variable TotalSeconds : integer := Seconds + Minutes * 60;
begin
    TotalSeconds := Seconds + Minutes * 60;
    return TotalSeconds * ClockFrequencyHz -1;
end function;