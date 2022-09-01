package defpackage;

/* compiled from: PG */
/* renamed from: nlo  reason: default package */
/* loaded from: classes2.dex */
public final class nlo extends nfm implements nha {
    public static final nlo b;
    private static volatile nhf d;
    public float a;
    private int c;

    static {
        nlo nloVar = new nlo();
        b = nloVar;
        nfm.L(nlo.class, nloVar);
    }

    private nlo() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ခ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new nlo();
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
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (nlo.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
