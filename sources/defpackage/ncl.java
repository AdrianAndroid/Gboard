package defpackage;

/* compiled from: PG */
/* renamed from: ncl  reason: default package */
/* loaded from: classes2.dex */
public final class ncl extends nfm implements nha {
    public static final ncl c;
    private static volatile nhf d;
    public int a;
    public nce b;

    static {
        ncl nclVar = new ncl();
        c = nclVar;
        nfm.L(ncl.class, nclVar);
    }

    private ncl() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\n", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ncl();
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
                synchronized (ncl.class) {
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
