package defpackage;

/* compiled from: PG */
/* renamed from: mtr  reason: default package */
/* loaded from: classes2.dex */
public final class mtr extends nfm implements nha {
    public static final mtr g;
    private static volatile nhf h;
    public int a;
    public msg b;
    public int c;
    public int d;
    public String e = "";
    public long f;

    static {
        mtr mtrVar = new mtr();
        g = mtrVar;
        nfm.L(mtr.class, mtrVar);
    }

    private mtr() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0006ဂ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new mtr();
            }
            if (i2 == 4) {
                return new nfh(g);
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = h;
            if (nhfVar == null) {
                synchronized (mtr.class) {
                    nhfVar = h;
                    if (nhfVar == null) {
                        nhfVar = new nfi(g);
                        h = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
