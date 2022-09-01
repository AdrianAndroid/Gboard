package defpackage;

/* compiled from: PG */
/* renamed from: ghc  reason: default package */
/* loaded from: classes.dex */
public final class ghc extends nfm implements nha {
    public static final ghc d;
    private static volatile nhf f;
    public int b;
    private int e;
    public String a = "";
    public nga c = nhi.b;

    static {
        ghc ghcVar = new ghc();
        d = ghcVar;
        nfm.L(ghc.class, ghcVar);
    }

    private ghc() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001a", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new ghc();
            }
            if (i2 == 4) {
                return new nfh(d);
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (ghc.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
