package defpackage;

/* compiled from: PG */
/* renamed from: mbu  reason: default package */
/* loaded from: classes.dex */
public final class mbu extends nfm implements nha {
    public static final mbu f;
    private static volatile nhf g;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;

    static {
        mbu mbuVar = new mbu();
        f = mbuVar;
        nfm.L(mbu.class, mbuVar);
    }

    private mbu() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", mbm.e, "d", "e"});
            }
            if (i2 == 3) {
                return new mbu();
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
                synchronized (mbu.class) {
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
