package defpackage;

/* compiled from: PG */
/* renamed from: fha  reason: default package */
/* loaded from: classes.dex */
public final class fha extends nfm implements nha {
    public static final fha b;
    private static volatile nhf c;
    public nfs a = nfn.b;

    static {
        fha fhaVar = new fha();
        b = fhaVar;
        nfm.L(fha.class, fhaVar);
    }

    private fha() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new fha();
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
                synchronized (fha.class) {
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
