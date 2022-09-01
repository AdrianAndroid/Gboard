package defpackage;

/* compiled from: PG */
/* renamed from: lzv  reason: default package */
/* loaded from: classes.dex */
public final class lzv extends nfm implements nha {
    public static final lzv r;
    private static volatile nhf s;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;

    static {
        lzv lzvVar = new lzv();
        r = lzvVar;
        nfm.L(lzv.class, lzvVar);
    }

    private lzv() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(r, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဇ\u000f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
            }
            if (i2 == 3) {
                return new lzv();
            }
            if (i2 == 4) {
                return new nfh(r);
            }
            if (i2 == 5) {
                return r;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = s;
            if (nhfVar == null) {
                synchronized (lzv.class) {
                    nhfVar = s;
                    if (nhfVar == null) {
                        nhfVar = new nfi(r);
                        s = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
