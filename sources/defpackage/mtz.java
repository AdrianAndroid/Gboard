package defpackage;

/* compiled from: PG */
/* renamed from: mtz  reason: default package */
/* loaded from: classes2.dex */
public final class mtz extends nfm implements nha {
    public static final mtz f;
    private static volatile nhf g;
    public int a;
    public int b;
    public int c;
    public msg d;
    public long e;

    static {
        mtz mtzVar = new mtz();
        f = mtzVar;
        nfm.L(mtz.class, mtzVar);
    }

    private mtz() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0006ဉ\u0002\u0007င\u0001\bဂ\u0003", new Object[]{"a", "b", msb.k, "d", "c", "e"});
            }
            if (i2 == 3) {
                return new mtz();
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
                synchronized (mtz.class) {
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
