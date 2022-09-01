package defpackage;

/* compiled from: PG */
/* renamed from: izi  reason: default package */
/* loaded from: classes.dex */
public final class izi extends nfm implements nha {
    public static final izi a;
    private static volatile nhf c;
    private ngu b = ngu.a;

    static {
        izi iziVar = new izi();
        a = iziVar;
        nfm.L(izi.class, iziVar);
    }

    private izi() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", izh.a});
            }
            if (i2 == 3) {
                return new izi();
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
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (izi.class) {
                    nhfVar = c;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        c = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
