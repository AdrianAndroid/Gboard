package defpackage;

/* compiled from: PG */
/* renamed from: kmx  reason: default package */
/* loaded from: classes.dex */
public final class kmx extends nfm implements nha {
    public static final kmx c;
    private static volatile nhf e;
    public nga a = nhi.b;
    public kmy b;
    private int d;

    static {
        kmx kmxVar = new kmx();
        c = kmxVar;
        nfm.L(kmx.class, kmxVar);
    }

    private kmx() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003ဉ\u0000", new Object[]{"d", "a", kms.class, "b"});
            }
            if (i2 == 3) {
                return new kmx();
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
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (kmx.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
