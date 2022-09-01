package defpackage;

/* compiled from: PG */
/* renamed from: ncf  reason: default package */
/* loaded from: classes2.dex */
public final class ncf extends nfm implements nha {
    public static final ncf f;
    private static volatile nhf g;
    public int a;
    public nch b;
    public nch c;
    public nci d;
    public ncn e;

    static {
        ncf ncfVar = new ncf();
        f = ncfVar;
        nfm.L(ncf.class, ncfVar);
    }

    private ncf() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"a", "d", "e", "b", "c"});
            }
            if (i2 == 3) {
                return new ncf();
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
                synchronized (ncf.class) {
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
