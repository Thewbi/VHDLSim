package de.vhdlmodel;

public enum PortDirection {

    IN,

    OUT,

    INOUT,

    BUFFER,

    LINKAGE,

    UNKNOWN;

    public static PortDirection fromString(final String data) {

        if (data.equalsIgnoreCase("IN")) {
            return IN;
        } else if (data.equalsIgnoreCase("OUT")) {
            return OUT;
        } else if (data.equalsIgnoreCase("INOUT")) {
            return INOUT;
        } else if (data.equalsIgnoreCase("BUFFER")) {
            return BUFFER;
        } else if (data.equalsIgnoreCase("LINKAGE")) {
            return LINKAGE;
        }

        throw new UnsupportedOperationException("Unknown type '" + data + "'");
    }

}
