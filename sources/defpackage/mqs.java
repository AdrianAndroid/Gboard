package defpackage;

/* compiled from: PG */
/* renamed from: mqs  reason: default package */
/* loaded from: classes2.dex */
public final class mqs extends nfm implements nha {
    public static final mqs b;
    private static volatile nhf d;
    public int a;
    private int c;

    static {
        mqs mqsVar = new mqs();
        b = mqsVar;
        nfm.L(mqs.class, mqsVar);
    }

    private mqs() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004င\u0003", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new mqs();
            }
            if (i2 == 4) {
                return new nfh(b);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (mqs.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
