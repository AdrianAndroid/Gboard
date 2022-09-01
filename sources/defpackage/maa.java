package defpackage;

/* compiled from: PG */
/* renamed from: maa  reason: default package */
/* loaded from: classes.dex */
public final class maa extends nfm implements nha {
    public static final maa g;
    private static volatile nhf h;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    static {
        maa maaVar = new maa();
        g = maaVar;
        nfm.L(maa.class, maaVar);
    }

    private maa() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new maa();
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
                synchronized (maa.class) {
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
