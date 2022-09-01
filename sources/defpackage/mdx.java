package defpackage;

/* compiled from: PG */
/* renamed from: mdx  reason: default package */
/* loaded from: classes.dex */
public enum mdx implements nfp {
    ENTRYPOINT_UNKNOWN(0),
    SETTINGS(1),
    ACCESS_POINT(2),
    SUGGESTION_BAR(3),
    RECEIVE_PAGE(4);
    
    public final int f;

    mdx(int i) {
        this.f = i;
    }

    public static mdx b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SETTINGS;
            }
            if (i == 2) {
                return ACCESS_POINT;
            }
            if (i == 3) {
                return SUGGESTION_BAR;
            }
            if (i == 4) {
                return RECEIVE_PAGE;
            }
            return null;
        }
        return ENTRYPOINT_UNKNOWN;
    }

    public static nfq c() {
        return mdw.a;
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
