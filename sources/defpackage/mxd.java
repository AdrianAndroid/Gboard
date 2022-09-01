package defpackage;

/* compiled from: PG */
/* renamed from: mxd  reason: default package */
/* loaded from: classes2.dex */
public final class mxd extends nfm implements nha {
    public static final mxd b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        mxd mxdVar = new mxd();
        b = mxdVar;
        nfm.L(mxd.class, mxdVar);
    }

    private mxd() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", mxc.class});
            }
            if (i2 == 3) {
                return new mxd();
            }
            if (i2 == 4) {
                return new nfh((char[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (mxd.class) {
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
