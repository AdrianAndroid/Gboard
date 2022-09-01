package defpackage;

/* compiled from: PG */
/* renamed from: gfv  reason: default package */
/* loaded from: classes.dex */
public final class gfv extends nfm implements nha {
    public static final gfv e;
    private static volatile nhf f;
    public int a;
    public int b;
    public nga c = nhi.b;
    public int d;

    static {
        gfv gfvVar = new gfv();
        e = gfvVar;
        nfm.L(gfv.class, gfvVar);
    }

    private gfv() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဋ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"a", "b", "c", gfw.class, "d", cgs.l});
            }
            if (i2 == 3) {
                return new gfv();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (gfv.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
