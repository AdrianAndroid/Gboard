package defpackage;

/* compiled from: PG */
/* renamed from: nml  reason: default package */
/* loaded from: classes2.dex */
public final class nml extends nfm implements nha {
    public static final nml c;
    private static volatile nhf d;
    public int a = 0;
    public Object b;

    static {
        nml nmlVar = new nml();
        c = nmlVar;
        nfm.L(nml.class, nmlVar);
    }

    private nml() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", nmm.class, nmk.class});
            }
            if (i2 == 3) {
                return new nml();
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
                synchronized (nml.class) {
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
