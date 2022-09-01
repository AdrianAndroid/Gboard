package defpackage;

/* compiled from: PG */
/* renamed from: mpm  reason: default package */
/* loaded from: classes2.dex */
public final class mpm extends nfm implements nha {
    public static final mpm e;
    private static volatile nhf f;
    public int a;
    public int b;
    public String c = "";
    public int d;

    static {
        mpm mpmVar = new mpm();
        e = mpmVar;
        nfm.L(mpm.class, mpmVar);
    }

    private mpm() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", mgk.j, "c", "d", mgk.h});
            }
            if (i2 == 3) {
                return new mpm();
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
                synchronized (mpm.class) {
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
