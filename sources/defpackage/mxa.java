package defpackage;

/* compiled from: PG */
/* renamed from: mxa  reason: default package */
/* loaded from: classes2.dex */
public final class mxa extends nfm implements nha {
    public static final mxa u;
    private static volatile nhf v;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public int f;
    public int h;
    public int m;
    public nga n;
    public int o;
    public int p;
    public nga q;
    public long s;
    public String g = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public nfv r = ngp.b;
    public nga t = nhi.b;

    static {
        mxa mxaVar = new mxa();
        u = mxaVar;
        nfm.L(mxa.class, mxaVar);
    }

    private mxa() {
        nhi nhiVar = nhi.b;
        this.n = nhiVar;
        this.q = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(u, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0004\u0005ဈ\u0005\u0006ဈ\u0007\u0007ဈ\b\bဈ\t\tဈ\n\nင\u000b\u000b\u001a\fင\f\rင\r\u000e\u001a\u000fဂ\u000e\u0010%\u0011\u001a\u0012ဂ\u0003\u0013င\u0006", new Object[]{"a", "b", "c", "d", "f", "g", "i", "j", "k", "l", "m", "n", "o", "p", "q", "s", "r", "t", "e", "h"});
            }
            if (i2 == 3) {
                return new mxa();
            }
            if (i2 == 4) {
                return new nfh((boolean[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return u;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = v;
            if (nhfVar == null) {
                synchronized (mxa.class) {
                    nhfVar = v;
                    if (nhfVar == null) {
                        nhfVar = new nfi(u);
                        v = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
