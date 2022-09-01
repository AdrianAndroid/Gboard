package defpackage;

/* compiled from: PG */
/* renamed from: bwy  reason: default package */
/* loaded from: classes.dex */
public final class bwy extends nfm implements nha {
    public static final bwy d;
    private static volatile nhf e;
    public int a;
    public int b;
    public nga c = nhi.b;

    static {
        bwy bwyVar = new bwy();
        d = bwyVar;
        nfm.L(bwy.class, bwyVar);
    }

    private bwy() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"a", "b", "c", bww.class});
            }
            if (i2 == 3) {
                return new bwy();
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
                synchronized (bwy.class) {
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
