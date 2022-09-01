package defpackage;

/* compiled from: PG */
/* renamed from: mcm  reason: default package */
/* loaded from: classes.dex */
public final class mcm extends nfm implements nha {
    public static final mcm g;
    private static volatile nhf h;
    public int a;
    public int c;
    public int d;
    public boolean e;
    public String b = "";
    public String f = "";

    static {
        mcm mcmVar = new mcm();
        g = mcmVar;
        nfm.L(mcm.class, mcmVar);
    }

    private mcm() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new mcm();
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
                synchronized (mcm.class) {
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
