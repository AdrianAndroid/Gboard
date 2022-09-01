package defpackage;

/* compiled from: PG */
/* renamed from: chj  reason: default package */
/* loaded from: classes.dex */
public final class chj extends nfm implements nha {
    public static final chj g;
    private static volatile nhf h;
    public int a;
    public String b = "";
    public String c = "";
    public long d;
    public long e;
    public int f;

    static {
        chj chjVar = new chj();
        g = chjVar;
        nfm.L(chj.class, chjVar);
    }

    private chj() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new chj();
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
                synchronized (chj.class) {
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
