package defpackage;

/* compiled from: PG */
/* renamed from: muu  reason: default package */
/* loaded from: classes2.dex */
public final class muu extends nfm implements nha {
    public static final muu b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        muu muuVar = new muu();
        b = muuVar;
        nfm.L(muu.class, muuVar);
    }

    private muu() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", mut.class});
            }
            if (i2 == 3) {
                return new muu();
            }
            if (i2 == 4) {
                return new nfh((boolean[]) null, (short[]) null);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (muu.class) {
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
