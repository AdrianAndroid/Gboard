package defpackage;

/* compiled from: PG */
/* renamed from: fii  reason: default package */
/* loaded from: classes.dex */
public final class fii extends nfm implements nha {
    public static final fii c;
    private static volatile nhf d;
    public int a = 0;
    public Object b;

    static {
        fii fiiVar = new fii();
        c = fiiVar;
        nfm.L(fii.class, fiiVar);
    }

    private fii() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"b", "a", fhj.class, fhq.class, fhb.class, fih.class});
            }
            if (i2 == 3) {
                return new fii();
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
                synchronized (fii.class) {
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
