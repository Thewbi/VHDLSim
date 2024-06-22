package de.vhdlmodel;

public enum PortDirection {

    IN,

    OUT,

    UNKNOWN;

    public static PortDirection fromString(final String data) {

        if (data.equalsIgnoreCase("IN")) {
            return IN;
        } else if (data.equalsIgnoreCase("OUT")) {
            return OUT;
        }

        throw new UnsupportedOperationException("Unknown type '" + data+ "'");
    }

}
