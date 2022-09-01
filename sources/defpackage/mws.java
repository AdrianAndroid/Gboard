package defpackage;

/* compiled from: PG */
/* renamed from: mws  reason: default package */
/* loaded from: classes2.dex */
public final class mws extends nfm implements nha {
    public static final mws a;
    private static volatile nhf c;
    private ngu b = ngu.a;

    static {
        mws mwsVar = new mws();
        a = mwsVar;
        nfm.L(mws.class, mwsVar);
    }

    private mws() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u00032", new Object[]{"b", mwr.a});
            }
            if (i2 == 3) {
                return new mws();
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
                synchronized (mws.class) {
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
