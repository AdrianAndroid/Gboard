package defpackage;

/* compiled from: PG */
/* renamed from: meq  reason: default package */
/* loaded from: classes.dex */
public final class meq extends nfm implements nha {
    public static final meq g;
    private static volatile nhf h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        meq meqVar = new meq();
        g = meqVar;
        nfm.L(meq.class, meqVar);
    }

    private meq() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", mep.c(), "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new meq();
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
                synchronized (meq.class) {
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
