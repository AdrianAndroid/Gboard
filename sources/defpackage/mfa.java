package defpackage;

/* compiled from: PG */
/* renamed from: mfa  reason: default package */
/* loaded from: classes.dex */
public final class mfa extends nfm implements nha {
    public static final mfa w;
    private static volatile nhf x;
    public int a;
    public int b;
    public int c;
    public boolean d;
    public maf e;
    public nga f;
    public boolean g;
    public boolean h;
    public nga i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    public int p;
    public boolean q;
    public int r;
    public mes s;
    public boolean t;
    public int u;
    public long v;

    static {
        mfa mfaVar = new mfa();
        w = mfaVar;
        nfm.L(mfa.class, mfaVar);
    }

    private mfa() {
        nhi nhiVar = nhi.b;
        this.f = nhiVar;
        this.i = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(w, "\u0001\u0015\u0000\u0001\u0001 \u0015\u0000\u0002\u0000\u0001င\u0001\u0002ဇ\u0002\u0007ဉ\u0005\b\u001b\tဇ\t\u000bဇ\u000b\u000e\u001b\u000fင\u0000\u0010ဇ\u000e\u0011င\u000f\u0012င\u0010\u0013င\u0011\u0014ဇ\u0012\u0015ဇ\u0013\u0016ဌ\u0014\u0017ဇ\u0015\u0018င\u0017\u001dဉ\u001b\u001eဇ\u001c\u001fင\u001d စ\u001e", new Object[]{"a", "c", "d", "e", "f", maf.class, "g", "h", "i", mbz.class, "b", "j", "k", "l", "m", "n", "o", "p", jih.p, "q", "r", "s", "t", "u", "v"});
            }
            if (i2 == 3) {
                return new mfa();
            }
            if (i2 == 4) {
                return new nfh(w);
            }
            if (i2 == 5) {
                return w;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = x;
            if (nhfVar == null) {
                synchronized (mfa.class) {
                    nhfVar = x;
                    if (nhfVar == null) {
                        nhfVar = new nfi(w);
                        x = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
