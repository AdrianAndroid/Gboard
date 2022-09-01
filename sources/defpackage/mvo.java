package defpackage;

/* compiled from: PG */
/* renamed from: mvo  reason: default package */
/* loaded from: classes2.dex */
public final class mvo extends nfm implements nha {
    public static final mvo d;
    private static volatile nhf e;
    public int a;
    public String b = "";
    public long c;

    static {
        mvo mvoVar = new mvo();
        d = mvoVar;
        nfm.L(mvo.class, mvoVar);
    }

    private mvo() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဂ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new mvo();
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
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (mvo.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
