package defpackage;

/* compiled from: PG */
/* renamed from: mpr  reason: default package */
/* loaded from: classes2.dex */
public final class mpr extends nfm implements nha {
    public static final mpr e;
    private static volatile nhf f;
    public int a;
    public int b = 0;
    public Object c;
    public mps d;

    static {
        mpr mprVar = new mpr();
        e = mprVar;
        nfm.L(mpr.class, mprVar);
    }

    private mpr() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0004\u0001\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0005ွ\u0000\u0006ျ\u0000\u0007ျ\u0000", new Object[]{"c", "b", "a", "d"});
            }
            if (i2 == 3) {
                return new mpr();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (mpr.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
