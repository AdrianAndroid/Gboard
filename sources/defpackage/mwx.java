package defpackage;

/* compiled from: PG */
/* renamed from: mwx  reason: default package */
/* loaded from: classes2.dex */
public final class mwx extends nfm implements nha {
    public static final mwx e;
    private static volatile nhf f;
    public int a;
    public mve b;
    public long c;
    public mww d;

    static {
        mwx mwxVar = new mwx();
        e = mwxVar;
        nfm.L(mwx.class, mwxVar);
    }

    private mwx() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new mwx();
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
                synchronized (mwx.class) {
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
