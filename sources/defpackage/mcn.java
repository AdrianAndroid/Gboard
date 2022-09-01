package defpackage;

/* compiled from: PG */
/* renamed from: mcn  reason: default package */
/* loaded from: classes.dex */
public enum mcn implements nfp {
    VIEW_UNKNOWN(0),
    SETTINGS(1),
    KEYBOARD(2);
    
    public final int d;

    mcn(int i) {
        this.d = i;
    }

    public static mcn b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SETTINGS;
            }
            if (i == 2) {
                return KEYBOARD;
            }
            return null;
        }
        return VIEW_UNKNOWN;
    }

    public static nfq c() {
        return mco.b;
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
