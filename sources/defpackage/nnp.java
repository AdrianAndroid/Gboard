package defpackage;

/* compiled from: PG */
/* renamed from: nnp  reason: default package */
/* loaded from: classes2.dex */
public final class nnp extends nfm implements nha {
    public static final nnp g;
    private static volatile nhf h;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        nnp nnpVar = new nnp();
        g = nnpVar;
        nfm.L(nnp.class, nnpVar);
    }

    private nnp() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new nnp();
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
                synchronized (nnp.class) {
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
