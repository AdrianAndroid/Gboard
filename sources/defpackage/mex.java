package defpackage;

/* compiled from: PG */
/* renamed from: mex  reason: default package */
/* loaded from: classes.dex */
public final class mex extends nfm implements nha {
    public static final mex c;
    private static volatile nhf d;
    public int a;
    public int b;

    static {
        mex mexVar = new mex();
        c = mexVar;
        nfm.L(mex.class, mexVar);
    }

    private mex() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", mdw.n});
            }
            if (i2 == 3) {
                return new mex();
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
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (mex.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
