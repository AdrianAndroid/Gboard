package defpackage;

/* compiled from: PG */
/* renamed from: bkx  reason: default package */
/* loaded from: classes.dex */
public final class bkx extends nfm implements nha {
    public static final bkx a;
    private static volatile nhf c;
    private ngu b = ngu.a;

    static {
        bkx bkxVar = new bkx();
        a = bkxVar;
        nfm.L(bkx.class, bkxVar);
    }

    private bkx() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0001\u0000\u0000\u0005\u0005\u0001\u0001\u0000\u0000\u00052", new Object[]{"b", bkw.a});
            }
            if (i2 == 3) {
                return new bkx();
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
                synchronized (bkx.class) {
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
