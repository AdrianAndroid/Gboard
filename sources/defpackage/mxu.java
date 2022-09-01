package defpackage;

/* compiled from: PG */
/* renamed from: mxu  reason: default package */
/* loaded from: classes2.dex */
public final class mxu extends nfm implements nha {
    public static final mxu e;
    private static volatile nhf f;
    public int a;
    public nga b = nhi.b;
    public mqy c;
    public boolean d;

    static {
        mxu mxuVar = new mxu();
        e = mxuVar;
        nfm.L(mxu.class, mxuVar);
    }

    private mxu() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001c\u0002ဉ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new mxu();
            }
            if (i2 == 4) {
                return new nfh((int[]) null, (short[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (mxu.class) {
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
