package defpackage;

/* compiled from: PG */
/* renamed from: ncs  reason: default package */
/* loaded from: classes2.dex */
public final class ncs extends nfm implements nha {
    public static final ncs b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        ncs ncsVar = new ncs();
        b = ncsVar;
        nfm.L(ncs.class, ncsVar);
    }

    private ncs() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", ncz.class});
            }
            if (i2 == 3) {
                return new ncs();
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
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (ncs.class) {
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
