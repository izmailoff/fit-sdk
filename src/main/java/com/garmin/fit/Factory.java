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

import java.util.ArrayList;

public class Factory {
    static public Mesg createMesg(Mesg mesg) {
        switch (mesg.getNum()) {
        case MesgNum.FILE_ID:
            return new FileIdMesg(mesg);
        case MesgNum.FILE_CREATOR:
            return new FileCreatorMesg(mesg);
        case MesgNum.TIMESTAMP_CORRELATION:
            return new TimestampCorrelationMesg(mesg);
        case MesgNum.SOFTWARE:
            return new SoftwareMesg(mesg);
        case MesgNum.SLAVE_DEVICE:
            return new SlaveDeviceMesg(mesg);
        case MesgNum.CAPABILITIES:
            return new CapabilitiesMesg(mesg);
        case MesgNum.FILE_CAPABILITIES:
            return new FileCapabilitiesMesg(mesg);
        case MesgNum.MESG_CAPABILITIES:
            return new MesgCapabilitiesMesg(mesg);
        case MesgNum.FIELD_CAPABILITIES:
            return new FieldCapabilitiesMesg(mesg);
        case MesgNum.DEVICE_SETTINGS:
            return new DeviceSettingsMesg(mesg);
        case MesgNum.USER_PROFILE:
            return new UserProfileMesg(mesg);
        case MesgNum.HRM_PROFILE:
            return new HrmProfileMesg(mesg);
        case MesgNum.SDM_PROFILE:
            return new SdmProfileMesg(mesg);
        case MesgNum.BIKE_PROFILE:
            return new BikeProfileMesg(mesg);
        case MesgNum.CONNECTIVITY:
            return new ConnectivityMesg(mesg);
        case MesgNum.WATCHFACE_SETTINGS:
            return new WatchfaceSettingsMesg(mesg);
        case MesgNum.OHR_SETTINGS:
            return new OhrSettingsMesg(mesg);
        case MesgNum.ZONES_TARGET:
            return new ZonesTargetMesg(mesg);
        case MesgNum.SPORT:
            return new SportMesg(mesg);
        case MesgNum.HR_ZONE:
            return new HrZoneMesg(mesg);
        case MesgNum.SPEED_ZONE:
            return new SpeedZoneMesg(mesg);
        case MesgNum.CADENCE_ZONE:
            return new CadenceZoneMesg(mesg);
        case MesgNum.POWER_ZONE:
            return new PowerZoneMesg(mesg);
        case MesgNum.MET_ZONE:
            return new MetZoneMesg(mesg);
        case MesgNum.DIVE_SETTINGS:
            return new DiveSettingsMesg(mesg);
        case MesgNum.DIVE_ALARM:
            return new DiveAlarmMesg(mesg);
        case MesgNum.DIVE_GAS:
            return new DiveGasMesg(mesg);
        case MesgNum.GOAL:
            return new GoalMesg(mesg);
        case MesgNum.ACTIVITY:
            return new ActivityMesg(mesg);
        case MesgNum.SESSION:
            return new SessionMesg(mesg);
        case MesgNum.LAP:
            return new LapMesg(mesg);
        case MesgNum.LENGTH:
            return new LengthMesg(mesg);
        case MesgNum.RECORD:
            return new RecordMesg(mesg);
        case MesgNum.EVENT:
            return new EventMesg(mesg);
        case MesgNum.DEVICE_INFO:
            return new DeviceInfoMesg(mesg);
        case MesgNum.TRAINING_FILE:
            return new TrainingFileMesg(mesg);
        case MesgNum.HRV:
            return new HrvMesg(mesg);
        case MesgNum.WEATHER_CONDITIONS:
            return new WeatherConditionsMesg(mesg);
        case MesgNum.WEATHER_ALERT:
            return new WeatherAlertMesg(mesg);
        case MesgNum.GPS_METADATA:
            return new GpsMetadataMesg(mesg);
        case MesgNum.CAMERA_EVENT:
            return new CameraEventMesg(mesg);
        case MesgNum.GYROSCOPE_DATA:
            return new GyroscopeDataMesg(mesg);
        case MesgNum.ACCELEROMETER_DATA:
            return new AccelerometerDataMesg(mesg);
        case MesgNum.MAGNETOMETER_DATA:
            return new MagnetometerDataMesg(mesg);
        case MesgNum.BAROMETER_DATA:
            return new BarometerDataMesg(mesg);
        case MesgNum.THREE_D_SENSOR_CALIBRATION:
            return new ThreeDSensorCalibrationMesg(mesg);
        case MesgNum.ONE_D_SENSOR_CALIBRATION:
            return new OneDSensorCalibrationMesg(mesg);
        case MesgNum.VIDEO_FRAME:
            return new VideoFrameMesg(mesg);
        case MesgNum.OBDII_DATA:
            return new ObdiiDataMesg(mesg);
        case MesgNum.NMEA_SENTENCE:
            return new NmeaSentenceMesg(mesg);
        case MesgNum.AVIATION_ATTITUDE:
            return new AviationAttitudeMesg(mesg);
        case MesgNum.VIDEO:
            return new VideoMesg(mesg);
        case MesgNum.VIDEO_TITLE:
            return new VideoTitleMesg(mesg);
        case MesgNum.VIDEO_DESCRIPTION:
            return new VideoDescriptionMesg(mesg);
        case MesgNum.VIDEO_CLIP:
            return new VideoClipMesg(mesg);
        case MesgNum.SET:
            return new SetMesg(mesg);
        case MesgNum.COURSE:
            return new CourseMesg(mesg);
        case MesgNum.COURSE_POINT:
            return new CoursePointMesg(mesg);
        case MesgNum.SEGMENT_ID:
            return new SegmentIdMesg(mesg);
        case MesgNum.SEGMENT_LEADERBOARD_ENTRY:
            return new SegmentLeaderboardEntryMesg(mesg);
        case MesgNum.SEGMENT_POINT:
            return new SegmentPointMesg(mesg);
        case MesgNum.SEGMENT_LAP:
            return new SegmentLapMesg(mesg);
        case MesgNum.SEGMENT_FILE:
            return new SegmentFileMesg(mesg);
        case MesgNum.WORKOUT:
            return new WorkoutMesg(mesg);
        case MesgNum.WORKOUT_SESSION:
            return new WorkoutSessionMesg(mesg);
        case MesgNum.WORKOUT_STEP:
            return new WorkoutStepMesg(mesg);
        case MesgNum.EXERCISE_TITLE:
            return new ExerciseTitleMesg(mesg);
        case MesgNum.SCHEDULE:
            return new ScheduleMesg(mesg);
        case MesgNum.TOTALS:
            return new TotalsMesg(mesg);
        case MesgNum.WEIGHT_SCALE:
            return new WeightScaleMesg(mesg);
        case MesgNum.BLOOD_PRESSURE:
            return new BloodPressureMesg(mesg);
        case MesgNum.MONITORING_INFO:
            return new MonitoringInfoMesg(mesg);
        case MesgNum.MONITORING:
            return new MonitoringMesg(mesg);
        case MesgNum.HR:
            return new HrMesg(mesg);
        case MesgNum.STRESS_LEVEL:
            return new StressLevelMesg(mesg);
        case MesgNum.MEMO_GLOB:
            return new MemoGlobMesg(mesg);
        case MesgNum.ANT_CHANNEL_ID:
            return new AntChannelIdMesg(mesg);
        case MesgNum.ANT_RX:
            return new AntRxMesg(mesg);
        case MesgNum.ANT_TX:
            return new AntTxMesg(mesg);
        case MesgNum.EXD_SCREEN_CONFIGURATION:
            return new ExdScreenConfigurationMesg(mesg);
        case MesgNum.EXD_DATA_FIELD_CONFIGURATION:
            return new ExdDataFieldConfigurationMesg(mesg);
        case MesgNum.EXD_DATA_CONCEPT_CONFIGURATION:
            return new ExdDataConceptConfigurationMesg(mesg);
        case MesgNum.FIELD_DESCRIPTION:
            return new FieldDescriptionMesg(mesg);
        case MesgNum.DEVELOPER_DATA_ID:
            return new DeveloperDataIdMesg(mesg);
        case MesgNum.DIVE_SUMMARY:
            return new DiveSummaryMesg(mesg);
        case MesgNum.PAD:
            return new PadMesg(mesg);
        default:
            break;
        }
        return new Mesg("unknown", MesgNum.INVALID);
    }

