package defpackage;

/* compiled from: PG */
/* renamed from: maq  reason: default package */
/* loaded from: classes.dex */
public final class maq extends nfm implements nha {
    public static final maq f;
    private static volatile nhf g;
    public int a;
    public int c;
    public float e;
    public String b = "";
    public nfs d = nfn.b;

    static {
        maq maqVar = new maq();
        f = maqVar;
        nfm.L(maq.class, maqVar);
    }

    private maq() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ခ\u0002\u0004\u0016", new Object[]{"a", "b", "c", "e", "d"});
            }
            if (i2 == 3) {
                return new maq();
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
                synchronized (maq.class) {
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
