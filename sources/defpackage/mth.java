package defpackage;

/* compiled from: PG */
/* renamed from: mth  reason: default package */
/* loaded from: classes2.dex */
public final class mth extends nfm implements nha {
    public static final mth c;
    private static volatile nhf d;
    public nga a = nhi.b;
    public nfr b = nff.b;

    static {
        mth mthVar = new mth();
        c = mthVar;
        nfm.L(mth.class, mthVar);
    }

    private mth() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u0013", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new mth();
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
                synchronized (mth.class) {
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
