package defpackage;

/* compiled from: PG */
/* renamed from: njz  reason: default package */
/* loaded from: classes2.dex */
public final class njz extends nfm implements nha {
    public static final njz b;
    private static volatile nhf d;
    public int a;
    private int c;

    static {
        njz njzVar = new njz();
        b = njzVar;
        nfm.L(njz.class, njzVar);
    }

    private njz() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", mxe.r});
            }
            if (i2 == 3) {
                return new njz();
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
                synchronized (njz.class) {
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
