package defpackage;

/* compiled from: PG */
/* renamed from: iyk  reason: default package */
/* loaded from: classes.dex */
public final class iyk extends nfm implements nha {
    public static final iyk g;
    private static volatile nhf h;
    public int a;
    public Object c;
    public int e;
    public int b = 0;
    public String d = "";
    public nga f = nhi.b;

    static {
        iyk iykVar = new iyk();
        g = iykVar;
        nfm.L(iyk.class, iykVar);
    }

    private iyk() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001a\u0004ျ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000", new Object[]{"c", "b", "a", "d", "e", "f", iyn.class, iyp.class, iyo.class, ijq.class});
            }
            if (i2 == 3) {
                return new iyk();
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
                synchronized (iyk.class) {
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
