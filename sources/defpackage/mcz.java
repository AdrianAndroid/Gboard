package defpackage;

/* compiled from: PG */
/* renamed from: mcz  reason: default package */
/* loaded from: classes.dex */
public final class mcz extends nfm implements nha {
    public static final mcz f;
    private static volatile nhf g;
    public int a;
    public int b;
    public String c = "";
    public int d;
    public int e;

    static {
        mcz mczVar = new mcz();
        f = mczVar;
        nfm.L(mcz.class, mczVar);
    }

    private mcz() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", mcy.c(), "c", "d", "e"});
            }
            if (i2 == 3) {
                return new mcz();
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
                synchronized (mcz.class) {
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
