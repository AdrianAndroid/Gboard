package defpackage;

/* compiled from: PG */
/* renamed from: izj  reason: default package */
/* loaded from: classes.dex */
public final class izj extends nfm implements nha {
    public static final izj a;
    private static volatile nhf d;
    private ngu b = ngu.a;
    private ngu c = ngu.a;

    static {
        izj izjVar = new izj();
        a = izjVar;
        nfm.L(izj.class, izjVar);
    }

    private izj() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0002\u0000\u0000\u0002\u0003\u0002\u0002\u0000\u0000\u00022\u00032", new Object[]{"b", izf.a, "c", izg.a});
            }
            if (i2 == 3) {
                return new izj();
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
                synchronized (izj.class) {
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
