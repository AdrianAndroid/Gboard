package defpackage;

/* compiled from: PG */
/* renamed from: mek  reason: default package */
/* loaded from: classes.dex */
public final class mek extends nfm implements nha {
    public static final mek e;
    private static volatile nhf f;
    public int a;
    public mce b;
    public mce c;
    public boolean d;

    static {
        mek mekVar = new mek();
        e = mekVar;
        nfm.L(mek.class, mekVar);
    }

    private mek() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new mek();
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
                synchronized (mek.class) {
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
