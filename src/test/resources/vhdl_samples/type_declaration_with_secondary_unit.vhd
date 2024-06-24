type resistance is range 0 to 1E9
units
    ohm;
    kohm = 1000 ohm;
    Mohm = 1000 kohm;
end units resistance;

type length is range 0 to 1E9
units
    um; -- primary unit: micron
    mm = 1000 um; -- metric units
    m = 1000 mm;
    inch = 25400 um; -- imperial units
    foot = 12 inch;
end units length;

type time is range implementation defined
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
