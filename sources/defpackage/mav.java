package defpackage;

/* compiled from: PG */
/* renamed from: mav  reason: default package */
/* loaded from: classes.dex */
public final class mav extends nfm implements nha {
    public static final mav e;
    private static volatile nhf f;
    public int a;
    public mai b;
    public int c;
    public int d;

    static {
        mav mavVar = new mav();
        e = mavVar;
        nfm.L(mav.class, mavVar);
    }

    private mav() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0003\u0007\u0003\u0000\u0000\u0000\u0003ဉ\u0002\u0005ဌ\u0003\u0007င\u0004", new Object[]{"a", "b", "c", maw.a, "d"});
            }
            if (i2 == 3) {
                return new mav();
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
                synchronized (mav.class) {
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
}       return (byte) 1;
    }
}
