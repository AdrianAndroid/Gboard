package defpackage;

/* compiled from: PG */
/* renamed from: ggb  reason: default package */
/* loaded from: classes.dex */
public final class ggb extends nfm implements nha {
    public static final ggb b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        ggb ggbVar = new ggb();
        b = ggbVar;
        nfm.L(ggb.class, ggbVar);
    }

    private ggb() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", gga.class});
            }
            if (i2 == 3) {
                return new ggb();
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
                synchronized (ggb.class) {
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
