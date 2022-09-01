package defpackage;

/* compiled from: PG */
/* renamed from: gzh  reason: default package */
/* loaded from: classes.dex */
public final class gzh extends nfm implements nha {
    public static final gzh g;
    private static volatile nhf h;
    public int a;
    public nga b;
    public nga c;
    public int d;
    public String e = "";
    public int f;

    static {
        gzh gzhVar = new gzh();
        g = gzhVar;
        nfm.L(gzh.class, gzhVar);
    }

    private gzh() {
        nhi nhiVar = nhi.b;
        this.b = nhiVar;
        this.c = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003င\u0000\u0004ဈ\u0001\u0005ဌ\u0002", new Object[]{"a", "b", gzi.class, "c", gzk.class, "d", "e", "f", ggq.m});
            }
            if (i2 == 3) {
                return new gzh();
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
                synchronized (gzh.class) {
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
