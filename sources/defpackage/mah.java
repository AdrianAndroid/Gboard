package defpackage;

/* compiled from: PG */
/* renamed from: mah  reason: default package */
/* loaded from: classes.dex */
public final class mah extends nfm implements nha {
    public static final mah e;
    private static volatile nhf f;
    public int a;
    public boolean b;
    public nfs c;
    public nfs d;

    static {
        mah mahVar = new mah();
        e = mahVar;
        nfm.L(mah.class, mahVar);
    }

    private mah() {
        nfn nfnVar = nfn.b;
        this.c = nfnVar;
        this.d = nfnVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဇ\u0000\u0002\u0016\u0003\u0016", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new mah();
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
                synchronized (mah.class) {
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
