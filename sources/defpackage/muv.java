package defpackage;

/* compiled from: PG */
/* renamed from: muv  reason: default package */
/* loaded from: classes2.dex */
public final class muv extends nfm implements nha {
    public static final muv x;
    private static volatile nhf y;
    public int a;
    public boolean n;
    public nga o;
    public muu q;
    public boolean r;
    public nga t;
    public boolean u;
    public nga v;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public String p = ".";
    public String s = ". ";
    public String w = "";

    static {
        muv muvVar = new muv();
        x = muvVar;
        nfm.L(muv.class, muvVar);
    }

    private muv() {
        nhi nhiVar = nhi.b;
        this.o = nhiVar;
        this.t = nhiVar;
        this.v = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(x, "\u0001\u0016\u0000\u0001\u0001\u001a\u0016\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\u000b\fဇ\f\r\u001a\u000eဉ\u000e\u0010ဇ\u0010\u0011ဈ\n\u0012\u001a\u0015ဇ\u0012\u0016ဈ\u0011\u0017ဈ\r\u0019\u001a\u001aဈ\u0014", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "q", "r", "l", "t", "u", "s", "p", "v", "w"});
            }
            if (i2 == 3) {
                return new muv();
            }
            if (i2 == 4) {
                return new nfh((boolean[][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return x;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = y;
            if (nhfVar == null) {
                synchronized (muv.class) {
                    nhfVar = y;
                    if (nhfVar == null) {
                        nhfVar = new nfi(x);
                        y = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
