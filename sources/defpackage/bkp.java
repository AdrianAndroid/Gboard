package defpackage;

/* compiled from: PG */
/* renamed from: bkp  reason: default package */
/* loaded from: classes.dex */
public final class bkp extends nfm implements nha {
    public static final bkp b;
    private static volatile nhf c;
    public boolean a;

    static {
        bkp bkpVar = new bkp();
        b = bkpVar;
        nfm.L(bkp.class, bkpVar);
    }

    private bkp() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new bkp();
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
                synchronized (bkp.class) {
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
