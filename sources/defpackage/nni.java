package defpackage;

/* compiled from: PG */
/* renamed from: nni  reason: default package */
/* loaded from: classes2.dex */
public enum nni implements nfp {
    UNKNOWN(0),
    SESSION(1),
    TEST_MESSAGE(2),
    CLIENT_EVENT_EXAMPLE_EVENT(3),
    TEST_MESSAGE_WITH_FILE(4),
    AUDIO_UNLABELED(1000),
    AUDIO_POSITIVE(1004),
    AUDIO_NEGATIVE(1005),
    HOTWORD_INFO(1001),
    HOTWORD_INFO_TEST(1011),
    RECOGNITION_INFO(1002),
    CLIENT_EVENT_SERVER_HOTWORD_INFO(1003),
    CLIENT_EVENT_SERVER_HOTWORD_MULTIDEVICE_SUPPRESSED(1014),
    CLIENT_EVENT_SERVER_RECOGNITION_INFO(1010),
    CLIENT_EVENT_SCREEN_OFF(1006),
    CLIENT_EVENT_SCREEN_ON(1007),
    CLIENT_EVENT_DEVICE_UNLOCKED(1008),
    CLIENT_EVENT_SERVER_EMPTY_QUERY(1009),
    CLIENT_EVENT_OPA_TRIGGER_TYPE(1012),
    CLIENT_EVENT_OPA_ACTIVITY_DISMISS(1013),
    CLIENT_EVENT_OPA_ACTIVITY_DISMISSED_TYPE(1015),
    CLIENT_EVENT_NGA_USER_CANCELLED_ACTIVITY(1016),
    HOME_AEC_EVENT(2000),
    HOME_ALARM_TIMER_EVENT(2001),
    HOME_CONVERSATION_EVENT(2002),
    HOME_DEVICE_STATE_EVENT(2003),
    HOME_RECOGNITION_EVENT(2004),
    HOME_DEVICE_SETTINGS(2005),
    HOME_VOLUME_CHANGE_EVENT(2006),
    HOME_SODA_AUDIO_EVENT(2007),
    HOME_SODA_HOTWORD_EVENT(2008),
    HOME_VISION_FACE_BOUNDING_BOX_EVENT(2009),
    HOME_INTERACTION(2010),
    HOME_USER_EVENT(2011),
    HOME_ACTIVE_SPEAKER_DETECTION(2012),
    HOME_GAZE(2013),
    HOME_SCREEN_TOUCH(2014),
    HOME_ASD_HOTWORD(2015),
    HOME_HOTGAZE_METRICS(2016),
    HOME_HOTWORD_CACHE_EVENT(2017),
    HOME_LIGHT_SENSOR_EVENT(2018),
    SESSION_SCORE_EVENT(2019),
    HOME_SODA_HOTWORD_TIMEOUT_EVENT_WITH_FOLLOWUP(2020),
    HOME_SODA_HOTWORD_TIMEOUT_EVENT_HIGH_THRESHOLD(2021),
    HOME_AUDIO_METRICS_EVENT(2022),
    HOME_DARK_VISION(2023),
    HOME_MEDIA_TYPES_EVENT(2024),
    GBOARD_SESSION(3003),
    GBOARD_VOICE_RECORDING(3006),
    GBOARD_VOICE_INPUT_CONTEXT(3007),
    GBOARD_KEYBOARD_SESSION(3008),
    GBOARD_INPUT_TURN(3009),
    AIAI_VOICE_RECORDING(4000),
    AIAI_CORRECTIONS(4001),
    AIAI_VOICE_INPUT_CONTEXT(4002),
    AIAI_RECOGNITION_ENDPOINT(4003),
    AIAI_RECOGNITION_RESULT(4004),
    AIAI_INPUT_TURN(4005),
    LENS_PROACTIVE_SHOPPING_INTENT(5000),
    SHELDON_TEXT_QUERY(6000),
    SHELDON_AUDIO(6001),
    SHELDON_DEBUG(6002),
    UNINTENDED_ESCAPE_HATCH_CHIP_TAP(7000),
    UNINTENDED_SUPPRESSED_BY_SERVER(7001),
    UNINTENDED_SUPPRESSED_BY_CLIENT(7002),
    UNINTENDED_MODEL_FEATURES(7003),
    SPEECH_LEARNING_SCHEDULING_RESULT(8000),
    SPEECH_LEARNING_TASK_RESULT(8001);
    
    public final int aq;

    nni(int i) {
        this.aq = i;
    }

