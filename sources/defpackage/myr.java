package defpackage;

/* compiled from: PG */
/* renamed from: myr  reason: default package */
/* loaded from: classes2.dex */
public final class myr extends nfm implements nha {
    public static final myr d;
    private static volatile nhf e;
    public mys a;
    public ndy b;
    public int c;

    static {
        myr myrVar = new myr();
        d = myrVar;
        nfm.L(myr.class, myrVar);
    }

    private myr() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0004", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new myr();
            }
            if (i2 == 4) {
                return new nfh(d);
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (myr.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
