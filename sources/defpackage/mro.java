package defpackage;

/* compiled from: PG */
/* renamed from: mro  reason: default package */
/* loaded from: classes2.dex */
public final class mro extends nfm implements nha {
    public static final mro l;
    private static volatile nhf n;
    public int a;
    public boolean c;
    public mwq e;
    public mwq f;
    public mqz g;
    public int h;
    public int i;
    public mqs j;
    public boolean k;
    private byte m = 2;
    public nga b = nhi.b;
    public String d = "";

    static {
        mro mroVar = new mro();
        l = mroVar;
        nfm.L(mro.class, mroVar);
    }

    private mro() {
    }

    public final void b() {
        nga ngaVar = this.b;
        if (!ngaVar.c()) {
            this.b = nfm.H(ngaVar);
        }
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(l, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0001\u0002\u0001\u001b\u0002ဇ\u0000\u0003ဈ\u0001\u0007ᐉ\u0002\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fᐉ\u0003\u0011ဇ\n", new Object[]{"a", "b", muv.class, "c", "d", "e", "g", "h", "i", "j", "f", "k"});
            }
            if (i2 == 3) {
                return new mro();
            }
            if (i2 == 4) {
                return new nfh(l);
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            }
            nhf nhfVar = n;
            if (nhfVar == null) {
                synchronized (mro.class) {
                    nhfVar = n;
                    if (nhfVar == null) {
                        nhfVar = new nfi(l);
                        n = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.m);
    }
}
