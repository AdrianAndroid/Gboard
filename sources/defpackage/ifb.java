package defpackage;

/* compiled from: PG */
/* renamed from: ifb  reason: default package */
/* loaded from: classes.dex */
public final class ifb extends nfm implements nha {
    public static final ifb t;
    private static volatile nhf u;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public nga j = nhi.b;
    public long k;
    public long l;
    public long m;
    public int n;
    public long o;
    public long p;
    public long q;
    public long r;
    public boolean s;

    static {
        ifb ifbVar = new ifb();
        t = ifbVar;
        nfm.L(ifb.class, ifbVar);
    }

    private ifb() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(t, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0007\u0007\u001b\bဂ\f\tဂ\r\nဂ\u000e\u000bဂ\b\fဂ\t\rဂ\n\u000eင\u000b\u000fဂ\u000f\u0010ဇ\u0010\u0011ဂ\u0005\u0012ဂ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "i", "j", ifa.class, "o", "p", "q", "k", "l", "m", "n", "r", "s", "g", "h"});
            }
            if (i2 == 3) {
                return new ifb();
            }
            if (i2 == 4) {
                return new nfh(t);
            }
            if (i2 == 5) {
                return t;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = u;
            if (nhfVar == null) {
                synchronized (ifb.class) {
                    nhfVar = u;
                    if (nhfVar == null) {
                        nhfVar = new nfi(t);
                        u = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
