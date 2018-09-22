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


public enum CameraOrientationType {
    CAMERA_ORIENTATION_0((short)0),
    CAMERA_ORIENTATION_90((short)1),
    CAMERA_ORIENTATION_180((short)2),
    CAMERA_ORIENTATION_270((short)3),
    INVALID((short)255);

    protected short value;

    private CameraOrientationType(short value) {
        this.value = value;
    }

    public static CameraOrientationType getByValue(final Short value) {
        for (final CameraOrientationType type : CameraOrientationType.values()) {
            if (value == type.value)
                return type;
        }

        return CameraOrientationType.INVALID;
    }

    /**
     * Retrieves the String Representation of the Value
     * @return The string representation of the value
     */
    public static String getStringFromValue( CameraOrientationType value ) {
        return value.name();
    }

    public short getValue() {
        return value;
    }


}
