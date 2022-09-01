package defpackage;

/* compiled from: PG */
/* renamed from: mty  reason: default package */
/* loaded from: classes2.dex */
public final class mty extends nfm implements nha {
    public static final mty e;
    private static volatile nhf f;
    public int a;
    public int b;
    public nga c = nhi.b;
    public mse d;

    static {
        mty mtyVar = new mty();
        e = mtyVar;
        nfm.L(mty.class, mtyVar);
    }

    private mty() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000\u0005ဉ\u0001", new Object[]{"a", "c", mse.class, "b", msb.j, "d"});
            }
            if (i2 == 3) {
                return new mty();
            }
            if (i2 == 4) {
                return new nfh((short[][][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (mty.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
