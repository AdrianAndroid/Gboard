package defpackage;

/* compiled from: PG */
/* renamed from: ghj  reason: default package */
/* loaded from: classes.dex */
public final class ghj extends nfm implements nha {
    public static final ghj e;
    private static volatile nhf f;
    public int a;
    public long b;
    public nga c = nhi.b;
    public ghk d;

    static {
        ghj ghjVar = new ghj();
        e = ghjVar;
        nfm.L(ghj.class, ghjVar);
    }

    private ghj() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"a", "b", "c", ghg.class, "d"});
            }
            if (i2 == 3) {
                return new ghj();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (ghj.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
