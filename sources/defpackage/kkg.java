package defpackage;

/* compiled from: PG */
/* renamed from: kkg  reason: default package */
/* loaded from: classes.dex */
public final class kkg extends nfm implements nha {
    public static final kkg b;
    private static volatile nhf c;
    public ngu a = ngu.a;

    static {
        kkg kkgVar = new kkg();
        b = kkgVar;
        nfm.L(kkg.class, kkgVar);
    }

    private kkg() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"a", kkf.a});
            }
            if (i2 == 3) {
                return new kkg();
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
                synchronized (kkg.class) {
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
