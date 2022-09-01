package defpackage;

/* compiled from: PG */
/* renamed from: chm  reason: default package */
/* loaded from: classes.dex */
public final class chm extends nfm implements nha {
    public static final chm b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        chm chmVar = new chm();
        b = chmVar;
        nfm.L(chm.class, chmVar);
    }

    private chm() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", chl.class});
            }
            if (i2 == 3) {
                return new chm();
            }
            if (i2 == 4) {
                return new nfh(b);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (chm.class) {
                    nhfVar = c;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        c = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
