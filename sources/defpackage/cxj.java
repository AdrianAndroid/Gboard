package defpackage;

/* compiled from: PG */
/* renamed from: cxj  reason: default package */
/* loaded from: classes.dex */
public final class cxj extends nfm implements nha {
    public static final cxj e;
    private static volatile nhf f;
    public int a;
    public nga b = nhi.b;
    public String c = "";
    public long d;

    static {
        cxj cxjVar = new cxj();
        e = cxjVar;
        nfm.L(cxj.class, cxjVar);
    }

    private cxj() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001", new Object[]{"a", "b", cxi.class, "c", "d"});
            }
            if (i2 == 3) {
                return new cxj();
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
                synchronized (cxj.class) {
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
