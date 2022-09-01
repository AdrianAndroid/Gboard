package defpackage;

/* compiled from: PG */
/* renamed from: fgz  reason: default package */
/* loaded from: classes.dex */
public final class fgz extends nfm implements nha {
    public static final fgz c;
    private static volatile nhf d;
    public int a = 0;
    public Object b;

    static {
        fgz fgzVar = new fgz();
        c = fgzVar;
        nfm.L(fgz.class, fgzVar);
    }

    private fgz() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"b", "a", fgu.class, bko.class, fhk.class, bkn.class, fha.class, fgw.class});
            }
            if (i2 == 3) {
                return new fgz();
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
                synchronized (fgz.class) {
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