    public static nni b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SESSION;
            }
            if (i == 2) {
                return TEST_MESSAGE;
            }
            if (i == 3) {
                return CLIENT_EVENT_EXAMPLE_EVENT;
            }
            if (i == 4) {
                return TEST_MESSAGE_WITH_FILE;
            }
            if (i == 3003) {
                return GBOARD_SESSION;
            }
            if (i == 5000) {
                return LENS_PROACTIVE_SHOPPING_INTENT;
            }
            if (i == 8000) {
                return SPEECH_LEARNING_SCHEDULING_RESULT;
            }
            if (i == 8001) {
                return SPEECH_LEARNING_TASK_RESULT;
            }
            switch (i) {
                case 1000:
                    return AUDIO_UNLABELED;
                case 1001:
                    return HOTWORD_INFO;
                case 1002:
                    return RECOGNITION_INFO;
                case 1003:
                    return CLIENT_EVENT_SERVER_HOTWORD_INFO;
                case 1004:
                    return AUDIO_POSITIVE;
                case 1005:
                    return AUDIO_NEGATIVE;
                case 1006:
                    return CLIENT_EVENT_SCREEN_OFF;
                case 1007:
                    return CLIENT_EVENT_SCREEN_ON;
                case 1008:
                    return CLIENT_EVENT_DEVICE_UNLOCKED;
                case 1009:
                    return CLIENT_EVENT_SERVER_EMPTY_QUERY;
                case 1010:
                    return CLIENT_EVENT_SERVER_RECOGNITION_INFO;
                case 1011:
                    return HOTWORD_INFO_TEST;
                case 1012:
                    return CLIENT_EVENT_OPA_TRIGGER_TYPE;
                case 1013:
                    return CLIENT_EVENT_OPA_ACTIVITY_DISMISS;
                case 1014:
                    return CLIENT_EVENT_SERVER_HOTWORD_MULTIDEVICE_SUPPRESSED;
                case 1015:
                    return CLIENT_EVENT_OPA_ACTIVITY_DISMISSED_TYPE;
                case 1016:
                    return CLIENT_EVENT_NGA_USER_CANCELLED_ACTIVITY;
                default:
                    switch (i) {
                        case 2000:
                            return HOME_AEC_EVENT;
                        case 2001:
                            return HOME_ALARM_TIMER_EVENT;
                        case 2002:
                            return HOME_CONVERSATION_EVENT;
                        case 2003:
                            return HOME_DEVICE_STATE_EVENT;
                        case 2004:
                            return HOME_RECOGNITION_EVENT;
                        case 2005:
                            return HOME_DEVICE_SETTINGS;
                        case 2006:
                            return HOME_VOLUME_CHANGE_EVENT;
                        case 2007:
                            return HOME_SODA_AUDIO_EVENT;
                        case 2008:
                            return HOME_SODA_HOTWORD_EVENT;
                        case 2009:
                            return HOME_VISION_FACE_BOUNDING_BOX_EVENT;
                        case 2010:
                            return HOME_INTERACTION;
                        case 2011:
                            return HOME_USER_EVENT;
                        case 2012:
                            return HOME_ACTIVE_SPEAKER_DETECTION;
                        case 2013:
                            return HOME_GAZE;
                        case 2014:
                            return HOME_SCREEN_TOUCH;
                        case 2015:
                            return HOME_ASD_HOTWORD;
                        case 2016:
                            return HOME_HOTGAZE_METRICS;
                        case 2017:
                            return HOME_HOTWORD_CACHE_EVENT;
                        case 2018:
                            return HOME_LIGHT_SENSOR_EVENT;
                        case 2019:
                            return SESSION_SCORE_EVENT;
                        case 2020:
                            return HOME_SODA_HOTWORD_TIMEOUT_EVENT_WITH_FOLLOWUP;
                        case 2021:
                            return HOME_SODA_HOTWORD_TIMEOUT_EVENT_HIGH_THRESHOLD;
                        case 2022:
                            return HOME_AUDIO_METRICS_EVENT;
                        case 2023:
                            return HOME_DARK_VISION;
                        case 2024:
                            return HOME_MEDIA_TYPES_EVENT;
                        default:
                            switch (i) {
                                case 3006:
                                    return GBOARD_VOICE_RECORDING;
                                case 3007:
                                    return GBOARD_VOICE_INPUT_CONTEXT;
                                case 3008:
                                    return GBOARD_KEYBOARD_SESSION;
                                case 3009:
                                    return GBOARD_INPUT_TURN;
                                default:
                                    switch (i) {
                                        case 4000:
                                            return AIAI_VOICE_RECORDING;
                                        case 4001:
                                            return AIAI_CORRECTIONS;
                                        case 4002:
                                            return AIAI_VOICE_INPUT_CONTEXT;
                                        case 4003:
                                            return AIAI_RECOGNITION_ENDPOINT;
                                        case 4004:
                                            return AIAI_RECOGNITION_RESULT;
                                        case 4005:
                                            return AIAI_INPUT_TURN;
                                        default:
                                            switch (i) {
                                                case 6000:
                                                    return SHELDON_TEXT_QUERY;
                                                case 6001:
                                                    return SHELDON_AUDIO;
                                                case 6002:
                                                    return SHELDON_DEBUG;
                                                default:
                                                    switch (i) {
                                                        case 7000:
                                                            return UNINTENDED_ESCAPE_HATCH_CHIP_TAP;
                                                        case 7001:
                                                            return UNINTENDED_SUPPRESSED_BY_SERVER;
                                                        case 7002:
                                                            return UNINTENDED_SUPPRESSED_BY_CLIENT;
                                                        case 7003:
                                                            return UNINTENDED_MODEL_FEATURES;
                                                        default:
                                                            return null;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return UNKNOWN;
    }

    public static nfq c() {
        return nlc.m;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.aq;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.aq);
    }
}
