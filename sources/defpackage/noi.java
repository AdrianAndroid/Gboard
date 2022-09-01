package defpackage;

/* compiled from: PG */
/* renamed from: noi  reason: default package */
/* loaded from: classes2.dex */
public final class noi extends nfm implements nha {
    public static final noi b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        noi noiVar = new noi();
        b = noiVar;
        nfm.L(noi.class, noiVar);
    }

    private noi() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", noh.class});
            }
            if (i2 == 3) {
                return new noi();
            }
            if (i2 == 4) {
                return new nfh((int[][][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (noi.class) {
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
