package defpackage;

/* compiled from: PG */
/* renamed from: nmv  reason: default package */
/* loaded from: classes2.dex */
public final class nmv extends nfk implements nha {
    public static final nmv b;
    private static volatile nhf g;
    private int c;
    private nmu e;
    private byte f = 2;
    public nga a = nhi.b;

    static {
        nmv nmvVar = new nmv();
        b = nmvVar;
        nfm.L(nmv.class, nmvVar);
    }

    private nmv() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return K(b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000", new Object[]{"c", "a", nmr.class, "e"});
            }
            if (i2 == 3) {
                return new nmv();
            }
            if (i2 == 4) {
                return new nfj(b);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (nmv.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.f);
    }
}
