package defpackage;

/* compiled from: PG */
/* renamed from: nlb  reason: default package */
/* loaded from: classes2.dex */
public final class nlb extends nfm implements nha {
    public static final nlb c;
    public static final ngt d;
    private static volatile nhf e;
    public int a;
    public int b;

    static {
        nlb nlbVar = new nlb();
        c = nlbVar;
        nfm.L(nlb.class, nlbVar);
        d = nfm.P(nkr.a, nlbVar, nlbVar, 112997213, nik.MESSAGE);
    }

    private nlb() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", nlc.b});
            }
            if (i2 == 3) {
                return new nlb();
            }
            if (i2 == 4) {
                return new nfh(c);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (nlb.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
