package defpackage;

/* compiled from: PG */
/* renamed from: ldj  reason: default package */
/* loaded from: classes.dex */
public final class ldj extends nfm implements nha {
    public static final ldj a;
    private static volatile nhf e;
    private int b;
    private long c;
    private byte d = 2;

    static {
        ldj ldjVar = new ldj();
        a = ldjVar;
        nfm.L(ldj.class, ldjVar);
    }

    private ldj() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔂ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new ldj();
            }
            if (i2 == 4) {
                return new nfh(a);
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (ldj.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.d);
    }
}
