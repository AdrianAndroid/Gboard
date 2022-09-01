package defpackage;

/* compiled from: PG */
/* renamed from: mgw  reason: default package */
/* loaded from: classes.dex */
public final class mgw extends nfm implements nha {
    public static final mgw e;
    private static volatile nhf g;
    public int a;
    public mgu b;
    public int c;
    private byte f = 2;
    public nfs d = nfn.b;

    static {
        mgw mgwVar = new mgw();
        e = mgwVar;
        nfm.L(mgw.class, mgwVar);
    }

    private mgw() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003'", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new mgw();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
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
                synchronized (mgw.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.f);
    }
}
