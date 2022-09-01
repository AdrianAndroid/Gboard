package defpackage;

/* compiled from: PG */
/* renamed from: nli  reason: default package */
/* loaded from: classes2.dex */
public final class nli extends nfm implements nha {
    public static final nli c;
    private static volatile nhf d;
    public int a = 0;
    public Object b;

    static {
        nli nliVar = new nli();
        c = nliVar;
        nfm.L(nli.class, nliVar);
    }

    private nli() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ျ\u0000", new Object[]{"b", "a", nlc.e});
            }
            if (i2 == 3) {
                return new nli();
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
                synchronized (nli.class) {
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
