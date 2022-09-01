package defpackage;

/* compiled from: PG */
/* renamed from: bnr  reason: default package */
/* loaded from: classes.dex */
public final class bnr extends nfm implements nha {
    public static final bnr e;
    private static volatile nhf f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        bnr bnrVar = new bnr();
        e = bnrVar;
        nfm.L(bnr.class, bnrVar);
    }

    private bnr() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", cgs.b});
            }
            if (i2 == 3) {
                return new bnr();
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
                synchronized (bnr.class) {
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
