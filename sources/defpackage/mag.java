package defpackage;

/* compiled from: PG */
/* renamed from: mag  reason: default package */
/* loaded from: classes.dex */
public final class mag extends nfm implements nha {
    public static final mag d;
    private static volatile nhf e;
    public int a;
    public maf b;
    public int c;

    static {
        mag magVar = new mag();
        d = magVar;
        nfm.L(mag.class, magVar);
    }

    private mag() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", jih.o});
            }
            if (i2 == 3) {
                return new mag();
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
                synchronized (mag.class) {
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
