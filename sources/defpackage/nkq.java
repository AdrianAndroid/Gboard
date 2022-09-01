package defpackage;

/* compiled from: PG */
/* renamed from: nkq  reason: default package */
/* loaded from: classes2.dex */
public final class nkq extends nfm implements nha {
    public static final nkq l;
    public static final ngt m;
    private static volatile nhf n;
    public int a;
    public int h;
    public int i;
    public int j;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String k = "";

    static {
        nkq nkqVar = new nkq();
        l = nkqVar;
        nfm.L(nkq.class, nkqVar);
        m = nfm.P(nks.f, nkqVar, nkqVar, 294000, nik.MESSAGE);
    }

    private nkq() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(l, "\u0001\n\u0000\u0001\u0001\u0010\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0004\bဈ\u0002\tဈ\u0003\nဈ\u0005\u000bဈ\u0006\fင\u0007\rင\b\u000eင\t\u0010ဈ\u000b", new Object[]{"a", "b", "e", "c", "d", "f", "g", "h", "i", "j", "k"});
            }
            if (i2 == 3) {
                return new nkq();
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
            nhf nhfVar = n;
            if (nhfVar == null) {
                synchronized (nkq.class) {
                    nhfVar = n;
                    if (nhfVar == null) {
                        nhfVar = new nfi(l);
                        n = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
