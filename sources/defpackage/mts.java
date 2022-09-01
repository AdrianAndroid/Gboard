package defpackage;

/* compiled from: PG */
/* renamed from: mts  reason: default package */
/* loaded from: classes2.dex */
public final class mts extends nfm implements nha {
    public static final mts f;
    private static volatile nhf g;
    public int a;
    public msh b;
    public int c;
    public mrw d;
    public int e;

    static {
        mts mtsVar = new mts();
        f = mtsVar;
        nfm.L(mts.class, mtsVar);
    }

    private mts() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဉ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", msb.h});
            }
            if (i2 == 3) {
                return new mts();
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
                synchronized (mts.class) {
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
