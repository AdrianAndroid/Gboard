package defpackage;

/* compiled from: PG */
/* renamed from: fih  reason: default package */
/* loaded from: classes.dex */
public final class fih extends nfm implements nha {
    public static final fih c;
    private static volatile nhf d;
    public int a = 0;
    public Object b;

    static {
        fih fihVar = new fih();
        c = fihVar;
        nfm.L(fih.class, fihVar);
    }

    private fih() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u00015\u0000\u00025\u0000", new Object[]{"b", "a"});
            }
            if (i2 == 3) {
                return new fih();
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
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (fih.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
