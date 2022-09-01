package defpackage;

/* compiled from: PG */
/* renamed from: njb  reason: default package */
/* loaded from: classes2.dex */
public final class njb extends nfm implements nha {
    public static final njb b;
    private static volatile nhf c;
    public nfs a = nfn.b;

    static {
        njb njbVar = new njb();
        b = njbVar;
        nfm.L(njb.class, njbVar);
    }

    private njb() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new njb();
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
                synchronized (njb.class) {
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
