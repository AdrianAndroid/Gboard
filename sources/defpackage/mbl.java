package defpackage;

/* compiled from: PG */
/* renamed from: mbl  reason: default package */
/* loaded from: classes.dex */
public final class mbl extends nfm implements nha {
    public static final mbl e;
    private static volatile nhf f;
    public int a;
    public int b;
    public String c = "";
    public long d;

    static {
        mbl mblVar = new mbl();
        e = mblVar;
        nfm.L(mbl.class, mblVar);
    }

    private mbl() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", mbm.b, "c", "d"});
            }
            if (i2 == 3) {
                return new mbl();
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
                synchronized (mbl.class) {
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
