package defpackage;

/* compiled from: PG */
/* renamed from: mev  reason: default package */
/* loaded from: classes.dex */
public enum mev implements nfp {
    SOURCE_UNKNOWN(0),
    BANNER(1),
    SETTINGS(2);
    
    public final int d;

    mev(int i) {
        this.d = i;
    }

    public static mev b(int i) {
        if (i != 0) {
            if (i == 1) {
                return BANNER;
            }
            if (i == 2) {
                return SETTINGS;
            }
            return null;
        }
        return SOURCE_UNKNOWN;
    }

    public static nfq c() {
        return mdw.m;
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
