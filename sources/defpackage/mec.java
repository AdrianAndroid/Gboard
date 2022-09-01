package defpackage;

/* compiled from: PG */
/* renamed from: mec  reason: default package */
/* loaded from: classes.dex */
public final class mec extends nfm implements nha {
    public static final mec g;
    private static volatile nhf h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        mec mecVar = new mec();
        g = mecVar;
        nfm.L(mec.class, mecVar);
    }

    private mec() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", "c", mdw.d, "d", meb.c(), "e", "f"});
            }
            if (i2 == 3) {
                return new mec();
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
                synchronized (mec.class) {
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
