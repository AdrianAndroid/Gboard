package defpackage;

/* compiled from: PG */
/* renamed from: njj  reason: default package */
/* loaded from: classes2.dex */
public final class njj extends nfm implements nha {
    public static final njj g;
    private static volatile nhf h;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        njj njjVar = new njj();
        g = njjVar;
        nfm.L(njj.class, njjVar);
    }

    private njj() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", "c", "d", "e", mxe.o, "f", mxe.p});
            }
            if (i2 == 3) {
                return new njj();
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
                synchronized (njj.class) {
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
