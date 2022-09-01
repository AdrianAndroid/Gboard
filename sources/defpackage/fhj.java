package defpackage;

/* compiled from: PG */
/* renamed from: fhj  reason: default package */
/* loaded from: classes.dex */
public final class fhj extends nfm implements nha {
    public static final fhj b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        fhj fhjVar = new fhj();
        b = fhjVar;
        nfm.L(fhj.class, fhjVar);
    }

    private fhj() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bns.class});
            }
            if (i2 == 3) {
                return new fhj();
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
                synchronized (fhj.class) {
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
