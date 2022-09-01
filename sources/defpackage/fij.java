package defpackage;

/* compiled from: PG */
/* renamed from: fij  reason: default package */
/* loaded from: classes.dex */
public final class fij extends nfm implements nha {
    public static final fij c;
    private static volatile nhf d;
    public int a = 0;
    public Object b;

    static {
        fij fijVar = new fij();
        c = fijVar;
        nfm.L(fij.class, fijVar);
    }

    private fij() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0000\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"b", "a", fig.class, fif.class, fhi.class});
            }
            if (i2 == 3) {
                return new fij();
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
                synchronized (fij.class) {
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
