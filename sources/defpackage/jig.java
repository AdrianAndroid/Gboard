package defpackage;

/* compiled from: PG */
/* renamed from: jig  reason: default package */
/* loaded from: classes.dex */
public final class jig extends nfm implements nha {
    public static final jig v;
    private static volatile nhf w;
    public int a;
    public jif b;
    public int e;
    public ndy f;
    public ndy g;
    public int h;
    public long i;
    public long j;
    public jij k;
    public boolean l;
    public nga m;
    public int n;
    public nga o;
    public int p;
    public long q;
    public nga s;
    public oot t;
    public String c = "";
    public String d = "";
    public String r = "";
    public String u = "";

    static {
        jig jigVar = new jig();
        v = jigVar;
        nfm.L(jig.class, jigVar);
    }

    private jig() {
        nhi nhiVar = nhi.b;
        this.m = nhiVar;
        this.o = nhiVar;
        this.s = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(v, "\u0001\u0014\u0000\u0001\u0001年皤\u0014\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003ဂ\b\u0006ဈ\u0002\nင\u0003\u000bဂ\t\fဌ\u0007\rဉ\n\u000eဇ\u000b\u0010င\f\u0011\u001b\u0013ဌ\r\u0014ဉ\u0004\u0017ဂ\u000e\u0019\u001a\u001aဈ\u000f\u001bဉ\u0005\u001cဉ\u0010Ϩဈ\u0011年皤ဉ\u0000", new Object[]{"a", "c", "m", jie.class, "i", "d", "e", "j", "h", jih.b, "k", "l", "n", "o", jik.class, "p", jih.g, "f", "q", "s", "r", "g", "t", "u", "b"});
            }
            if (i2 == 3) {
                return new jig();
            }
            if (i2 == 4) {
                return new nfh(v);
            }
            if (i2 == 5) {
                return v;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = w;
            if (nhfVar == null) {
                synchronized (jig.class) {
                    nhfVar = w;
                    if (nhfVar == null) {
                        nhfVar = new nfi(v);
                        w = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
