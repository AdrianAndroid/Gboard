package defpackage;

/* compiled from: PG */
/* renamed from: mce  reason: default package */
/* loaded from: classes.dex */
public final class mce extends nfm implements nha {
    public static final mce e;
    private static volatile nhf f;
    public int a;
    public String b = "";
    public String c = "";
    public int d;

    static {
        mce mceVar = new mce();
        e = mceVar;
        nfm.L(mce.class, mceVar);
    }

    private mce() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", mbm.g});
            }
            if (i2 == 3) {
                return new mce();
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
                synchronized (mce.class) {
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
