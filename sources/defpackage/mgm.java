package defpackage;

/* compiled from: PG */
/* renamed from: mgm  reason: default package */
/* loaded from: classes.dex */
public final class mgm extends nfm implements nha {
    public static final mgm l;
    private static volatile nhf m;
    public int a;
    public int b;
    public long d;
    public int e;
    public int f;
    public mgj g;
    public mfw h;
    public int j;
    public int k;
    public String c = "";
    public String i = "";

    static {
        mgm mgmVar = new mgm();
        l = mgmVar;
        nfm.L(mgm.class, mgmVar);
    }

    private mgm() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(l, "\u0001\n\u0000\u0001\u0001\u0015\n\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0006င\u0005\u0007င\u0006\nဉ\t\fဉ\u000b\rဂ\u0004\u000fဈ\f\u0013ဌ\u0010\u0015ဌ\u0012", new Object[]{"a", "b", mgk.c, "c", "e", "f", "g", "h", "d", "i", "j", mgk.b, "k", mgl.c()});
            }
            if (i2 == 3) {
                return new mgm();
            }
            if (i2 == 4) {
                return new nfh(l);
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = m;
            if (nhfVar == null) {
                synchronized (mgm.class) {
                    nhfVar = m;
                    if (nhfVar == null) {
                        nhfVar = new nfi(l);
                        m = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
