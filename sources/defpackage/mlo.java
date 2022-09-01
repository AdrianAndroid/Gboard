package defpackage;

/* compiled from: PG */
/* renamed from: mlo  reason: default package */
/* loaded from: classes.dex */
public final class mlo extends nfm implements nha {
    public static final mlo d;
    private static volatile nhf e;
    public int a;
    public int b;
    public int c;

    static {
        mlo mloVar = new mlo();
        d = mloVar;
        nfm.L(mlo.class, mloVar);
    }

    private mlo() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0000\u0003\u0000\u0000\u0001\u0006\u0003\u0000\u0000\u0000\u0001\f\u0002\u0004\u0006\f", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new mlo();
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
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (mlo.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
