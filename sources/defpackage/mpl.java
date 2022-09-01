package defpackage;

/* compiled from: PG */
/* renamed from: mpl  reason: default package */
/* loaded from: classes2.dex */
public final class mpl extends nfm implements nha {
    public static final mpl c;
    private static volatile nhf e;
    public int a;
    public int b;
    private mpj d;

    static {
        mpl mplVar = new mpl();
        c = mplVar;
        nfm.L(mpl.class, mplVar);
    }

    private mpl() {
        nfn nfnVar = nfn.b;
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u000113\u0002\u0000\u0000\u00001ဌ\u00023ဉ\u0004", new Object[]{"a", "b", mgk.i, "d"});
            }
            if (i2 == 3) {
                return new mpl();
            }
            if (i2 == 4) {
                return new nfh(c);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (mpl.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
