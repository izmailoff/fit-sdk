////////////////////////////////////////////////////////////////////////////////
// The following FIT Protocol software provided may be used with FIT protocol
// devices only and remains the copyrighted property of Garmin Canada Inc.
// The software is being provided on an "as-is" basis and as an accommodation,
// and therefore all warranties, representations, or guarantees of any kind
// (whether express, implied or statutory) including, without limitation,
// warranties of merchantability, non-infringement, or fitness for a particular
// purpose, are specifically disclaimed.
//
// Copyright 2018 Garmin Canada Inc.
////////////////////////////////////////////////////////////////////////////////
// ****WARNING****  This file is auto-generated!  Do NOT edit this file.
// Profile Version = 20.72Release
// Tag = production/akw/20.72.00-0-g2c26d20
////////////////////////////////////////////////////////////////////////////////


package com.garmin.fit;

import java.util.HashMap;
import java.util.Map;

public class LocalDateTime {
    public static final long MIN = 0x10000000; // if date_time is < 0x10000000 then it is system time (seconds from device power on)
    public static final long INVALID = Fit.UINT32_INVALID;

    private static final Map<Long, String> stringMap;

    static {
        stringMap = new HashMap<Long, String>();
        stringMap.put(MIN, "MIN");
    }
    public static final long OFFSET = 631065600000l; // Offset between Garmin (FIT) time and Unix time in ms (Dec 31, 1989 - 00:00:00 January 1, 1970).

    private long timestamp;

    /**
     * Retrieves the String Representation of the Value
     * @return The string representation of the value, or empty if unknown
     */
    public static String getStringFromValue( Long value ) {
        if( stringMap.containsKey( value ) ) {
            return stringMap.get( value );
        }

        return "";
    }

    /**
     * Retrieves a value given a string representation
     * @return The value or INVALID if unkwown
     */
    public static Long getValueFromString( String value ) {
        for( Map.Entry<Long, String> entry : stringMap.entrySet() ) {
            if( entry.getValue().equals( value ) ) {
                return entry.getKey();
            }
        }

        return INVALID;
    }
    public LocalDateTime(long timestamp) {
        this.timestamp = timestamp;
    }

    public LocalDateTime(java.util.Date date) {
        this.timestamp = (date.getTime() - OFFSET) / 1000;
    }

    public boolean equals(DateTime dateTime) {
        return (this.getTimestamp().equals(dateTime.getTimestamp()));
    }

    public void convertSystemTimeToLocal(long offset) {
        if (timestamp < MIN) {
            timestamp += offset;
        }
    }

    public Long getTimestamp() {
        return new Long(timestamp);
    }

    public java.util.Date getDate() {
        return new java.util.Date(timestamp * 1000 + OFFSET);
    }

    public String toString() {
        return getDate().toString();
    }

}
