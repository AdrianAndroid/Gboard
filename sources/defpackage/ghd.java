package defpackage;

/* compiled from: PG */
/* renamed from: ghd  reason: default package */
/* loaded from: classes.dex */
public final class ghd extends nfm implements nha {
    public static final ghd c;
    private static volatile nhf e;
    public nga a = nhi.b;
    public ghe b;
    private int d;

    static {
        ghd ghdVar = new ghd();
        c = ghdVar;
        nfm.L(ghd.class, ghdVar);
    }

    private ghd() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"d", "a", ghc.class, "b"});
            }
            if (i2 == 3) {
                return new ghd();
            }
            if (i2 == 4) {
                return new nfh(c);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (ghd.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
