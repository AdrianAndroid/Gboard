package defpackage;

/* compiled from: PG */
/* renamed from: dam  reason: default package */
/* loaded from: classes.dex */
public final class dam extends nfm implements nha {
    public static final dam a;
    private static volatile nhf b;

    static {
        dam damVar = new dam();
        a = damVar;
        nfm.L(dam.class, damVar);
    }

    private dam() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dam();
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
                synchronized (dam.class) {
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
