package defpackage;

/* compiled from: PG */
/* renamed from: cdy  reason: default package */
/* loaded from: classes.dex */
public final class cdy extends nfm implements nha {
    public static final cdy e;
    private static volatile nhf f;
    public int a;
    public nga b = nhi.b;
    public int c;
    public long d;

    static {
        cdy cdyVar = new cdy();
        e = cdyVar;
        nfm.L(cdy.class, cdyVar);
    }

    private cdy() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003ဂ\u0001", new Object[]{"a", "b", cdz.class, "c", "d"});
            }
            if (i2 == 3) {
                return new cdy();
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
                synchronized (cdy.class) {
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
