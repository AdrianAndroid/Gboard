package defpackage;

/* compiled from: PG */
/* renamed from: nce  reason: default package */
/* loaded from: classes2.dex */
public final class nce extends nfm implements nha {
    public static final nce b;
    private static volatile nhf c;
    public nfs a = nfn.b;

    static {
        nce nceVar = new nce();
        b = nceVar;
        nfm.L(nce.class, nceVar);
    }

    private nce() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new nce();
            }
            if (i2 == 4) {
                return new nfh((short[]) null);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (nce.class) {
                    nhfVar = c;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        c = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
