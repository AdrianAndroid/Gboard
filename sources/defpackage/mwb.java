package defpackage;

/* compiled from: PG */
/* renamed from: mwb  reason: default package */
/* loaded from: classes2.dex */
public final class mwb extends nfm implements nha {
    public static final mwb b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        mwb mwbVar = new mwb();
        b = mwbVar;
        nfm.L(mwb.class, mwbVar);
    }

    private mwb() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new mwb();
            }
            if (i2 == 4) {
                return new nfh((boolean[][]) null);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (mwb.class) {
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
