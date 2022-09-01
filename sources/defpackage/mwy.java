package defpackage;

/* compiled from: PG */
/* renamed from: mwy  reason: default package */
/* loaded from: classes2.dex */
public final class mwy extends nfm implements nha {
    public static final mwy c;
    private static volatile nhf e;
    public int a;
    public lzz b;
    private int d;

    static {
        mwy mwyVar = new mwy();
        c = mwyVar;
        nfm.L(mwy.class, mwyVar);
    }

    private mwy() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", mxe.b, "b"});
            }
            if (i2 == 3) {
                return new mwy();
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
                synchronized (mwy.class) {
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
