package defpackage;

/* compiled from: PG */
/* renamed from: eup  reason: default package */
/* loaded from: classes.dex */
public enum eup implements nfp {
    FLAG_ID_NONE(0),
    DUMMY_FLAG_FOR_TESTING(1),
    USE_RECT_KEY_ON_GRADIENT_THEME(5),
    PILL_SHAPED_KEY(6),
    AC_INDICATOR_LOW_CONTRAST(7),
    CONSISTENT_NAV(8);
    
    private final int g;

    eup(int i) {
        this.g = i;
    }

    public static eup b(int i) {
        if (i != 0) {
            if (i == 1) {
                return DUMMY_FLAG_FOR_TESTING;
            }
            if (i == 5) {
                return USE_RECT_KEY_ON_GRADIENT_THEME;
            }
            if (i == 6) {
                return PILL_SHAPED_KEY;
            }
            if (i == 7) {
                return AC_INDICATOR_LOW_CONTRAST;
            }
            if (i == 8) {
                return CONSISTENT_NAV;
            }
            return null;
        }
        return FLAG_ID_NONE;
    }

    public static nfq c() {
        return cgs.f;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
