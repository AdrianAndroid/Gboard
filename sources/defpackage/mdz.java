package defpackage;

/* compiled from: PG */
/* renamed from: mdz  reason: default package */
/* loaded from: classes.dex */
public final class mdz extends nfm implements nha {
    public static final mdz f;
    private static volatile nhf g;
    public int a;
    public int b;
    public int c;
    public nga d = nhi.b;
    public int e;

    static {
        mdz mdzVar = new mdz();
        f = mdzVar;
        nfm.L(mdz.class, mdzVar);
    }

    private mdz() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b\u0004င\u0002", new Object[]{"a", "b", mdx.c(), "c", mdy.c(), "d", mbw.class, "e"});
            }
            if (i2 == 3) {
                return new mdz();
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
                synchronized (mdz.class) {
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
