package defpackage;

/* compiled from: PG */
/* renamed from: mew  reason: default package */
/* loaded from: classes.dex */
public final class mew extends nfm implements nha {
    public static final mew e;
    private static volatile nhf f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        mew mewVar = new mew();
        e = mewVar;
        nfm.L(mew.class, mewVar);
    }

    private mew() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", mev.c(), "c", "d"});
            }
            if (i2 == 3) {
                return new mew();
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
                synchronized (mew.class) {
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
