package defpackage;

/* compiled from: PG */
/* renamed from: ggj  reason: default package */
/* loaded from: classes.dex */
public final class ggj extends nfm implements nha {
    public static final ggj d;
    private static volatile nhf e;
    public int a;
    public int b;
    public double c;

    static {
        ggj ggjVar = new ggj();
        d = ggjVar;
        nfm.L(ggj.class, ggjVar);
    }

    private ggj() {
        nfn nfnVar = nfn.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\n\u0002\u0000\u0000\u0000\u0001ဋ\u0000\nက\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ggj();
            }
            if (i2 == 4) {
                return new nfh(d);
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (ggj.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
