package defpackage;

/* compiled from: PG */
/* renamed from: mwj  reason: default package */
/* loaded from: classes2.dex */
public final class mwj extends nfm implements nha {
    public static final mwj t;
    private static volatile nhf u;
    public int a;
    public int b;
    public int c;
    public float d;
    public float e;
    public int f;
    public boolean j;
    public int k;
    public boolean l;
    public long m;
    public long n;
    public float o;
    public float p;
    public boolean q;
    public boolean s;
    public int g = -1;
    public int h = -1;
    public String i = "";
    public nga r = nhi.b;

    static {
        mwj mwjVar = new mwj();
        t = mwjVar;
        nfm.L(mwj.class, mwjVar);
    }

    private mwj() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(t, "\u0001\u0012\u0000\u0001\u0001\u0016\u0012\u0000\u0001\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005င\u0004\u0006င\u0005\u0007ဈ\b\bဇ\t\tင\n\u000bဇ\f\fဂ\r\rဃ\u000e\u000eင\u0006\u000fခ\u000f\u0010ခ\u0010\u0011ဇ\u0011\u0015\u001b\u0016ဇ\u0012", new Object[]{"a", "b", msb.t, "c", "d", "e", "f", "g", "i", "j", "k", "l", "m", "n", "h", "o", "p", "q", "r", mwh.class, "s"});
            }
            if (i2 == 3) {
                return new mwj();
            }
            if (i2 == 4) {
                return new nfh((char[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return t;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = u;
            if (nhfVar == null) {
                synchronized (mwj.class) {
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
