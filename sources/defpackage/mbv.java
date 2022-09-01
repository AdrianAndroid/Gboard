package defpackage;

/* compiled from: PG */
/* renamed from: mbv  reason: default package */
/* loaded from: classes.dex */
public final class mbv extends nfm implements nha {
    public static final mbv c;
    private static volatile nhf d;
    public int a;
    public int b;

    static {
        mbv mbvVar = new mbv();
        c = mbvVar;
        nfm.L(mbv.class, mbvVar);
    }

    private mbv() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", mbm.f});
            }
            if (i2 == 3) {
                return new mbv();
            }
            if (i2 == 4) {
                return new nfh(c);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (mbv.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
