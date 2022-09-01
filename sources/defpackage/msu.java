package defpackage;

/* compiled from: PG */
/* renamed from: msu  reason: default package */
/* loaded from: classes2.dex */
public final class msu extends nfm implements nha {
    public static final msu f;
    private static volatile nhf g;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;

    static {
        msu msuVar = new msu();
        f = msuVar;
        nfm.L(msu.class, msuVar);
    }

    private msu() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003င\u0002\u0005ဇ\u0004", new Object[]{"a", "b", "c", msb.d, "d", "e"});
            }
            if (i2 == 3) {
                return new msu();
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
                synchronized (msu.class) {
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
