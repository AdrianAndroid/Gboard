package defpackage;

/* compiled from: PG */
/* renamed from: izq  reason: default package */
/* loaded from: classes.dex */
public enum izq {
    TEST_FEATURE(1),
    SPATIAL_STATS(2),
    TYPO_STATS(3),
    KC_THRESHOLD(4),
    GESTURE_REVERT_STATS(5),
    AUTO_CORRECTION_STATS(6),
    AUTO_CORRECTION_THRESHOLD(7),
    PERSONALIZED_FST_MODEL_PARAMS(8),
    LITERAL_START_PENALTY(9),
    METRIC_COUNTS_STATS(10),
    LAST_FEATURE_DO_NOT_USE(11),
    FEATUREONEOF_NOT_SET(0);
    
    public final int m;

    izq(int i) {
        this.m = i;
    }

    public static izq a(int i) {
        switch (i) {
            case 0:
                return FEATUREONEOF_NOT_SET;
            case 1:
                return TEST_FEATURE;
            case 2:
                return SPATIAL_STATS;
            case 3:
                return TYPO_STATS;
            case 4:
                return KC_THRESHOLD;
            case 5:
                return GESTURE_REVERT_STATS;
            case 6:
                return AUTO_CORRECTION_STATS;
            case 7:
                return AUTO_CORRECTION_THRESHOLD;
            case 8:
                return PERSONALIZED_FST_MODEL_PARAMS;
            case 9:
                return LITERAL_START_PENALTY;
            case 10:
                return METRIC_COUNTS_STATS;
            case 11:
                return LAST_FEATURE_DO_NOT_USE;
            default:
                return null;
        }
    }
}
