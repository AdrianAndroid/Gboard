package defpackage;

/* compiled from: PG */
/* renamed from: meh  reason: default package */
/* loaded from: classes.dex */
public final class meh extends nfm implements nha {
    public static final meh e;
    private static volatile nhf f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        meh mehVar = new meh();
        e = mehVar;
        nfm.L(meh.class, mehVar);
    }

    private meh() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001င\u0000\u0004င\u0003\u0006င\u0005", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new meh();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (meh.class) {
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
