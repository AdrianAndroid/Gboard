package defpackage;

/* compiled from: PG */
/* renamed from: cxi  reason: default package */
/* loaded from: classes.dex */
public final class cxi extends nfm implements nha {
    public static final cxi e;
    private static volatile nhf f;
    public int a;
    public String b = "";
    public String c = "";
    public nga d = nhi.b;

    static {
        cxi cxiVar = new cxi();
        e = cxiVar;
        nfm.L(cxi.class, cxiVar);
    }

    private cxi() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", cxh.class});
            }
            if (i2 == 3) {
                return new cxi();
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
                synchronized (cxi.class) {
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
