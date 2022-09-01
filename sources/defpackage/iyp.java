package defpackage;

/* compiled from: PG */
/* renamed from: iyp  reason: default package */
/* loaded from: classes.dex */
public final class iyp extends nfm implements nha {
    public static final iyp d;
    private static volatile nhf e;
    public int a;
    public nfs b = nfn.b;
    public String c = "";

    static {
        iyp iypVar = new iyp();
        d = iypVar;
        nfm.L(iyp.class, iypVar);
    }

    private iyp() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0001\u0000\u0004\u0016\u0005ဈ\u0003", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new iyp();
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
                synchronized (iyp.class) {
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
