package defpackage;

/* compiled from: PG */
/* renamed from: mrx  reason: default package */
/* loaded from: classes2.dex */
public enum mrx implements nfp {
    UNKNOWN(1),
    SEGMENTATION_FAULT(2),
    ABORT(3),
    ANR(4);
    
    private final int e;

    mrx(int i) {
        this.e = i;
    }

    public static mrx b(int i) {
        if (i != 1) {
            if (i == 2) {
                return SEGMENTATION_FAULT;
            }
            if (i == 3) {
                return ABORT;
            }
            if (i == 4) {
                return ANR;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static nfq c() {
        return msb.b;
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
