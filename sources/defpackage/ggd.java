package defpackage;

/* compiled from: PG */
/* renamed from: ggd  reason: default package */
/* loaded from: classes.dex */
public final class ggd extends nfm implements nha {
    public static final ggd c;
    private static volatile nhf d;
    public int a;
    public int b = 1;

    static {
        ggd ggdVar = new ggd();
        c = ggdVar;
        nfm.L(ggd.class, ggdVar);
    }

    private ggd() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဌ\u0003", new Object[]{"a", "b", cgs.o});
            }
            if (i2 == 3) {
                return new ggd();
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
                synchronized (ggd.class) {
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
