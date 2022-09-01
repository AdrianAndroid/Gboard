package defpackage;

/* compiled from: PG */
/* renamed from: ncm  reason: default package */
/* loaded from: classes2.dex */
public final class ncm extends nfm implements nha {
    public static final ncm c;
    private static volatile nhf d;
    public int a;
    public int b;

    static {
        ncm ncmVar = new ncm();
        c = ncmVar;
        nfm.L(ncm.class, ncmVar);
    }

    private ncm() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", mxe.i});
            }
            if (i2 == 3) {
                return new ncm();
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
                synchronized (ncm.class) {
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
