package defpackage;

/* compiled from: PG */
/* renamed from: nog  reason: default package */
/* loaded from: classes2.dex */
public final class nog extends nfm implements nha {
    public static final nog c;
    private static volatile nhf d;
    public int a = 0;
    public Object b;

    static {
        nog nogVar = new nog();
        c = nogVar;
        nfm.L(nog.class, nogVar);
    }

    private nog() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ျ\u0000", new Object[]{"b", "a"});
            }
            if (i2 == 3) {
                return new nog();
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
                synchronized (nog.class) {
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
