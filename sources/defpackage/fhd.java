package defpackage;

/* compiled from: PG */
/* renamed from: fhd  reason: default package */
/* loaded from: classes.dex */
public final class fhd extends nfm implements nha {
    public static final fhd b;
    private static volatile nhf d;
    public int a = 0;
    private Object c;

    static {
        fhd fhdVar = new fhd();
        b = fhdVar;
        nfm.L(fhd.class, fhdVar);
    }

    private fhd() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "a", fhc.class, nez.class, fhc.class});
            }
            if (i2 == 3) {
                return new fhd();
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
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (fhd.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
