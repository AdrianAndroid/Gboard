package defpackage;

/* compiled from: PG */
/* renamed from: mdv  reason: default package */
/* loaded from: classes.dex */
public final class mdv extends nfm implements nha {
    public static final mdv f;
    private static volatile nhf g;
    public int a;
    public int b;
    public int c;
    public nga d = nhi.b;
    public int e;

    static {
        mdv mdvVar = new mdv();
        f = mdvVar;
        nfm.L(mdv.class, mdvVar);
    }

    private mdv() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b\u0004င\u0002", new Object[]{"a", "b", mdu.c(), "c", mdt.c(), "d", mbw.class, "e"});
            }
            if (i2 == 3) {
                return new mdv();
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
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (mdv.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
