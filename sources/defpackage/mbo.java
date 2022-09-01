package defpackage;

/* compiled from: PG */
/* renamed from: mbo  reason: default package */
/* loaded from: classes.dex */
public final class mbo extends nfm implements nha {
    public static final mbo g;
    private static volatile nhf h;
    public int a;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public int f;

    static {
        mbo mboVar = new mbo();
        g = mboVar;
        nfm.L(mbo.class, mboVar);
    }

    private mbo() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", mbn.c(), "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new mbo();
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
                synchronized (mbo.class) {
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
