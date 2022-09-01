package defpackage;

/* compiled from: PG */
/* renamed from: mya  reason: default package */
/* loaded from: classes2.dex */
public final class mya extends nfm implements nha {
    public static final mya d;
    private static volatile nhf f;
    public String a = "";
    public int b = 1;
    public nga c = nhi.b;
    private int e;

    static {
        mya myaVar = new mya();
        d = myaVar;
        nfm.L(mya.class, myaVar);
    }

    private mya() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u001a", new Object[]{"e", "a", "b", mxz.c(), "c"});
            }
            if (i2 == 3) {
                return new mya();
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
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (mya.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
