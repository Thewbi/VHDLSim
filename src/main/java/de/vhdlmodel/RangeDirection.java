package de.vhdlmodel;

public enum RangeDirection {
    
    TO,

    DOWNTO;

    public static RangeDirection fromString(final String data) {

        if (data.equalsIgnoreCase("TO")) {
            return TO;
        } else if (data.equalsIgnoreCase("DOWNTO")) {
            return DOWNTO;
        }

        throw new UnsupportedOperationException("Unknown type '" + data + "'");
    }

}
