package defpackage;

/* compiled from: PG */
/* renamed from: ona  reason: default package */
/* loaded from: classes2.dex */
public final class ona extends nfm implements nha {
    public static final ona b;
    private static volatile nhf c;
    public nfs a = nfn.b;

    static {
        ona onaVar = new ona();
        b = onaVar;
        nfm.L(ona.class, onaVar);
    }

    private ona() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", nlc.t});
            }
            if (i2 == 3) {
                return new ona();
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
                synchronized (ona.class) {
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
