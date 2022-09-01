package defpackage;

/* compiled from: PG */
/* renamed from: fvq  reason: default package */
/* loaded from: classes.dex */
public final class fvq extends nfm implements nha {
    public static final fvq n;
    private static volatile nhf o;
    public int a;
    public int b;
    public int g;
    public int i;
    public int k;
    public int l;
    public boolean m;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public long h = -1;
    public String j = "";

    static {
        fvq fvqVar = new fvq();
        n = fvqVar;
        nfm.L(fvq.class, fvqVar);
    }

    private fvq() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(n, "\u0001\u000b\u0000\u0002\u0002$\u000b\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဈ\u0006\u0013ဂ\u0018\u0017င\u001e\u0019ဌ\b ဈ!!ဈ\u0004\"င\"#င#$ဇ$", new Object[]{"a", "b", "c", "d", "f", "h", "i", "g", nlc.q, "j", "e", "k", "l", "m"});
            }
            if (i2 == 3) {
                return new fvq();
            }
            if (i2 == 4) {
                return new nfh(n);
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = o;
            if (nhfVar == null) {
                synchronized (fvq.class) {
                    nhfVar = o;
                    if (nhfVar == null) {
                        nhfVar = new nfi(n);
                        o = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
