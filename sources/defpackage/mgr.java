package defpackage;

/* compiled from: PG */
/* renamed from: mgr  reason: default package */
/* loaded from: classes.dex */
public final class mgr extends nfm implements nha {
    public static final mgr a;
    private static volatile nhf g;
    private int b;
    private long c;
    private int d;
    private int e;
    private byte f = 2;

    static {
        mgr mgrVar = new mgr();
        a = mgrVar;
        nfm.L(mgr.class, mgrVar);
    }

    private mgr() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0002ᔆ\u0001\u0003ᔆ\u0002", new Object[]{"b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new mgr();
            }
            if (i2 == 4) {
                return new nfh(a);
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (mgr.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.f);
    }
}
