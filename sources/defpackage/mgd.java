package defpackage;

/* compiled from: PG */
/* renamed from: mgd  reason: default package */
/* loaded from: classes.dex */
public final class mgd extends nfm implements nha {
    public static final mgd c;
    private static volatile nhf d;
    public int a;
    public long b;

    static {
        mgd mgdVar = new mgd();
        c = mgdVar;
        nfm.L(mgd.class, mgdVar);
    }

    private mgd() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new mgd();
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
                synchronized (mgd.class) {
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
