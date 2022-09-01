package defpackage;

/* compiled from: PG */
/* renamed from: nlg  reason: default package */
/* loaded from: classes2.dex */
public final class nlg extends nfm implements nha {
    public static final nlg c;
    private static volatile nhf d;
    public int a = 0;
    public Object b;

    static {
        nlg nlgVar = new nlg();
        c = nlgVar;
        nfm.L(nlg.class, nlgVar);
    }

    private nlg() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0001\u0000\b\t\u0002\u0000\u0000\u0000\bျ\u0000\tဿ\u0000", new Object[]{"b", "a", nlc.e});
            }
            if (i2 == 3) {
                return new nlg();
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
                synchronized (nlg.class) {
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
