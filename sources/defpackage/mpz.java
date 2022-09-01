package defpackage;

/* compiled from: PG */
/* renamed from: mpz  reason: default package */
/* loaded from: classes2.dex */
public final class mpz extends nfm implements nha {
    public static final mpz c;
    private static volatile nhf d;
    public int a;
    public boolean b;

    static {
        mpz mpzVar = new mpz();
        c = mpzVar;
        nfm.L(mpz.class, mpzVar);
    }

    private mpz() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new mpz();
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
                synchronized (mpz.class) {
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
