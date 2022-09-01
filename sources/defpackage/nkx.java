package defpackage;

/* compiled from: PG */
/* renamed from: nkx  reason: default package */
/* loaded from: classes2.dex */
public final class nkx extends nfm implements nha {
    public static final nkx m;
    public static final ngt n;
    private static volatile nhf o;
    public int a;
    public boolean b;
    public nkp c;
    public nga d = nhi.b;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public nkw k;
    public long l;

    static {
        nkx nkxVar = new nkx();
        m = nkxVar;
        nfm.L(nkx.class, nkxVar);
        n = nfm.P(nks.f, nkxVar, nkxVar, 307792803, nik.MESSAGE);
    }

    private nkx() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006\tဈ\u0007\nဉ\b\u000bဂ\t", new Object[]{"a", "b", "c", "d", nkp.class, "e", "f", "g", "h", "i", "j", "k", "l"});
            }
            if (i2 == 3) {
                return new nkx();
            }
            if (i2 == 4) {
                return new nfh((float[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = o;
            if (nhfVar == null) {
                synchronized (nkx.class) {
                    nhfVar = o;
                    if (nhfVar == null) {
                        nhfVar = new nfi(m);
                        o = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