    static public Mesg createMesg(int mesgNum) {
        for (int i = 0; i < mesgs.length; i++) {
            if (mesgs[i].num == mesgNum) {
                return new Mesg(mesgs[i]);
            }
        }
        return new Mesg("unknown", mesgNum);
    }

    static public Mesg createMesg(String mesgName) {
        for (int i = 0; i < mesgs.length; i++) {
            if (mesgs[i].name.equals(mesgName)) {
                return new Mesg(mesgs[i]);
            }
        }
        return new Mesg(mesgName, MesgNum.INVALID);
    }

    static public Field createField(String mesgName, String fieldName) {
        for (int i = 0; i < mesgs.length; i++) {
            if (mesgs[i].name.equals(mesgName)) {
                return new Field(mesgs[i].getField(fieldName, false));
            }
        }
        return new Field(fieldName, Fit.FIELD_NUM_INVALID, 0, 1, 0, "", false, Profile.Type.ENUM);
    }

    static public Field createField(String mesgName, int fieldNum) {
        for (int i = 0; i < mesgs.length; i++) {
            if (mesgs[i].name.equals(mesgName)) {
                return new Field(mesgs[i].getField(fieldNum));
            }
        }
        return new Field("unknown", fieldNum, 0, 1, 0, "", false, Profile.Type.ENUM);
    }

