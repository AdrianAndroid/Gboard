package defpackage;

/* compiled from: PG */
/* renamed from: mxv  reason: default package */
/* loaded from: classes2.dex */
public final class mxv extends nfm implements nha {
    public static final mxv d;
    private static volatile nhf f;
    public int a;
    public nga b = nhi.b;
    public nfs c = nfn.b;
    private int e;

    static {
        mxv mxvVar = new mxv();
        d = mxvVar;
        nfm.L(mxv.class, mxvVar);
    }

    private mxv() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001c\u0003'", new Object[]{"e", "a", mxe.e, "b", "c"});
            }
            if (i2 == 3) {
                return new mxv();
            }
            if (i2 == 4) {
                return new nfh(d);
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (mxv.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
