package defpackage;

/* compiled from: PG */
/* renamed from: nky  reason: default package */
/* loaded from: classes2.dex */
public final class nky extends nfm implements nha {
    public static final nky b;
    public static final ngt c;
    private static volatile nhf e;
    public boolean a;
    private int d;

    static {
        nky nkyVar = new nky();
        b = nkyVar;
        nfm.L(nky.class, nkyVar);
        c = nfm.P(nkt.c, nkyVar, nkyVar, 443278602, nik.MESSAGE);
    }

    private nky() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"d", "a"});
            }
            if (i2 == 3) {
                return new nky();
            }
            if (i2 == 4) {
                return new nfh(b);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (nky.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
