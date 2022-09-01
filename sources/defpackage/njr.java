package defpackage;

/* compiled from: PG */
/* renamed from: njr  reason: default package */
/* loaded from: classes2.dex */
public final class njr extends nfm implements nha {
    public static final njr d;
    private static volatile nhf f;
    public int a;
    public String b = "";
    public String c = "";
    private int e;

    static {
        njr njrVar = new njr();
        d = njrVar;
        nfm.L(njr.class, njrVar);
    }

    private njr() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new njr();
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
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (njr.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
