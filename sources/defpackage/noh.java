package defpackage;

/* compiled from: PG */
/* renamed from: noh  reason: default package */
/* loaded from: classes2.dex */
public final class noh extends nfm implements nha {
    public static final noh c;
    private static volatile nhf d;
    public int a = 0;
    public Object b;

    static {
        noh nohVar = new noh();
        c = nohVar;
        nfm.L(noh.class, nohVar);
    }

    private noh() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"b", "a", noc.class, nof.class, nog.class, noj.class, noe.class});
            }
            if (i2 == 3) {
                return new noh();
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
                synchronized (noh.class) {
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
