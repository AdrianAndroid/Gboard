package defpackage;

/* compiled from: PG */
/* renamed from: nmz  reason: default package */
/* loaded from: classes2.dex */
public final class nmz extends nfm implements nha {
    public static final nmz c;
    public static final ngt d;
    private static volatile nhf f;
    public String a = "";
    public String b = "";
    private int e;

    static {
        nmz nmzVar = new nmz();
        c = nmzVar;
        nfm.L(nmz.class, nmzVar);
        d = nfm.P(nkt.c, nmzVar, nmzVar, 171993426, nik.MESSAGE);
    }

    private nmz() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0004ဈ\u0003", new Object[]{"e", "a", "b"});
            }
            if (i2 == 3) {
                return new nmz();
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
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (nmz.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
