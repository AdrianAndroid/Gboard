package defpackage;

/* compiled from: PG */
/* renamed from: mxh  reason: default package */
/* loaded from: classes2.dex */
public final class mxh extends nfm implements nha {
    public static final mxh c;
    private static volatile nhf e;
    public int a;
    public mxi b;
    private int d;

    static {
        mxh mxhVar = new mxh();
        c = mxhVar;
        nfm.L(mxh.class, mxhVar);
    }

    private mxh() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", mxe.e, "b"});
            }
            if (i2 == 3) {
                return new mxh();
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
                synchronized (mxh.class) {
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
