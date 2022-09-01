package defpackage;

/* compiled from: PG */
/* renamed from: cku  reason: default package */
/* loaded from: classes.dex */
public final class cku extends nfm implements nha {
    public static final cku d;
    private static volatile nhf e;
    public int a;
    public ngu b = ngu.a;
    public int c;

    static {
        cku ckuVar = new cku();
        d = ckuVar;
        nfm.L(cku.class, ckuVar);
    }

    private cku() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002င\u0000", new Object[]{"a", "b", ckt.a, "c"});
            }
            if (i2 == 3) {
                return new cku();
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
                synchronized (cku.class) {
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
