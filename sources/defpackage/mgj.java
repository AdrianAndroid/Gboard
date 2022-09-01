package defpackage;

/* compiled from: PG */
/* renamed from: mgj  reason: default package */
/* loaded from: classes.dex */
public final class mgj extends nfm implements nha {
    public static final mgj e;
    private static volatile nhf f;
    public int a;
    public long b;
    public long c;
    public long d;

    static {
        mgj mgjVar = new mgj();
        e = mgjVar;
        nfm.L(mgj.class, mgjVar);
    }

    private mgj() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new mgj();
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
                synchronized (mgj.class) {
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
