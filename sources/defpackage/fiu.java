package defpackage;

/* compiled from: PG */
/* renamed from: fiu  reason: default package */
/* loaded from: classes.dex */
public final class fiu extends nfm implements nha {
    public static final fiu b;
    private static volatile nhf c;
    public bko a;

    static {
        fiu fiuVar = new fiu();
        b = fiuVar;
        nfm.L(fiu.class, fiuVar);
    }

    private fiu() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new fiu();
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
                synchronized (fiu.class) {
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
