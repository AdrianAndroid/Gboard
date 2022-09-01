package defpackage;

/* compiled from: PG */
/* renamed from: mfq  reason: default package */
/* loaded from: classes.dex */
public final class mfq extends nfm implements nha {
    public static final mfq g;
    private static volatile nhf h;
    public int a;
    public mfp b;
    public mfo c;
    public int d;
    public int e;
    public nga f = nhi.b;

    static {
        mfq mfqVar = new mfq();
        g = mfqVar;
        nfm.L(mfq.class, mfqVar);
    }

    private mfq() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0002\t\u0003\t\u0004\f\u0005\f\u0006\u001b", new Object[]{"a", "c", "b", "d", "e", "f", mfm.class});
            }
            if (i2 == 3) {
                return new mfq();
            }
            if (i2 == 4) {
                return new nfh(g);
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = h;
            if (nhfVar == null) {
                synchronized (mfq.class) {
                    nhfVar = h;
                    if (nhfVar == null) {
                        nhfVar = new nfi(g);
                        h = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
