package defpackage;

/* compiled from: PG */
/* renamed from: mpf  reason: default package */
/* loaded from: classes2.dex */
public final class mpf extends nfm implements nha {
    public static final mpf c;
    private static volatile nhf d;
    public int a;
    public int b;

    static {
        mpf mpfVar = new mpf();
        c = mpfVar;
        nfm.L(mpf.class, mpfVar);
    }

    private mpf() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဌ\u0004", new Object[]{"a", "b", mgk.g});
            }
            if (i2 == 3) {
                return new mpf();
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
                synchronized (mpf.class) {
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
