package defpackage;

/* compiled from: PG */
/* renamed from: kaf  reason: default package */
/* loaded from: classes.dex */
public final class kaf extends nfm implements nha {
    public static final kaf a;
    private static volatile nhf b;

    static {
        kaf kafVar = new kaf();
        a = kafVar;
        nfm.L(kaf.class, kafVar);
    }

    private kaf() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new kaf();
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
                synchronized (kaf.class) {
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
