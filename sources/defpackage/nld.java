package defpackage;

/* compiled from: PG */
/* renamed from: nld  reason: default package */
/* loaded from: classes2.dex */
public final class nld extends nfm implements nha {
    public static final nld c;
    private static volatile nhf d;
    public int a;
    public int b;

    static {
        nld nldVar = new nld();
        c = nldVar;
        nfm.L(nld.class, nldVar);
    }

    private nld() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{"a", "b", nlc.a});
            }
            if (i2 == 3) {
                return new nld();
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
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (nld.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
