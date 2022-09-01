package defpackage;

/* compiled from: PG */
/* renamed from: nmg  reason: default package */
/* loaded from: classes2.dex */
public final class nmg extends nfm implements nha {
    public static final nmg a;
    private static volatile nhf c;
    private ngu b = ngu.a;

    static {
        nmg nmgVar = new nmg();
        a = nmgVar;
        nfm.L(nmg.class, nmgVar);
    }

    private nmg() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u00032", new Object[]{"b", nmf.a});
            }
            if (i2 == 3) {
                return new nmg();
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
                synchronized (nmg.class) {
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
