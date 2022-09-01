package defpackage;

/* compiled from: PG */
/* renamed from: mxf  reason: default package */
/* loaded from: classes2.dex */
public final class mxf extends nfm implements nha {
    public static final mxf c;
    private static volatile nhf e;
    public int a;
    public long b;
    private int d;

    static {
        mxf mxfVar = new mxf();
        c = mxfVar;
        nfm.L(mxf.class, mxfVar);
    }

    private mxf() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"d", "a", mxe.a, "b"});
            }
            if (i2 == 3) {
                return new mxf();
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
                synchronized (mxf.class) {
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
