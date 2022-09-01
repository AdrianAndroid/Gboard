package defpackage;

/* compiled from: PG */
/* renamed from: met  reason: default package */
/* loaded from: classes.dex */
public final class met extends nfm implements nha {
    public static final met f;
    private static volatile nhf g;
    public int a;
    public String b = "";
    public int c;
    public mai d;
    public int e;

    static {
        met metVar = new met();
        f = metVar;
        nfm.L(met.class, metVar);
    }

    private met() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0005ဌ\u0004", new Object[]{"a", "b", "c", mdw.l, "d", "e", mdw.k});
            }
            if (i2 == 3) {
                return new met();
            }
            if (i2 == 4) {
                return new nfh(f);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (met.class) {
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
