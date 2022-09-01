package defpackage;

/* compiled from: PG */
/* renamed from: mby  reason: default package */
/* loaded from: classes.dex */
public final class mby extends nfm implements nha {
    public static final mby f;
    private static volatile nhf g;
    public int a;
    public int b;
    public mbw c;
    public mbx d;
    public int e;

    static {
        mby mbyVar = new mby();
        f = mbyVar;
        nfm.L(mby.class, mbyVar);
    }

    private mby() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", mbm.i, "c", "d", "e", mbm.o});
            }
            if (i2 == 3) {
                return new mby();
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
                synchronized (mby.class) {
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
