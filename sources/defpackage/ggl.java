package defpackage;

/* compiled from: PG */
/* renamed from: ggl  reason: default package */
/* loaded from: classes.dex */
public final class ggl extends nfm implements nha {
    public static final nft e = new euq(3);
    public static final ggl h;
    private static volatile nhf i;
    public int a;
    public int b;
    public int c;
    public nfs d = nfn.b;
    public String f = "";
    public nga g = nhi.b;

    static {
        ggl gglVar = new ggl();
        h = gglVar;
        nfm.L(ggl.class, gglVar);
    }

    private ggl() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0002\u0000\u0001ဋ\u0000\u0003ဌ\u0002\u0004\u001e\u0005ဈ\u0003\b\u001b", new Object[]{"a", "b", "c", ggk.c(), "d", ggi.c(), "f", "g", ggj.class});
            }
            if (i3 == 3) {
                return new ggl();
            }
            if (i3 == 4) {
                return new nfh(h);
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (ggl.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(h);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
