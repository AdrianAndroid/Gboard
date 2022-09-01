package defpackage;

/* compiled from: PG */
/* renamed from: cgw  reason: default package */
/* loaded from: classes.dex */
public final class cgw extends nfm implements nha {
    public static final cgw b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        cgw cgwVar = new cgw();
        b = cgwVar;
        nfm.L(cgw.class, cgwVar);
    }

    private cgw() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", cgv.class});
            }
            if (i2 == 3) {
                return new cgw();
            }
            if (i2 == 4) {
                return new nfh(b);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (cgw.class) {
                    nhfVar = c;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        c = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
