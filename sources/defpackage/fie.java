package defpackage;

/* compiled from: PG */
/* renamed from: fie  reason: default package */
/* loaded from: classes.dex */
public final class fie extends nfm implements nha {
    public static final fie b;
    private static volatile nhf c;
    public bkj a;

    static {
        fie fieVar = new fie();
        b = fieVar;
        nfm.L(fie.class, fieVar);
    }

    private fie() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new fie();
            }
            if (i2 == 4) {
                return new nfh(b);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (fie.class) {
                    nhfVar = c;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        c = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
