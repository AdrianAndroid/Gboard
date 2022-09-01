package defpackage;

/* compiled from: PG */
/* renamed from: mbc  reason: default package */
/* loaded from: classes.dex */
public final class mbc extends nfm implements nha {
    public static final mbc p;
    private static volatile nhf q;
    public int a;
    public int b;
    public int c;
    public int d;
    public mbb e;
    public int f;
    public int g;
    public mbs h;
    public mbe i;
    public mdl k;
    public int l;
    public int m;
    public mbt n;
    public String j = "";
    public nga o = nhi.b;

    static {
        mbc mbcVar = new mbc();
        p = mbcVar;
        nfm.L(mbc.class, mbcVar);
    }

    private mbc() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(p, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0006ဌ\u0005\u0007ဌ\u0006\bဉ\u0007\nဉ\t\u000bဈ\n\fဉ\u000b\rဌ\f\u000eဌ\r\u000fဉ\u000e\u0010\u001b", new Object[]{"a", "b", maw.n, "c", maw.o, "d", jih.l, "e", "f", maw.i, "g", maw.k, "h", "i", "j", "k", "l", maw.m, "m", maw.j, "n", "o", mbt.class});
            }
            if (i2 == 3) {
                return new mbc();
            }
            if (i2 == 4) {
                return new nfh(p);
            }
            if (i2 == 5) {
                return p;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = q;
            if (nhfVar == null) {
                synchronized (mbc.class) {
                    nhfVar = q;
                    if (nhfVar == null) {
                        nhfVar = new nfi(p);
                        q = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }

    public final void b() {
        nga ngaVar = this.o;
        if (!ngaVar.c()) {
            this.o = nfm.H(ngaVar);
        }
    }
}
