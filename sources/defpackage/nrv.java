package defpackage;

/* compiled from: PG */
/* renamed from: nrv  reason: default package */
/* loaded from: classes2.dex */
public final class nrv extends nfm implements nha {
    public static final nrv a;
    private static volatile nhf b;

    static {
        nrv nrvVar = new nrv();
        a = nrvVar;
        nfm.L(nrv.class, nrvVar);
    }

    private nrv() {
        nem nemVar = nem.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new nrv();
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
                synchronized (nrv.class) {
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
