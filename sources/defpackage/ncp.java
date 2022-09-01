package defpackage;

/* compiled from: PG */
/* renamed from: ncp  reason: default package */
/* loaded from: classes2.dex */
public final class ncp extends nfm implements nha {
    public static final ncp e;
    private static volatile nhf f;
    public mlp a;
    public String b = "";
    public String c = "";
    public nfv d = ngp.b;

    static {
        ncp ncpVar = new ncp();
        e = ncpVar;
        nfm.L(ncp.class, ncpVar);
    }

    private ncp() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002Ȉ\u0003Ȉ\u0004%", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ncp();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (ncp.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
