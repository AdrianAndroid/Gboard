package defpackage;

/* compiled from: PG */
/* renamed from: mpw  reason: default package */
/* loaded from: classes2.dex */
public final class mpw extends nfm implements nha {
    public static final mpw a;
    private static volatile nhf b;

    static {
        mpw mpwVar = new mpw();
        a = mpwVar;
        nfm.L(mpw.class, mpwVar);
    }

    private mpw() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new mpw();
            }
            if (i2 == 4) {
                return new nfh(a);
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = b;
            if (nhfVar == null) {
                synchronized (mpw.class) {
                    nhfVar = b;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        b = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
