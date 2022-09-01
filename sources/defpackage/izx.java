package defpackage;

/* compiled from: PG */
/* renamed from: izx  reason: default package */
/* loaded from: classes.dex */
public final class izx extends nfm implements nha {
    public static final izx a;
    private static volatile nhf b;

    static {
        izx izxVar = new izx();
        a = izxVar;
        nfm.L(izx.class, izxVar);
    }

    private izx() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new izx();
            }
            if (i2 == 4) {
                return new nfh(a);
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = b;
            if (nhfVar == null) {
                synchronized (izx.class) {
                    nhfVar = b;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        b = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
