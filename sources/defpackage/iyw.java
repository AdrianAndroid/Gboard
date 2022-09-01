package defpackage;

/* compiled from: PG */
/* renamed from: iyw  reason: default package */
/* loaded from: classes.dex */
public final class iyw extends nfm implements nha {
    public static final iyw c;
    private static volatile nhf e;
    public int a;
    public int b;
    private ngu d = ngu.a;

    static {
        iyw iywVar = new iyw();
        c = iywVar;
        nfm.L(iyw.class, iywVar);
    }

    private iyw() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002ဌ\u0000", new Object[]{"a", "d", iyv.a, "b", ggq.o});
            }
            if (i2 == 3) {
                return new iyw();
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
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (iyw.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
