package defpackage;

/* compiled from: PG */
/* renamed from: kmu  reason: default package */
/* loaded from: classes.dex */
public final class kmu extends nfm implements nha {
    public static final kmu d;
    private static volatile nhf f;
    public int a;
    public int b;
    public boolean c;
    private ngu e = ngu.a;

    static {
        kmu kmuVar = new kmu();
        d = kmuVar;
        nfm.L(kmu.class, kmuVar);
    }

    private kmu() {
        nfn nfnVar = nfn.b;
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0000\u0001\u0004\u0013\u0003\u0001\u0000\u0000\u0004င\u0001\u0005ဇ\b\u00132", new Object[]{"a", "b", "c", "e", kmt.a});
            }
            if (i2 == 3) {
                return new kmu();
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
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (kmu.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
