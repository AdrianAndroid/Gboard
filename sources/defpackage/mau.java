package defpackage;

/* compiled from: PG */
/* renamed from: mau  reason: default package */
/* loaded from: classes.dex */
public final class mau extends nfm implements nha {
    public static final mau e;
    private static volatile nhf f;
    public int a;
    public String b = "";
    public String c = "";
    public int d;

    static {
        mau mauVar = new mau();
        e = mauVar;
        nfm.L(mau.class, mauVar);
    }

    private mau() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", maw.b});
            }
            if (i2 == 3) {
                return new mau();
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
                synchronized (mau.class) {
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
