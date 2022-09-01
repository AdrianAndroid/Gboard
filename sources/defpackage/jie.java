package defpackage;

/* compiled from: PG */
/* renamed from: jie  reason: default package */
/* loaded from: classes.dex */
public final class jie extends nfm implements nha {
    public static final jie q;
    private static volatile nhf r;
    public int a;
    public int d;
    public int e;
    public noi g;
    public int i;
    public noi j;
    public int l;
    public int m;
    public ndy p;
    public String b = "";
    public String c = "";
    public String f = "";
    public String h = "";
    public nga k = nhi.b;
    public String n = "";
    public String o = "";

    static {
        jie jieVar = new jie();
        q = jieVar;
        nfm.L(jie.class, jieVar);
    }

    private jie() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(q, "\u0001\u000f\u0000\u0001\u0002\u0015\u000f\u0000\u0001\u0000\u0002ဈ\u0001\u0004င\u0002\u0005ဈ\u0004\u0007ဈ\u0000\u000bဉ\u0005\fဉ\b\r\u001b\u000eဈ\u0006\u000fဌ\u0003\u0010င\u0007\u0011ဌ\t\u0012ဌ\n\u0013ဈ\u000b\u0014ဈ\f\u0015ဉ\r", new Object[]{"a", "c", "d", "f", "b", "g", "j", "k", jii.class, "h", "e", ggq.u, "i", "l", ggq.t, "m", ggq.s, "n", "o", "p"});
            }
            if (i2 == 3) {
                return new jie();
            }
            if (i2 == 4) {
                return new nfh(q);
            }
            if (i2 == 5) {
                return q;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = r;
            if (nhfVar == null) {
                synchronized (jie.class) {
                    nhfVar = r;
                    if (nhfVar == null) {
                        nhfVar = new nfi(q);
                        r = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
