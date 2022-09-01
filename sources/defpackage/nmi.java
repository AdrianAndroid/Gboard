package defpackage;

/* compiled from: PG */
/* renamed from: nmi  reason: default package */
/* loaded from: classes2.dex */
public final class nmi extends nfm implements nha {
    public static final nmi d;
    private static volatile nhf e;
    public int a;
    public int b;
    public String c = "";

    static {
        nmi nmiVar = new nmi();
        d = nmiVar;
        nfm.L(nmi.class, nmiVar);
    }

    private nmi() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", nlc.g, "c"});
            }
            if (i2 == 3) {
                return new nmi();
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
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (nmi.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
