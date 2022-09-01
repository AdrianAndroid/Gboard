package defpackage;

/* compiled from: PG */
/* renamed from: njp  reason: default package */
/* loaded from: classes2.dex */
public final class njp extends nfm implements nha {
    public static final njp b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        njp njpVar = new njp();
        b = njpVar;
        nfm.L(njp.class, njpVar);
    }

    private njp() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", oxo.class});
            }
            if (i2 == 3) {
                return new njp();
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
                synchronized (njp.class) {
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
