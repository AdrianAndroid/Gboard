package defpackage;

/* compiled from: PG */
/* renamed from: mee  reason: default package */
/* loaded from: classes.dex */
public final class mee extends nfm implements nha {
    public static final mee d;
    private static volatile nhf e;
    public int a;
    public boolean b;
    public nga c = nhi.b;

    static {
        mee meeVar = new mee();
        d = meeVar;
        nfm.L(mee.class, meeVar);
    }

    private mee() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001b", new Object[]{"a", "b", "c", mec.class});
            }
            if (i2 == 3) {
                return new mee();
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
                synchronized (mee.class) {
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
