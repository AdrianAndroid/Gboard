package defpackage;

/* compiled from: PG */
/* renamed from: nru  reason: default package */
/* loaded from: classes2.dex */
public final class nru extends nfm implements nha {
    public static final nru g;
    private static volatile nhf h;
    public int a;
    public Object c;
    public nrt f;
    public int b = 0;
    public String d = "";
    public String e = "";

    static {
        nru nruVar = new nru();
        g = nruVar;
        nfm.L(nru.class, nruVar);
    }

    private nru() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ျ\u0000\u0002ွ\u0000\u0003ဈ\u0004\u0004ဉ\u0005\u0005ြ\u0000\u0006ဈ\u0003", new Object[]{"c", "b", "a", "e", "f", nrv.class, "d"});
            }
            if (i2 == 3) {
                return new nru();
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
                synchronized (nru.class) {
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
