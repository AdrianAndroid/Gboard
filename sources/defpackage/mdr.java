package defpackage;

/* compiled from: PG */
/* renamed from: mdr  reason: default package */
/* loaded from: classes.dex */
public enum mdr implements nfp {
    WIZARD_UNKNOWN(0),
    WIZARD_NORMAL_FIRST_RUN(1),
    WIZARD_WITHOUT_PERMISSION(2),
    WIZARD_ACTIVATION(3);
    
    public final int e;

    mdr(int i) {
        this.e = i;
    }

    public static mdr b(int i) {
        if (i != 0) {
            if (i == 1) {
                return WIZARD_NORMAL_FIRST_RUN;
            }
            if (i == 2) {
                return WIZARD_WITHOUT_PERMISSION;
            }
            if (i == 3) {
                return WIZARD_ACTIVATION;
            }
            return null;
        }
        return WIZARD_UNKNOWN;
    }

    public static nfq c() {
        return mco.t;
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
