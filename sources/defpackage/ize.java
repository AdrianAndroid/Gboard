package defpackage;

/* compiled from: PG */
/* renamed from: ize  reason: default package */
/* loaded from: classes.dex */
public final class ize extends nfm implements nha {
    public static final ize b;
    private static volatile nhf g;
    public iyw a;
    private int c;
    private ngu d = ngu.a;
    private ngu e;
    private ngu f;

    static {
        ize izeVar = new ize();
        b = izeVar;
        nfm.L(ize.class, izeVar);
    }

    private ize() {
        ngu nguVar = ngu.a;
        this.e = nguVar;
        this.f = nguVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0003\u0000\u0000\u00012\u00022\u00052\u0007ဉ\u0003", new Object[]{"c", "d", izc.a, "e", izd.a, "f", izb.a, "a"});
            }
            if (i2 == 3) {
                return new ize();
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
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (ize.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
