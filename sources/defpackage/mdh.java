package defpackage;

/* compiled from: PG */
/* renamed from: mdh  reason: default package */
/* loaded from: classes.dex */
public enum mdh implements nfp {
    UNKNOWN_ERROR(0),
    UNSUPPORTED_COMBINATION(1);
    
    public final int c;

    mdh(int i) {
        this.c = i;
    }

    public static mdh b(int i) {
        if (i != 0) {
            if (i == 1) {
                return UNSUPPORTED_COMBINATION;
            }
            return null;
        }
        return UNKNOWN_ERROR;
    }

    public static nfq c() {
        return mco.n;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
