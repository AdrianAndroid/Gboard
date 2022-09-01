package defpackage;

/* compiled from: PG */
/* renamed from: mdd  reason: default package */
/* loaded from: classes.dex */
public final class mdd extends nfm implements nha {
    public static final mdd f;
    private static volatile nhf g;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public long e;

    static {
        mdd mddVar = new mdd();
        f = mddVar;
        nfm.L(mdd.class, mddVar);
    }

    private mdd() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new mdd();
            }
            if (i2 == 4) {
                return new nfh(f);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (mdd.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
