package defpackage;

/* compiled from: PG */
/* renamed from: nno  reason: default package */
/* loaded from: classes2.dex */
public final class nno extends nfm implements nha {
    public static final nno q;
    private static volatile nhf r;
    public int a;
    public long b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int l;
    public int m;
    public int o;
    public int p;
    public String c = "";
    public String j = "";
    public String k = "";
    public String n = "";

    static {
        nno nnoVar = new nno();
        q = nnoVar;
        nfm.L(nno.class, nnoVar);
    }

    private nno() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(q, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tဈ\b\nဈ\t\u000bင\n\fင\u000b\rဈ\f\u000eဌ\r\u000fဌ\u000e", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", nlc.n, "p", nlc.o});
            }
            if (i2 == 3) {
                return new nno();
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
                synchronized (nno.class) {
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
