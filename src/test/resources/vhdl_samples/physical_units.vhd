-- The VHDL standard predefines only one physical type: TIME, which is defined in the
-- STANDARD package.

-- https://www.aldec.com/en/support/resources/documentation/articles/1165

type time is range -2147483647 to 2147483647
    units
        fs;
        ps = 1000 fs;
        ns = 1000 ps;
        us = 1000 ns;
        ms = 1000 us;
        sec = 1000 ms;
        min = 60 sec;
        hr = 60 min;
    end units;

-- type CAPACITY is range 0 to 1E5
--     units
--         pF; -- picofarad
--         nF = 1000 pF; -- nanofarad
--         uF = 1000 nF; -- microfarad
--         mF = 1000 uF; -- milifarad
--         F = 1000 mF; -- farad
--     end units CAPACITY;

-- type DISTANCE is range 0 to 1E5
--     units
--         um; -- micrometer
--         mm = 1000 um; -- millimeter
--         in_a = 25400 um; -- inch
--     end units DISTANCE;

-- variable Dis1, Dis2 : DISTANCE;
-- Dis1 := 28 mm;
-- Dis2 := 2 in_a - 1 mm;

-- --if Dis1 < Dis2 then ...