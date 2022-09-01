package defpackage;

/* compiled from: PG */
/* renamed from: mxg  reason: default package */
/* loaded from: classes2.dex */
public final class mxg extends nfm implements nha {
    public static final mxg d;
    private static volatile nhf e;
    public int a;
    public nga b = nhi.b;
    public mve c;

    static {
        mxg mxgVar = new mxg();
        d = mxgVar;
        nfm.L(mxg.class, mxgVar);
    }

    private mxg() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new mxg();
            }
            if (i2 == 4) {
                return new nfh((char[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (mxg.class) {
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
