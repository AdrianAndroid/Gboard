package defpackage;

/* compiled from: PG */
/* renamed from: nnl  reason: default package */
/* loaded from: classes2.dex */
public final class nnl extends nfm implements nha {
    public static final nnl e;
    private static volatile nhf f;
    public int a;
    public boolean b;
    public String c = "";
    public String d = "";

    static {
        nnl nnlVar = new nnl();
        e = nnlVar;
        nfm.L(nnl.class, nnlVar);
    }

    private nnl() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new nnl();
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
                synchronized (nnl.class) {
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
