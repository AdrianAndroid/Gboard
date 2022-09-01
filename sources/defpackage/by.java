package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: mxo  reason: default package */
/* loaded from: classes2.dex */
public enum mxo implements nfp {
    UNKNOWN_LOCAL_MATERIAL(0),
    INPUT_ACTIONS(1),
    KEYBOARD_LAYOUT(2),
    SESSION(3),
    UNIFIED_PARAMS(7),
    AUTO_CORRECTION_STATS(4),
    SPATIAL_STATS(5),
    TYPO_STATS(6),
    COUNTS(8),
    BASIS_COUNTS_STATS(9),
    CANDIDATE_RECALL_COUNTS_STATS(10),
    TYPING_QUALITY_COUNTS_STATS(11),
    AC_THRESHOLD(12),
    KC_THRESHOLD(13);
    
    private final int o;

    mxo(int i) {
        this.o = i;
    }

    public static mxo b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_LOCAL_MATERIAL;
            case 1:
                return INPUT_ACTIONS;
            case 2:
                return KEYBOARD_LAYOUT;
            case 3:
                return SESSION;
            case 4:
                return AUTO_CORRECTION_STATS;
            case 5:
                return SPATIAL_STATS;
            case 6:
                return TYPO_STATS;
            case 7:
                return UNIFIED_PARAMS;
            case 8:
                return COUNTS;
            case 9:
                return BASIS_COUNTS_STATS;
            case 10:
                return CANDIDATE_RECALL_COUNTS_STATS;
            case 11:
                return TYPING_QUALITY_COUNTS_STATS;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return AC_THRESHOLD;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return KC_THRESHOLD;
            default:
                return null;
        }
    }

    public static nfq c() {
        return mxe.d;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
