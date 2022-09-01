package defpackage;

/* compiled from: PG */
/* renamed from: fhv  reason: default package */
/* loaded from: classes.dex */
public final class fhv extends nfm implements nha {
    public static final fhv c;
    private static volatile nhf d;
    public bkl a;
    public int b;

    static {
        fhv fhvVar = new fhv();
        c = fhvVar;
        nfm.L(fhv.class, fhvVar);
    }

    private fhv() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\t\u0003\f", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new fhv();
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
                synchronized (fhv.class) {
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
