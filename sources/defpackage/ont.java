package defpackage;

/* compiled from: PG */
/* renamed from: ont  reason: default package */
/* loaded from: classes2.dex */
public final class ont extends nfm implements nha {
    public static final ont c;
    private static volatile nhf d;
    public int a;
    public int b = -1;

    static {
        ont ontVar = new ont();
        c = ontVar;
        nfm.L(ont.class, ontVar);
    }

    private ont() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new ont();
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
                synchronized (ont.class) {
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
