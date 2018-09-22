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

public class PullUpExerciseName {
    public static final int BANDED_PULL_UPS = 0;
    public static final int _30_DEGREE_LAT_PULLDOWN = 1;
    public static final int BAND_ASSISTED_CHIN_UP = 2;
    public static final int CLOSE_GRIP_CHIN_UP = 3;
    public static final int WEIGHTED_CLOSE_GRIP_CHIN_UP = 4;
    public static final int CLOSE_GRIP_LAT_PULLDOWN = 5;
    public static final int CROSSOVER_CHIN_UP = 6;
    public static final int WEIGHTED_CROSSOVER_CHIN_UP = 7;
    public static final int EZ_BAR_PULLOVER = 8;
    public static final int HANGING_HURDLE = 9;
    public static final int WEIGHTED_HANGING_HURDLE = 10;
    public static final int KNEELING_LAT_PULLDOWN = 11;
    public static final int KNEELING_UNDERHAND_GRIP_LAT_PULLDOWN = 12;
    public static final int LAT_PULLDOWN = 13;
    public static final int MIXED_GRIP_CHIN_UP = 14;
    public static final int WEIGHTED_MIXED_GRIP_CHIN_UP = 15;
    public static final int MIXED_GRIP_PULL_UP = 16;
    public static final int WEIGHTED_MIXED_GRIP_PULL_UP = 17;
    public static final int REVERSE_GRIP_PULLDOWN = 18;
    public static final int STANDING_CABLE_PULLOVER = 19;
    public static final int STRAIGHT_ARM_PULLDOWN = 20;
    public static final int SWISS_BALL_EZ_BAR_PULLOVER = 21;
    public static final int TOWEL_PULL_UP = 22;
    public static final int WEIGHTED_TOWEL_PULL_UP = 23;
    public static final int WEIGHTED_PULL_UP = 24;
    public static final int WIDE_GRIP_LAT_PULLDOWN = 25;
    public static final int WIDE_GRIP_PULL_UP = 26;
    public static final int WEIGHTED_WIDE_GRIP_PULL_UP = 27;
    public static final int BURPEE_PULL_UP = 28;
    public static final int WEIGHTED_BURPEE_PULL_UP = 29;
    public static final int JUMPING_PULL_UPS = 30;
    public static final int WEIGHTED_JUMPING_PULL_UPS = 31;
    public static final int KIPPING_PULL_UP = 32;
    public static final int WEIGHTED_KIPPING_PULL_UP = 33;
    public static final int L_PULL_UP = 34;
    public static final int WEIGHTED_L_PULL_UP = 35;
    public static final int SUSPENDED_CHIN_UP = 36;
    public static final int WEIGHTED_SUSPENDED_CHIN_UP = 37;
    public static final int PULL_UP = 38;
    public static final int INVALID = Fit.UINT16_INVALID;

    private static final Map<Integer, String> stringMap;

    static {
        stringMap = new HashMap<Integer, String>();
        stringMap.put(BANDED_PULL_UPS, "BANDED_PULL_UPS");
        stringMap.put(_30_DEGREE_LAT_PULLDOWN, "_30_DEGREE_LAT_PULLDOWN");
        stringMap.put(BAND_ASSISTED_CHIN_UP, "BAND_ASSISTED_CHIN_UP");
        stringMap.put(CLOSE_GRIP_CHIN_UP, "CLOSE_GRIP_CHIN_UP");
        stringMap.put(WEIGHTED_CLOSE_GRIP_CHIN_UP, "WEIGHTED_CLOSE_GRIP_CHIN_UP");
        stringMap.put(CLOSE_GRIP_LAT_PULLDOWN, "CLOSE_GRIP_LAT_PULLDOWN");
        stringMap.put(CROSSOVER_CHIN_UP, "CROSSOVER_CHIN_UP");
        stringMap.put(WEIGHTED_CROSSOVER_CHIN_UP, "WEIGHTED_CROSSOVER_CHIN_UP");
        stringMap.put(EZ_BAR_PULLOVER, "EZ_BAR_PULLOVER");
        stringMap.put(HANGING_HURDLE, "HANGING_HURDLE");
        stringMap.put(WEIGHTED_HANGING_HURDLE, "WEIGHTED_HANGING_HURDLE");
        stringMap.put(KNEELING_LAT_PULLDOWN, "KNEELING_LAT_PULLDOWN");
        stringMap.put(KNEELING_UNDERHAND_GRIP_LAT_PULLDOWN, "KNEELING_UNDERHAND_GRIP_LAT_PULLDOWN");
        stringMap.put(LAT_PULLDOWN, "LAT_PULLDOWN");
        stringMap.put(MIXED_GRIP_CHIN_UP, "MIXED_GRIP_CHIN_UP");
        stringMap.put(WEIGHTED_MIXED_GRIP_CHIN_UP, "WEIGHTED_MIXED_GRIP_CHIN_UP");
        stringMap.put(MIXED_GRIP_PULL_UP, "MIXED_GRIP_PULL_UP");
        stringMap.put(WEIGHTED_MIXED_GRIP_PULL_UP, "WEIGHTED_MIXED_GRIP_PULL_UP");
        stringMap.put(REVERSE_GRIP_PULLDOWN, "REVERSE_GRIP_PULLDOWN");
        stringMap.put(STANDING_CABLE_PULLOVER, "STANDING_CABLE_PULLOVER");
        stringMap.put(STRAIGHT_ARM_PULLDOWN, "STRAIGHT_ARM_PULLDOWN");
        stringMap.put(SWISS_BALL_EZ_BAR_PULLOVER, "SWISS_BALL_EZ_BAR_PULLOVER");
        stringMap.put(TOWEL_PULL_UP, "TOWEL_PULL_UP");
        stringMap.put(WEIGHTED_TOWEL_PULL_UP, "WEIGHTED_TOWEL_PULL_UP");
        stringMap.put(WEIGHTED_PULL_UP, "WEIGHTED_PULL_UP");
        stringMap.put(WIDE_GRIP_LAT_PULLDOWN, "WIDE_GRIP_LAT_PULLDOWN");
        stringMap.put(WIDE_GRIP_PULL_UP, "WIDE_GRIP_PULL_UP");
        stringMap.put(WEIGHTED_WIDE_GRIP_PULL_UP, "WEIGHTED_WIDE_GRIP_PULL_UP");
        stringMap.put(BURPEE_PULL_UP, "BURPEE_PULL_UP");
        stringMap.put(WEIGHTED_BURPEE_PULL_UP, "WEIGHTED_BURPEE_PULL_UP");
        stringMap.put(JUMPING_PULL_UPS, "JUMPING_PULL_UPS");
        stringMap.put(WEIGHTED_JUMPING_PULL_UPS, "WEIGHTED_JUMPING_PULL_UPS");
        stringMap.put(KIPPING_PULL_UP, "KIPPING_PULL_UP");
        stringMap.put(WEIGHTED_KIPPING_PULL_UP, "WEIGHTED_KIPPING_PULL_UP");
        stringMap.put(L_PULL_UP, "L_PULL_UP");
        stringMap.put(WEIGHTED_L_PULL_UP, "WEIGHTED_L_PULL_UP");
        stringMap.put(SUSPENDED_CHIN_UP, "SUSPENDED_CHIN_UP");
        stringMap.put(WEIGHTED_SUSPENDED_CHIN_UP, "WEIGHTED_SUSPENDED_CHIN_UP");
        stringMap.put(PULL_UP, "PULL_UP");
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
