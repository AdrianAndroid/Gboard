package defpackage;

/* compiled from: PG */
/* renamed from: fhc  reason: default package */
/* loaded from: classes.dex */
public final class fhc extends nfm implements nha {
    public static final fhc a;
    private static volatile nhf b;

    static {
        fhc fhcVar = new fhc();
        a = fhcVar;
        nfm.L(fhc.class, fhcVar);
    }

    private fhc() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new fhc();
            }
            if (i2 == 4) {
                return new nfh(a);
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = b;
            if (nhfVar == null) {
                synchronized (fhc.class) {
                    nhfVar = b;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        b = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
