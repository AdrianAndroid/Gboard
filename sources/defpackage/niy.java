package defpackage;

/* compiled from: PG */
/* renamed from: niy  reason: default package */
/* loaded from: classes2.dex */
public final class niy extends nfm implements nha {
    public static final niy c;
    private static volatile nhf d;
    public int a = 0;
    public Object b;

    static {
        niy niyVar = new niy();
        c = niyVar;
        nfm.L(niy.class, niyVar);
    }

    private niy() {
    }

    public static nfh c() {
        return c.t();
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဿ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", mxe.j, niw.class, nix.class});
            }
            if (i2 == 3) {
                return new niy();
            }
            if (i2 == 4) {
                return new nfh((short[][]) null);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (niy.class) {
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
