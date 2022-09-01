package defpackage;

/* compiled from: PG */
/* renamed from: gfw  reason: default package */
/* loaded from: classes.dex */
public final class gfw extends nfm implements nha {
    public static final nft f = new euq(2);
    public static final gfw h;
    private static volatile nhf i;
    public int a;
    public int b;
    public gft d;
    public int g;
    public String c = "";
    public nfs e = nfn.b;

    static {
        gfw gfwVar = new gfw();
        h = gfwVar;
        nfm.L(gfw.class, gfwVar);
    }

    private gfw() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001င\u0000\u0004ဈ\u0003\u0005ဉ\u0004\u0006\u001e\u0007င\u0005", new Object[]{"a", "b", "c", "d", "e", gfu.c(), "g"});
            }
            if (i3 == 3) {
                return new gfw();
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
                synchronized (gfw.class) {
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
