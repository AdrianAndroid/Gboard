package defpackage;

/* compiled from: PG */
/* renamed from: mgc  reason: default package */
/* loaded from: classes.dex */
public final class mgc extends nfm implements nha {
    public static final mgc d;
    private static volatile nhf e;
    public int a;
    public int b;
    public int c;

    static {
        mgc mgcVar = new mgc();
        d = mgcVar;
        nfm.L(mgc.class, mgcVar);
    }

    private mgc() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", mdw.s, "c", mge.c()});
            }
            if (i2 == 3) {
                return new mgc();
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
                synchronized (mgc.class) {
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