    static public Field createField(int mesgNum, int fieldNum) {
        for (int i = 0; i < mesgs.length; i++) {
            if (mesgs[i].num == mesgNum) {
                return new Field(mesgs[i].getField(fieldNum));
            }
        }
        return new Field("unknown", fieldNum, 0, 1, 0, "", false, Profile.Type.ENUM);
    }

    static public Field createField(int mesgNum, String fieldName) {
        for (int i = 0; i < mesgs.length; i++) {
            if (mesgs[i].num == mesgNum) {
                return new Field(mesgs[i].getField(fieldName, false));
            }
        }
        return new Field(fieldName, Fit.FIELD_NUM_INVALID, 0, 1, 0, "", false, Profile.Type.ENUM);
    }

    static public Field createField(String mesgName, String fieldName, ArrayList<Object> values) {
        Field field = createField(mesgName, fieldName);
        field.values = values;
        return field;
    }

    private static final Mesg mesgs[] = new Mesg[86];

    static {
        int mesg_index = 0;
        mesgs[mesg_index] = FileIdMesg.fileIdMesg;
        mesg_index++;
        mesgs[mesg_index] = FileCreatorMesg.fileCreatorMesg;
        mesg_index++;
        mesgs[mesg_index] = TimestampCorrelationMesg.timestampCorrelationMesg;
        mesg_index++;
        mesgs[mesg_index] = SoftwareMesg.softwareMesg;
        mesg_index++;
        mesgs[mesg_index] = SlaveDeviceMesg.slaveDeviceMesg;
        mesg_index++;
        mesgs[mesg_index] = CapabilitiesMesg.capabilitiesMesg;
        mesg_index++;
        mesgs[mesg_index] = FileCapabilitiesMesg.fileCapabilitiesMesg;
        mesg_index++;
        mesgs[mesg_index] = MesgCapabilitiesMesg.mesgCapabilitiesMesg;
        mesg_index++;
        mesgs[mesg_index] = FieldCapabilitiesMesg.fieldCapabilitiesMesg;
        mesg_index++;
        mesgs[mesg_index] = DeviceSettingsMesg.deviceSettingsMesg;
        mesg_index++;
        mesgs[mesg_index] = UserProfileMesg.userProfileMesg;
        mesg_index++;
        mesgs[mesg_index] = HrmProfileMesg.hrmProfileMesg;
        mesg_index++;
        mesgs[mesg_index] = SdmProfileMesg.sdmProfileMesg;
        mesg_index++;
        mesgs[mesg_index] = BikeProfileMesg.bikeProfileMesg;
        mesg_index++;
        mesgs[mesg_index] = ConnectivityMesg.connectivityMesg;
        mesg_index++;
        mesgs[mesg_index] = WatchfaceSettingsMesg.watchfaceSettingsMesg;
        mesg_index++;
        mesgs[mesg_index] = OhrSettingsMesg.ohrSettingsMesg;
        mesg_index++;
        mesgs[mesg_index] = ZonesTargetMesg.zonesTargetMesg;
        mesg_index++;
        mesgs[mesg_index] = SportMesg.sportMesg;
        mesg_index++;
        mesgs[mesg_index] = HrZoneMesg.hrZoneMesg;
        mesg_index++;
        mesgs[mesg_index] = SpeedZoneMesg.speedZoneMesg;
        mesg_index++;
        mesgs[mesg_index] = CadenceZoneMesg.cadenceZoneMesg;
        mesg_index++;
        mesgs[mesg_index] = PowerZoneMesg.powerZoneMesg;
        mesg_index++;
        mesgs[mesg_index] = MetZoneMesg.metZoneMesg;
        mesg_index++;
        mesgs[mesg_index] = DiveSettingsMesg.diveSettingsMesg;
        mesg_index++;
        mesgs[mesg_index] = DiveAlarmMesg.diveAlarmMesg;
        mesg_index++;
        mesgs[mesg_index] = DiveGasMesg.diveGasMesg;
        mesg_index++;
        mesgs[mesg_index] = GoalMesg.goalMesg;
        mesg_index++;
        mesgs[mesg_index] = ActivityMesg.activityMesg;
        mesg_index++;
        mesgs[mesg_index] = SessionMesg.sessionMesg;
        mesg_index++;
        mesgs[mesg_index] = LapMesg.lapMesg;
        mesg_index++;
        mesgs[mesg_index] = LengthMesg.lengthMesg;
        mesg_index++;
        mesgs[mesg_index] = RecordMesg.recordMesg;
        mesg_index++;
        mesgs[mesg_index] = EventMesg.eventMesg;
        mesg_index++;
        mesgs[mesg_index] = DeviceInfoMesg.deviceInfoMesg;
        mesg_index++;
        mesgs[mesg_index] = TrainingFileMesg.trainingFileMesg;
        mesg_index++;
        mesgs[mesg_index] = HrvMesg.hrvMesg;
        mesg_index++;
        mesgs[mesg_index] = WeatherConditionsMesg.weatherConditionsMesg;
        mesg_index++;
        mesgs[mesg_index] = WeatherAlertMesg.weatherAlertMesg;
        mesg_index++;
        mesgs[mesg_index] = GpsMetadataMesg.gpsMetadataMesg;
        mesg_index++;
        mesgs[mesg_index] = CameraEventMesg.cameraEventMesg;
        mesg_index++;
        mesgs[mesg_index] = GyroscopeDataMesg.gyroscopeDataMesg;
        mesg_index++;
        mesgs[mesg_index] = AccelerometerDataMesg.accelerometerDataMesg;
        mesg_index++;
        mesgs[mesg_index] = MagnetometerDataMesg.magnetometerDataMesg;
        mesg_index++;
        mesgs[mesg_index] = BarometerDataMesg.barometerDataMesg;
        mesg_index++;
        mesgs[mesg_index] = ThreeDSensorCalibrationMesg.threeDSensorCalibrationMesg;
        mesg_index++;
        mesgs[mesg_index] = OneDSensorCalibrationMesg.oneDSensorCalibrationMesg;
        mesg_index++;
        mesgs[mesg_index] = VideoFrameMesg.videoFrameMesg;
        mesg_index++;
        mesgs[mesg_index] = ObdiiDataMesg.obdiiDataMesg;
        mesg_index++;
        mesgs[mesg_index] = NmeaSentenceMesg.nmeaSentenceMesg;
        mesg_index++;
        mesgs[mesg_index] = AviationAttitudeMesg.aviationAttitudeMesg;
        mesg_index++;
        mesgs[mesg_index] = VideoMesg.videoMesg;
        mesg_index++;
        mesgs[mesg_index] = VideoTitleMesg.videoTitleMesg;
        mesg_index++;
        mesgs[mesg_index] = VideoDescriptionMesg.videoDescriptionMesg;
        mesg_index++;
        mesgs[mesg_index] = VideoClipMesg.videoClipMesg;
        mesg_index++;
        mesgs[mesg_index] = SetMesg.setMesg;
        mesg_index++;
        mesgs[mesg_index] = CourseMesg.courseMesg;
        mesg_index++;
        mesgs[mesg_index] = CoursePointMesg.coursePointMesg;
        mesg_index++;
        mesgs[mesg_index] = SegmentIdMesg.segmentIdMesg;
        mesg_index++;
        mesgs[mesg_index] = SegmentLeaderboardEntryMesg.segmentLeaderboardEntryMesg;
        mesg_index++;
        mesgs[mesg_index] = SegmentPointMesg.segmentPointMesg;
        mesg_index++;
        mesgs[mesg_index] = SegmentLapMesg.segmentLapMesg;
        mesg_index++;
        mesgs[mesg_index] = SegmentFileMesg.segmentFileMesg;
        mesg_index++;
        mesgs[mesg_index] = WorkoutMesg.workoutMesg;
        mesg_index++;
        mesgs[mesg_index] = WorkoutSessionMesg.workoutSessionMesg;
        mesg_index++;
        mesgs[mesg_index] = WorkoutStepMesg.workoutStepMesg;
        mesg_index++;
        mesgs[mesg_index] = ExerciseTitleMesg.exerciseTitleMesg;
        mesg_index++;
        mesgs[mesg_index] = ScheduleMesg.scheduleMesg;
        mesg_index++;
        mesgs[mesg_index] = TotalsMesg.totalsMesg;
        mesg_index++;
        mesgs[mesg_index] = WeightScaleMesg.weightScaleMesg;
        mesg_index++;
        mesgs[mesg_index] = BloodPressureMesg.bloodPressureMesg;
        mesg_index++;
        mesgs[mesg_index] = MonitoringInfoMesg.monitoringInfoMesg;
        mesg_index++;
        mesgs[mesg_index] = MonitoringMesg.monitoringMesg;
        mesg_index++;
        mesgs[mesg_index] = HrMesg.hrMesg;
        mesg_index++;
        mesgs[mesg_index] = StressLevelMesg.stressLevelMesg;
        mesg_index++;
        mesgs[mesg_index] = MemoGlobMesg.memoGlobMesg;
        mesg_index++;
        mesgs[mesg_index] = AntChannelIdMesg.antChannelIdMesg;
        mesg_index++;
        mesgs[mesg_index] = AntRxMesg.antRxMesg;
        mesg_index++;
        mesgs[mesg_index] = AntTxMesg.antTxMesg;
        mesg_index++;
        mesgs[mesg_index] = ExdScreenConfigurationMesg.exdScreenConfigurationMesg;
        mesg_index++;
        mesgs[mesg_index] = ExdDataFieldConfigurationMesg.exdDataFieldConfigurationMesg;
        mesg_index++;
        mesgs[mesg_index] = ExdDataConceptConfigurationMesg.exdDataConceptConfigurationMesg;
        mesg_index++;
        mesgs[mesg_index] = FieldDescriptionMesg.fieldDescriptionMesg;
        mesg_index++;
        mesgs[mesg_index] = DeveloperDataIdMesg.developerDataIdMesg;
        mesg_index++;
        mesgs[mesg_index] = DiveSummaryMesg.diveSummaryMesg;
        mesg_index++;
        mesgs[mesg_index] = PadMesg.padMesg;
        mesg_index++;
        
    }
}
