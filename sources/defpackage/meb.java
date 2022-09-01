package defpackage;

/* compiled from: PG */
/* renamed from: meb  reason: default package */
/* loaded from: classes.dex */
public enum meb implements nfp {
    UNKNOWN_SUGGESTION_TYPE(0),
    SPELL_CORRECTION(1),
    GRAMMAR_CORRECTION(2);
    
    public final int d;

    meb(int i) {
        this.d = i;
    }

    public static meb b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SPELL_CORRECTION;
            }
            if (i == 2) {
                return GRAMMAR_CORRECTION;
            }
            return null;
        }
        return UNKNOWN_SUGGESTION_TYPE;
    }

    public static nfq c() {
        return mdw.e;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
