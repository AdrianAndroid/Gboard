package defpackage;

/* compiled from: PG */
/* renamed from: onh  reason: default package */
/* loaded from: classes2.dex */
public final class onh extends nfm implements nha {
    public static final onh a;
    private static volatile nhf b;

    static {
        onh onhVar = new onh();
        a = onhVar;
        nfm.L(onh.class, onhVar);
    }

    private onh() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new onh();
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
                synchronized (onh.class) {
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
