package defpackage;

/* compiled from: PG */
/* renamed from: mez  reason: default package */
/* loaded from: classes.dex */
public final class mez extends nfm implements nha {
    public static final mez l;
    private static volatile nhf m;
    public int a;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public long j;
    public long k;

    static {
        mez mezVar = new mez();
        l = mezVar;
        nfm.L(mez.class, mezVar);
    }

    private mez() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(l, "\u0001\n\u0000\u0001\u0001\u0010\n\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0006ဈ\u0005\u000bဇ\n\fင\u000b\rင\f\u000eဇ\r\u000fဂ\u000e\u0010ဂ\u000f", new Object[]{"a", "b", mey.c(), "c", jih.m, "d", mdw.p, "e", "f", "g", "h", "i", "j", "k"});
            }
            if (i2 == 3) {
                return new mez();
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
            nhf nhfVar = m;
            if (nhfVar == null) {
                synchronized (mez.class) {
                    nhfVar = m;
                    if (nhfVar == null) {
                        nhfVar = new nfi(l);
                        m = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
