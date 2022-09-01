package defpackage;

/* compiled from: PG */
/* renamed from: mpt  reason: default package */
/* loaded from: classes2.dex */
public final class mpt extends nfm implements nha {
    public static final mpt g;
    private static volatile nhf h;
    public int a;
    public int b;
    public int c;
    public int d;
    public float e;
    public float f;

    static {
        mpt mptVar = new mpt();
        g = mptVar;
        nfm.L(mpt.class, mptVar);
    }

    private mpt() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0004ဌ\u0003\u0006ခ\u0005\u0007ခ\u0006", new Object[]{"a", "b", "c", "d", mgk.l, "e", "f"});
            }
            if (i2 == 3) {
                return new mpt();
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
                synchronized (mpt.class) {
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
