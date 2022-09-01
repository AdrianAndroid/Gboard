package defpackage;

/* compiled from: PG */
/* renamed from: mxq  reason: default package */
/* loaded from: classes2.dex */
public final class mxq extends nfm implements nha {
    public static final mxq c;
    private static volatile nhf e;
    public int a;
    public nga b = nhi.b;
    private int d;

    static {
        mxq mxqVar = new mxq();
        c = mxqVar;
        nfm.L(mxq.class, mxqVar);
    }

    private mxq() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001c", new Object[]{"d", "a", mxe.e, "b"});
            }
            if (i2 == 3) {
                return new mxq();
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
                synchronized (mxq.class) {
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
