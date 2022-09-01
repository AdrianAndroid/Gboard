package defpackage;

/* compiled from: PG */
/* renamed from: nmk  reason: default package */
/* loaded from: classes2.dex */
public final class nmk extends nfm implements nha {
    public static final nmk a;
    private static volatile nhf b;

    static {
        nmk nmkVar = new nmk();
        a = nmkVar;
        nfm.L(nmk.class, nmkVar);
    }

    private nmk() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new nmk();
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
                synchronized (nmk.class) {
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
