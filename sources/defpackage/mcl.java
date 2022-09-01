package defpackage;

/* compiled from: PG */
/* renamed from: mcl  reason: default package */
/* loaded from: classes.dex */
public final class mcl extends nfm implements nha {
    public static final mcl e;
    private static volatile nhf f;
    public int a;
    public int b;
    public long c;
    public String d = "";

    static {
        mcl mclVar = new mcl();
        e = mclVar;
        nfm.L(mcl.class, mclVar);
    }

    private mcl() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", mbm.u, "c", "d"});
            }
            if (i2 == 3) {
                return new mcl();
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
                synchronized (mcl.class) {
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
