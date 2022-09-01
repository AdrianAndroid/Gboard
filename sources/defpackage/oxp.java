package defpackage;

/* compiled from: PG */
/* renamed from: oxp  reason: default package */
/* loaded from: classes2.dex */
public final class oxp extends nfm implements nha {
    public static final oxp c;
    private static volatile nhf d;
    public int a = 0;
    public Object b;

    static {
        oxp oxpVar = new oxp();
        c = oxpVar;
        nfm.L(oxp.class, oxpVar);
    }

    private oxp() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", oxn.class, oxs.class, oxt.class});
            }
            if (i2 == 3) {
                return new oxp();
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
                synchronized (oxp.class) {
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
