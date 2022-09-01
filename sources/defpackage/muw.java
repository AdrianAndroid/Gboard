package defpackage;

/* compiled from: PG */
/* renamed from: muw  reason: default package */
/* loaded from: classes2.dex */
public final class muw extends nfm implements nha {
    public static final muw c;
    private static volatile nhf e;
    public boolean a;
    public String b = "";
    private int d;

    static {
        muw muwVar = new muw();
        c = muwVar;
        nfm.L(muw.class, muwVar);
    }

    private muw() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဈ\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new muw();
            }
            if (i2 == 4) {
                return new nfh(c);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (muw.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
