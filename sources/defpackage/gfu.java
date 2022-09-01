package defpackage;

/* compiled from: PG */
/* renamed from: gfu  reason: default package */
/* loaded from: classes.dex */
public enum gfu implements nfp {
    DEFAULT_ATTRIBUTE(0),
    USER_DICTIONARY(1),
    USER_HISTORY(2),
    SPELLING_CORRECTION(3),
    TYPING_CORRECTION(4);
    
    private final int f;

    gfu(int i) {
        this.f = i;
    }

    public static gfu b(int i) {
        if (i != 0) {
            if (i == 1) {
                return USER_DICTIONARY;
            }
            if (i == 2) {
                return USER_HISTORY;
            }
            if (i == 3) {
                return SPELLING_CORRECTION;
            }
            if (i == 4) {
                return TYPING_CORRECTION;
            }
            return null;
        }
        return DEFAULT_ATTRIBUTE;
    }

    public static nfq c() {
        return cgs.k;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
