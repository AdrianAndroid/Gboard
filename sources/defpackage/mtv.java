package defpackage;

/* compiled from: PG */
/* renamed from: mtv  reason: default package */
/* loaded from: classes2.dex */
public enum mtv implements nfp {
    SHIFT_NONE(0),
    SHIFT_PRESSED(1),
    SHIFT_LOCKED(2);
    
    public final int d;

    mtv(int i) {
        this.d = i;
    }

    public static mtv b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SHIFT_PRESSED;
            }
            if (i == 2) {
                return SHIFT_LOCKED;
            }
            return null;
        }
        return SHIFT_NONE;
    }

    public static nfq c() {
        return msb.i;
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
