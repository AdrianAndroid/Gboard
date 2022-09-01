package defpackage;

/* compiled from: PG */
/* renamed from: mwd  reason: default package */
/* loaded from: classes2.dex */
public final class mwd extends nfm implements nha {
    public static final mwd b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        mwd mwdVar = new mwd();
        b = mwdVar;
        nfm.L(mwd.class, mwdVar);
    }

    private mwd() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", mwc.class});
            }
            if (i2 == 3) {
                return new mwd();
            }
            if (i2 == 4) {
                return new nfh((boolean[][][]) null);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (mwd.class) {
                    nhfVar = c;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        c = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
