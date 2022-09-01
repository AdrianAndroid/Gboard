package defpackage;

/* compiled from: PG */
/* renamed from: mfu  reason: default package */
/* loaded from: classes.dex */
public final class mfu extends nfm implements nha {
    public static final mfu a;
    private static volatile nhf c;
    private ngu b = ngu.a;

    static {
        mfu mfuVar = new mfu();
        a = mfuVar;
        nfm.L(mfu.class, mfuVar);
    }

    private mfu() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", mft.a});
            }
            if (i2 == 3) {
                return new mfu();
            }
            if (i2 == 4) {
                return new nfh(a);
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (mfu.class) {
                    nhfVar = c;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        c = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
