package defpackage;

/* compiled from: PG */
/* renamed from: mct  reason: default package */
/* loaded from: classes.dex */
public final class mct extends nfm implements nha {
    public static final mct f;
    private static volatile nhf g;
    public int a;
    public int b;
    public int c;
    public int d;
    public nfs e = nfn.b;

    static {
        mct mctVar = new mct();
        f = mctVar;
        nfm.L(mct.class, mctVar);
    }

    private mct() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004\u0016", new Object[]{"a", "b", mco.c, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new mct();
            }
            if (i2 == 4) {
                return new nfh(f);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (mct.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
