package defpackage;

/* compiled from: PG */
/* renamed from: mdj  reason: default package */
/* loaded from: classes.dex */
public enum mdj implements nfp {
    UNKNOWN_TYPE(0),
    ZERO_STATE(1),
    QUERY(2);
    
    public final int d;

    mdj(int i) {
        this.d = i;
    }

    public static mdj b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ZERO_STATE;
            }
            if (i == 2) {
                return QUERY;
            }
            return null;
        }
        return UNKNOWN_TYPE;
    }

    public static nfq c() {
        return mco.o;
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
