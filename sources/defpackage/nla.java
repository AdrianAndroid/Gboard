package defpackage;

/* compiled from: PG */
/* renamed from: nla  reason: default package */
/* loaded from: classes2.dex */
public final class nla extends nfm implements nha {
    public static final nla a;
    public static final ngt b;
    private static volatile nhf c;

    static {
        nla nlaVar = new nla();
        a = nlaVar;
        nfm.L(nla.class, nlaVar);
        b = nfm.P(nkt.c, nlaVar, nlaVar, 29737259, nik.MESSAGE);
    }

    private nla() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new nla();
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
                synchronized (nla.class) {
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
