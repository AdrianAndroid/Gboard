package defpackage;

/* compiled from: PG */
/* renamed from: jhr  reason: default package */
/* loaded from: classes.dex */
public final class jhr extends nfm implements nha {
    public static final jhr k;
    private static volatile nhf l;
    public int a;
    public int d;
    public int e;
    public noi g;
    public int i;
    public ndy j;
    public String b = "";
    public String c = "";
    public String f = "";
    public String h = "";

    static {
        jhr jhrVar = new jhr();
        k = jhrVar;
        nfm.L(jhr.class, jhrVar);
    }

    private jhr() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(k, "\u0001\t\u0000\u0001\u0002\u0015\t\u0000\u0000\u0000\u0002ဈ\u0001\u0004င\u0002\u0005ဈ\u0004\u0007ဈ\u0000\u000bဉ\u0005\u000eဈ\u0006\u000fဌ\u0003\u0010င\u0007\u0015ဉ\r", new Object[]{"a", "c", "d", "f", "b", "g", "h", "e", ggq.q, "i", "j"});
            }
            if (i2 == 3) {
                return new jhr();
            }
            if (i2 == 4) {
                return new nfh(k);
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = l;
            if (nhfVar == null) {
                synchronized (jhr.class) {
                    nhfVar = l;
                    if (nhfVar == null) {
                        nhfVar = new nfi(k);
                        l = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
