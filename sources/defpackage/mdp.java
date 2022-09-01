package defpackage;

/* compiled from: PG */
/* renamed from: mdp  reason: default package */
/* loaded from: classes.dex */
public final class mdp extends nfm implements nha {
    public static final mdp c;
    private static volatile nhf d;
    public int a;
    public int b;

    static {
        mdp mdpVar = new mdp();
        c = mdpVar;
        nfm.L(mdp.class, mdpVar);
    }

    private mdp() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", mco.r});
            }
            if (i2 == 3) {
                return new mdp();
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
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (mdp.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
