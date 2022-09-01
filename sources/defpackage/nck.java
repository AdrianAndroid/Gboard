package defpackage;

/* compiled from: PG */
/* renamed from: nck  reason: default package */
/* loaded from: classes2.dex */
public final class nck extends nfm implements nha {
    public static final nck c;
    private static volatile nhf d;
    public int a;
    public ncm b;

    static {
        nck nckVar = new nck();
        c = nckVar;
        nfm.L(nck.class, nckVar);
    }

    private nck() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new nck();
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
                synchronized (nck.class) {
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
