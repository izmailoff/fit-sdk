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

public class UserLocalId {
    public static final int LOCAL_MIN = 0x0000;
    public static final int LOCAL_MAX = 0x000F;
    public static final int STATIONARY_MIN = 0x0010;
    public static final int STATIONARY_MAX = 0x00FF;
    public static final int PORTABLE_MIN = 0x0100;
    public static final int PORTABLE_MAX = 0xFFFE;
    public static final int INVALID = Fit.UINT16_INVALID;

    private static final Map<Integer, String> stringMap;

    static {
        stringMap = new HashMap<Integer, String>();
        stringMap.put(LOCAL_MIN, "LOCAL_MIN");
        stringMap.put(LOCAL_MAX, "LOCAL_MAX");
        stringMap.put(STATIONARY_MIN, "STATIONARY_MIN");
        stringMap.put(STATIONARY_MAX, "STATIONARY_MAX");
        stringMap.put(PORTABLE_MIN, "PORTABLE_MIN");
        stringMap.put(PORTABLE_MAX, "PORTABLE_MAX");
    }


    /**
     * Retrieves the String Representation of the Value
     * @return The string representation of the value, or empty if unknown
     */
    public static String getStringFromValue( Integer value ) {
        if( stringMap.containsKey( value ) ) {
            return stringMap.get( value );
        }

        return "";
    }

    /**
     * Retrieves a value given a string representation
     * @return The value or INVALID if unkwown
     */
    public static Integer getValueFromString( String value ) {
        for( Map.Entry<Integer, String> entry : stringMap.entrySet() ) {
            if( entry.getValue().equals( value ) ) {
                return entry.getKey();
            }
        }

        return INVALID;
    }

}
