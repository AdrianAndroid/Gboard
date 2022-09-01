package defpackage;

/* compiled from: PG */
/* renamed from: mtk  reason: default package */
/* loaded from: classes2.dex */
public final class mtk extends nfm implements nha {
    public static final mtk f;
    private static volatile nhf g;
    public int a;
    public msg b;
    public nga c = nhi.b;
    public mse d;
    public long e;

    static {
        mtk mtkVar = new mtk();
        f = mtkVar;
        nfm.L(mtk.class, mtkVar);
    }

    private mtk() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဂ\u0002\u0004ဉ\u0001", new Object[]{"a", "b", "c", mse.class, "e", "d"});
            }
            if (i2 == 3) {
                return new mtk();
            }
            if (i2 == 4) {
                return new nfh((byte[][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (mtk.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
