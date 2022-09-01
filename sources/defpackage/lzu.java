package defpackage;

/* compiled from: PG */
/* renamed from: lzu  reason: default package */
/* loaded from: classes.dex */
public final class lzu extends nfm implements nha {
    public static final lzu q;
    private static volatile nhf r;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public int f;
    public int g;
    public int h;
    public int j;
    public int k;
    public int m;
    public long n;
    public long o;
    public lzv p;
    public String i = "";
    public nfs l = nfn.b;

    static {
        lzu lzuVar = new lzu();
        q = lzuVar;
        nfm.L(lzu.class, lzuVar);
    }

    private lzu() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(q, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဈ\u0007\tဌ\b\nင\t\u000b\u0016\fင\n\rဂ\u000b\u000eဂ\f\u000fဉ\r", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", lzt.c(), "k", "l", "m", "n", "o", "p"});
            }
            if (i2 == 3) {
                return new lzu();
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
                synchronized (lzu.class) {
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
