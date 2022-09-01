package defpackage;

/* compiled from: PG */
/* renamed from: mcp  reason: default package */
/* loaded from: classes.dex */
public enum mcp implements nfp {
    IME_UNKNOWN(0),
    HANDWRITING(1),
    JAPANESE_IME(2),
    INDIC_IME(3);
    
    public final int e;

    mcp(int i) {
        this.e = i;
    }

    public static mcp b(int i) {
        if (i != 0) {
            if (i == 1) {
                return HANDWRITING;
            }
            if (i == 2) {
                return JAPANESE_IME;
            }
            if (i == 3) {
                return INDIC_IME;
            }
            return null;
        }
        return IME_UNKNOWN;
    }

    public static nfq c() {
        return mco.a;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
