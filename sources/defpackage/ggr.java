package defpackage;

/* compiled from: PG */
/* renamed from: ggr  reason: default package */
/* loaded from: classes.dex */
public final class ggr extends nfm implements nha {
    public static final ggr r;
    private static volatile nhf s;
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public boolean h;
    public boolean i;
    public int l;
    public int m;
    public gge o;
    public boolean p;
    public boolean q;
    public String f = "";
    public boolean g = true;
    public int j = 1;
    public int k = 1;
    public int n = 9;

    static {
        ggr ggrVar = new ggr();
        r = ggrVar;
        nfm.L(ggr.class, ggrVar);
    }

    private ggr() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(r, "\u0001\u0010\u0000\u0001\u0001\u0013\u0010\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0004ဌ\u0002\u0006ဌ\u0004\u0007ဈ\u0005\bဇ\u0006\tဇ\u0007\nဇ\b\u000bင\t\fင\n\rဌ\u000b\u000eဌ\f\u000fင\r\u0011ဉ\u000f\u0012ဇ\u0010\u0013ဇ\u0011", new Object[]{"a", "b", "c", "d", ggq.a, "e", ggq.b, "f", "g", "h", "i", "j", "k", "l", cgs.t, "m", cgs.u, "n", "o", "p", "q"});
            }
            if (i2 == 3) {
                return new ggr();
            }
            if (i2 == 4) {
                return new nfh(r);
            }
            if (i2 == 5) {
                return r;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = s;
            if (nhfVar == null) {
                synchronized (ggr.class) {
                    nhfVar = s;
                    if (nhfVar == null) {
                        nhfVar = new nfi(r);
                        s = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
