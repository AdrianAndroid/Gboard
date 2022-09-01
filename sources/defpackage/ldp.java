package defpackage;

/* compiled from: PG */
/* renamed from: ldp  reason: default package */
/* loaded from: classes.dex */
public final class ldp extends nfm implements nha {
    public static final ldp b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        ldp ldpVar = new ldp();
        b = ldpVar;
        nfm.L(ldp.class, ldpVar);
    }

    private ldp() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", ldo.class});
            }
            if (i2 == 3) {
                return new ldp();
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
                synchronized (ldp.class) {
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
