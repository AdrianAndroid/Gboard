package defpackage;

/* compiled from: PG */
/* renamed from: mae  reason: default package */
/* loaded from: classes.dex */
public final class mae extends nfm implements nha {
    public static final mae d;
    private static volatile nhf e;
    public int a;
    public int b;
    public int c;

    static {
        mae maeVar = new mae();
        d = maeVar;
        nfm.L(mae.class, maeVar);
    }

    private mae() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\n\u0002\u0000\u0000\u0000\u0001င\u0000\nင\t", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new mae();
            }
            if (i2 == 4) {
                return new nfh(d);
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (mae.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
