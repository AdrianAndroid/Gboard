package defpackage;

/* compiled from: PG */
/* renamed from: cmf  reason: default package */
/* loaded from: classes.dex */
public enum cmf implements nfp {
    UNKNOWN(0),
    APPEND(1),
    SUMMARY(2),
    BEAT(3),
    FALLBACK(4),
    MULTIPLE_LINE_HEART(5),
    UNRECOGNIZED(-1);
    
    private final int h;

    cmf(int i2) {
        this.h = i2;
    }

    public static cmf b(int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return APPEND;
            }
            if (i2 == 2) {
                return SUMMARY;
            }
            if (i2 == 3) {
                return BEAT;
            }
            if (i2 == 4) {
                return FALLBACK;
            }
            if (i2 == 5) {
                return MULTIPLE_LINE_HEART;
            }
            return null;
        }
        return UNKNOWN;
    }

    @Override // defpackage.nfp
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
