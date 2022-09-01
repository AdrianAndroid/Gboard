package defpackage;

/* compiled from: PG */
/* renamed from: mci  reason: default package */
/* loaded from: classes.dex */
public final class mci extends nfm implements nha {
    public static final mci e;
    private static volatile nhf f;
    public int a;
    public String b = "";
    public int c;
    public int d;

    static {
        mci mciVar = new mci();
        e = mciVar;
        nfm.L(mci.class, mciVar);
    }

    private mci() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", mch.c()});
            }
            if (i2 == 3) {
                return new mci();
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
                synchronized (mci.class) {
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
