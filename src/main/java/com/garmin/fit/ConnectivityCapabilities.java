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

public class ConnectivityCapabilities {
    public static final long BLUETOOTH = 0x00000001;
    public static final long BLUETOOTH_LE = 0x00000002;
    public static final long ANT = 0x00000004;
    public static final long ACTIVITY_UPLOAD = 0x00000008;
    public static final long COURSE_DOWNLOAD = 0x00000010;
    public static final long WORKOUT_DOWNLOAD = 0x00000020;
    public static final long LIVE_TRACK = 0x00000040;
    public static final long WEATHER_CONDITIONS = 0x00000080;
    public static final long WEATHER_ALERTS = 0x00000100;
    public static final long GPS_EPHEMERIS_DOWNLOAD = 0x00000200;
    public static final long EXPLICIT_ARCHIVE = 0x00000400;
    public static final long SETUP_INCOMPLETE = 0x00000800;
    public static final long CONTINUE_SYNC_AFTER_SOFTWARE_UPDATE = 0x00001000;
    public static final long CONNECT_IQ_APP_DOWNLOAD = 0x00002000;
    public static final long GOLF_COURSE_DOWNLOAD = 0x00004000;
    public static final long DEVICE_INITIATES_SYNC = 0x00008000; // Indicates device is in control of initiating all syncs
    public static final long CONNECT_IQ_WATCH_APP_DOWNLOAD = 0x00010000;
    public static final long CONNECT_IQ_WIDGET_DOWNLOAD = 0x00020000;
    public static final long CONNECT_IQ_WATCH_FACE_DOWNLOAD = 0x00040000;
    public static final long CONNECT_IQ_DATA_FIELD_DOWNLOAD = 0x00080000;
    public static final long CONNECT_IQ_APP_MANAGMENT = 0x00100000; // Device supports delete and reorder of apps via GCM
    public static final long SWING_SENSOR = 0x00200000;
    public static final long SWING_SENSOR_REMOTE = 0x00400000;
    public static final long INCIDENT_DETECTION = 0x00800000; // Device supports incident detection
    public static final long AUDIO_PROMPTS = 0x01000000;
    public static final long WIFI_VERIFICATION = 0x02000000; // Device supports reporting wifi verification via GCM
    public static final long TRUE_UP = 0x04000000; // Device supports True Up
    public static final long FIND_MY_WATCH = 0x08000000; // Device supports Find My Watch
    public static final long REMOTE_MANUAL_SYNC = 0x10000000;
    public static final long LIVE_TRACK_AUTO_START = 0x20000000; // Device supports LiveTrack auto start
    public static final long LIVE_TRACK_MESSAGING = 0x40000000; // Device supports LiveTrack Messaging
    public static final long INSTANT_INPUT = 0x80000000; // Device supports instant input feature
    public static final long INVALID = Fit.UINT32Z_INVALID;

    private static final Map<Long, String> stringMap;

    static {
        stringMap = new HashMap<Long, String>();
        stringMap.put(BLUETOOTH, "BLUETOOTH");
        stringMap.put(BLUETOOTH_LE, "BLUETOOTH_LE");
        stringMap.put(ANT, "ANT");
        stringMap.put(ACTIVITY_UPLOAD, "ACTIVITY_UPLOAD");
        stringMap.put(COURSE_DOWNLOAD, "COURSE_DOWNLOAD");
        stringMap.put(WORKOUT_DOWNLOAD, "WORKOUT_DOWNLOAD");
        stringMap.put(LIVE_TRACK, "LIVE_TRACK");
        stringMap.put(WEATHER_CONDITIONS, "WEATHER_CONDITIONS");
        stringMap.put(WEATHER_ALERTS, "WEATHER_ALERTS");
        stringMap.put(GPS_EPHEMERIS_DOWNLOAD, "GPS_EPHEMERIS_DOWNLOAD");
        stringMap.put(EXPLICIT_ARCHIVE, "EXPLICIT_ARCHIVE");
        stringMap.put(SETUP_INCOMPLETE, "SETUP_INCOMPLETE");
        stringMap.put(CONTINUE_SYNC_AFTER_SOFTWARE_UPDATE, "CONTINUE_SYNC_AFTER_SOFTWARE_UPDATE");
        stringMap.put(CONNECT_IQ_APP_DOWNLOAD, "CONNECT_IQ_APP_DOWNLOAD");
        stringMap.put(GOLF_COURSE_DOWNLOAD, "GOLF_COURSE_DOWNLOAD");
        stringMap.put(DEVICE_INITIATES_SYNC, "DEVICE_INITIATES_SYNC");
        stringMap.put(CONNECT_IQ_WATCH_APP_DOWNLOAD, "CONNECT_IQ_WATCH_APP_DOWNLOAD");
        stringMap.put(CONNECT_IQ_WIDGET_DOWNLOAD, "CONNECT_IQ_WIDGET_DOWNLOAD");
        stringMap.put(CONNECT_IQ_WATCH_FACE_DOWNLOAD, "CONNECT_IQ_WATCH_FACE_DOWNLOAD");
        stringMap.put(CONNECT_IQ_DATA_FIELD_DOWNLOAD, "CONNECT_IQ_DATA_FIELD_DOWNLOAD");
        stringMap.put(CONNECT_IQ_APP_MANAGMENT, "CONNECT_IQ_APP_MANAGMENT");
        stringMap.put(SWING_SENSOR, "SWING_SENSOR");
        stringMap.put(SWING_SENSOR_REMOTE, "SWING_SENSOR_REMOTE");
        stringMap.put(INCIDENT_DETECTION, "INCIDENT_DETECTION");
        stringMap.put(AUDIO_PROMPTS, "AUDIO_PROMPTS");
        stringMap.put(WIFI_VERIFICATION, "WIFI_VERIFICATION");
        stringMap.put(TRUE_UP, "TRUE_UP");
        stringMap.put(FIND_MY_WATCH, "FIND_MY_WATCH");
        stringMap.put(REMOTE_MANUAL_SYNC, "REMOTE_MANUAL_SYNC");
        stringMap.put(LIVE_TRACK_AUTO_START, "LIVE_TRACK_AUTO_START");
        stringMap.put(LIVE_TRACK_MESSAGING, "LIVE_TRACK_MESSAGING");
        stringMap.put(INSTANT_INPUT, "INSTANT_INPUT");
    }


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

}
