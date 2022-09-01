package defpackage;

/* compiled from: PG */
/* renamed from: iyz  reason: default package */
/* loaded from: classes.dex */
public final class iyz extends nfm implements nha {
    public static final iyz a;
    private static volatile nhf d;
    private ngu b = ngu.a;
    private ngu c = ngu.a;

    static {
        iyz iyzVar = new iyz();
        a = iyzVar;
        nfm.L(iyz.class, iyzVar);
    }

    private iyz() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"b", iyx.a, "c", iyy.a});
            }
            if (i2 == 3) {
                return new iyz();
            }
            if (i2 == 4) {
                return new nfh(a);
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (iyz.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
