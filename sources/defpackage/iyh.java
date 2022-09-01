package defpackage;

/* compiled from: PG */
/* renamed from: iyh  reason: default package */
/* loaded from: classes.dex */
public final class iyh extends nfm implements nha {
    public static final iyh a;
    private static volatile nhf b;

    static {
        iyh iyhVar = new iyh();
        a = iyhVar;
        nfm.L(iyh.class, iyhVar);
    }

    private iyh() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new iyh();
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
                synchronized (iyh.class) {
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
}b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }
}
