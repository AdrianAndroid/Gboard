package defpackage;

/* compiled from: PG */
/* renamed from: jho  reason: default package */
/* loaded from: classes.dex */
public final class jho extends nfm implements nha {
    public static final jho m;
    private static volatile nhf n;
    public int a;
    public int e;
    public int f;
    public nga g;
    public long h;
    public nga j;
    public ndy k;
    public ndy l;
    public String b = "";
    public String c = "";
    public String d = "";
    public String i = "";

    static {
        jho jhoVar = new jho();
        m = jhoVar;
        nfm.L(jho.class, jhoVar);
    }

    private jho() {
        nhi nhiVar = nhi.b;
        this.g = nhiVar;
        this.j = nhiVar;
    }

    public final void b() {
        nga ngaVar = this.g;
        if (!ngaVar.c()) {
            this.g = nfm.H(ngaVar);
        }
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001\u0004င\u0003\u0005ဌ\u0004\u0006ဈ\u0002\bဂ\u0005\n\u001a\u000bဉ\u0007\fဈ\u0006\rဉ\b", new Object[]{"a", "b", "g", jhn.class, "c", "e", "f", ggq.p, "d", "h", "j", "k", "i", "l"});
            }
            if (i2 == 3) {
                return new jho();
            }
            if (i2 == 4) {
                return new nfh(m);
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = n;
            if (nhfVar == null) {
                synchronized (jho.class) {
                    nhfVar = n;
                    if (nhfVar == null) {
                        nhfVar = new nfi(m);
                        n = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
