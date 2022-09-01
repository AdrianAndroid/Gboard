package defpackage;

/* compiled from: PG */
/* renamed from: nkm  reason: default package */
/* loaded from: classes2.dex */
public final class nkm extends nfm implements nha {
    public static final nkm c;
    public static final ngt d;
    private static volatile nhf e;
    public int a;
    public boolean b;

    static {
        nkm nkmVar = new nkm();
        c = nkmVar;
        nfm.L(nkm.class, nkmVar);
        d = nfm.P(nks.f, nkmVar, nkmVar, 77499489, nik.MESSAGE);
    }

    private nkm() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new nkm();
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
                synchronized (nkm.class) {
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
