package defpackage;

/* compiled from: PG */
/* renamed from: mai  reason: default package */
/* loaded from: classes.dex */
public final class mai extends nfm implements nha {
    public static final mai d;
    private static volatile nhf e;
    public int a;
    public String b = "";
    public int c;

    static {
        mai maiVar = new mai();
        d = maiVar;
        nfm.L(mai.class, maiVar);
    }

    private mai() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", jih.l});
            }
            if (i2 == 3) {
                return new mai();
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
                synchronized (mai.class) {
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
