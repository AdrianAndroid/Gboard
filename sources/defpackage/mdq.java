package defpackage;

/* compiled from: PG */
/* renamed from: mdq  reason: default package */
/* loaded from: classes.dex */
public enum mdq implements nfp {
    PAGE_UNKNOWN(0),
    PAGE_ENABLE_INPUT_METHOD(1),
    PAGE_SELECT_INPUT_METHOD(2),
    PAGE_PERMISSION(3),
    PAGE_DONE(4);
    
    public final int f;

    mdq(int i) {
        this.f = i;
    }

    public static mdq b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PAGE_ENABLE_INPUT_METHOD;
            }
            if (i == 2) {
                return PAGE_SELECT_INPUT_METHOD;
            }
            if (i == 3) {
                return PAGE_PERMISSION;
            }
            if (i == 4) {
                return PAGE_DONE;
            }
            return null;
        }
        return PAGE_UNKNOWN;
    }

    public static nfq c() {
        return mco.s;
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
