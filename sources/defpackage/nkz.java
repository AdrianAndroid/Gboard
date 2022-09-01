package defpackage;

/* compiled from: PG */
/* renamed from: nkz  reason: default package */
/* loaded from: classes2.dex */
public final class nkz extends nfm implements nha {
    public static final nkz c;
    public static final ngt d;
    private static volatile nhf e;
    public int a;
    public int b;

    static {
        nkz nkzVar = new nkz();
        c = nkzVar;
        nfm.L(nkz.class, nkzVar);
        d = nfm.P(nks.f, nkzVar, nkzVar, 29735924, nik.MESSAGE);
    }

    private nkz() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new nkz();
            }
            if (i2 == 4) {
                return new nfh(c);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (nkz.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
