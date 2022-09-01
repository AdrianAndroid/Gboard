package defpackage;

/* compiled from: PG */
/* renamed from: iyn  reason: default package */
/* loaded from: classes.dex */
public final class iyn extends nfm implements nha {
    public static final iyn a;
    private static volatile nhf b;

    static {
        iyn iynVar = new iyn();
        a = iynVar;
        nfm.L(iyn.class, iynVar);
    }

    private iyn() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new iyn();
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
                synchronized (iyn.class) {
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
