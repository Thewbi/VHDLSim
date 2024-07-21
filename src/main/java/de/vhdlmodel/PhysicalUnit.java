package de.vhdlmodel;

import java.util.HashMap;
import java.util.Map;

/**
 * -- The VHDL standard predefines only one physical type: TIME, which is defined in the
 * -- STANDARD package.
 *
 * -- https://www.aldec.com/en/support/resources/documentation/articles/1165
 *
 * ```
 * type time is range -2147483647 to 2147483647
 *     units
 *         fs;
 *         ps = 1000 fs;
 *         ns = 1000 ps;
 *         us = 1000 ns;
 *         ms = 1000 us;
 *         sec = 1000 ms;
 *         min = 60 sec;
 *         hr = 60 min;
 *     end units;
 * ```
 */
public class PhysicalUnit {

    public String name;

    public Map<String, SubPhysicalUnit> subPhysicalUnits = new HashMap<String, SubPhysicalUnit>();
    
}
