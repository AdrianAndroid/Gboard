package defpackage;

/* compiled from: PG */
/* renamed from: mfz  reason: default package */
/* loaded from: classes.dex */
public final class mfz extends nfm implements nha {
    public static final mfz c;
    private static volatile nhf d;
    public int a;
    public mgb b;

    static {
        mfz mfzVar = new mfz();
        c = mfzVar;
        nfm.L(mfz.class, mfzVar);
    }

    private mfz() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new mfz();
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
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (mfz.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
