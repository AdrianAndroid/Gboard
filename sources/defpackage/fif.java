package defpackage;

/* compiled from: PG */
/* renamed from: fif  reason: default package */
/* loaded from: classes.dex */
public final class fif extends nfm implements nha {
    public static final fif b;
    private static volatile nhf c;
    public int a;

    static {
        fif fifVar = new fif();
        b = fifVar;
        nfm.L(fif.class, fifVar);
    }

    private fif() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\f", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new fif();
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
                synchronized (fif.class) {
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
