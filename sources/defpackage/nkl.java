package defpackage;

/* compiled from: PG */
/* renamed from: nkl  reason: default package */
/* loaded from: classes2.dex */
public final class nkl extends nfm implements nha {
    public static final nkl f;
    public static final ngt g;
    private static volatile nhf h;
    public int a;
    public int b;
    public float c;
    public int d = 1;
    public long e;

    static {
        nkl nklVar = new nkl();
        f = nklVar;
        nfm.L(nkl.class, nklVar);
        g = nfm.P(nks.f, nklVar, nklVar, 293100, nik.MESSAGE);
    }

    private nkl() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0002\t\u0004\u0000\u0000\u0000\u0002ခ\u0001\u0003ဌ\u0000\u0004င\u0002\tဂ\u0007", new Object[]{"a", "c", "b", mxe.t, "d", "e"});
            }
            if (i2 == 3) {
                return new nkl();
            }
            if (i2 == 4) {
                return new nfh(f);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = h;
            if (nhfVar == null) {
                synchronized (nkl.class) {
                    nhfVar = h;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        h = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
