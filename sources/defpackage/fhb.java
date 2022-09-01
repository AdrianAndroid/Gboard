package defpackage;

/* compiled from: PG */
/* renamed from: fhb  reason: default package */
/* loaded from: classes.dex */
public final class fhb extends nfm implements nha {
    public static final fhb b;
    private static volatile nhf c;
    public int a;

    static {
        fhb fhbVar = new fhb();
        b = fhbVar;
        nfm.L(fhb.class, fhbVar);
    }

    private fhb() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new fhb();
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
                synchronized (fhb.class) {
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
