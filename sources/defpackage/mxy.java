package defpackage;

/* compiled from: PG */
/* renamed from: mxy  reason: default package */
/* loaded from: classes2.dex */
public final class mxy extends nfm implements nha {
    public static final mxy c;
    private static volatile nhf e;
    public String a = "locales";
    public String b = "klp_locales";
    private int d;

    static {
        mxy mxyVar = new mxy();
        c = mxyVar;
        nfm.L(mxy.class, mxyVar);
    }

    private mxy() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0005ဈ\u0004", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new mxy();
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
                synchronized (mxy.class) {
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
