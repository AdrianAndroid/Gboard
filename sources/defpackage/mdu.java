package defpackage;

/* compiled from: PG */
/* renamed from: mdu  reason: default package */
/* loaded from: classes.dex */
public enum mdu implements nfp {
    VIEW_UNKNOWN(0),
    ENABLE_PAGE(1),
    FIRSTRUN_DONE_PAGE(2),
    ENABLE_DIALOG(3);
    
    public final int e;

    mdu(int i) {
        this.e = i;
    }

    public static mdu b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ENABLE_PAGE;
            }
            if (i == 2) {
                return FIRSTRUN_DONE_PAGE;
            }
            if (i == 3) {
                return ENABLE_DIALOG;
            }
            return null;
        }
        return VIEW_UNKNOWN;
    }

    public static nfq c() {
        return mdw.b;
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
