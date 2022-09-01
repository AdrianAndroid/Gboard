package defpackage;

/* compiled from: PG */
/* renamed from: nmc  reason: default package */
/* loaded from: classes2.dex */
public final class nmc extends nfm implements nha {
    public static final nmc b;
    private static volatile nhf f;
    private int c;
    private ngu d = ngu.a;
    private ngu e = ngu.a;
    public String a = "";

    static {
        nmc nmcVar = new nmc();
        b = nmcVar;
        nfm.L(nmc.class, nmcVar);
    }

    private nmc() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0003\u0000\u0001\u0002\u0007\u0003\u0002\u0000\u0000\u0002ဈ\u0001\u00062\u00072", new Object[]{"c", "a", "d", nmb.a, "e", nma.a});
            }
            if (i2 == 3) {
                return new nmc();
            }
            if (i2 == 4) {
                return new nfh(b);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (nmc.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
