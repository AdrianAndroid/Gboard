package defpackage;

/* compiled from: PG */
/* renamed from: msd  reason: default package */
/* loaded from: classes2.dex */
public final class msd extends nfm implements nha {
    public static final msd f;
    private static volatile nhf g;
    public int a;
    public int b;
    public nga c = nhi.b;
    public int d;
    public int e;

    static {
        msd msdVar = new msd();
        f = msdVar;
        nfm.L(msd.class, msdVar);
    }

    private msd() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001a\u0004င\u0002\u0005င\u0003", new Object[]{"a", "b", msb.a, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new msd();
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
                synchronized (msd.class) {
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
