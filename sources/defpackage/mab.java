package defpackage;

/* compiled from: PG */
/* renamed from: mab  reason: default package */
/* loaded from: classes.dex */
public final class mab extends nfm implements nha {
    public static final mab e;
    private static volatile nhf f;
    public int a;
    public int b;
    public boolean c;
    public mac d;

    static {
        mab mabVar = new mab();
        e = mabVar;
        nfm.L(mab.class, mabVar);
    }

    private mab() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0005ဉ\u0004", new Object[]{"a", "b", jih.k, "c", "d"});
            }
            if (i2 == 3) {
                return new mab();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (mab.class) {
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
