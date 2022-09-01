package defpackage;

/* compiled from: PG */
/* renamed from: fil  reason: default package */
/* loaded from: classes.dex */
public final class fil extends nfm implements nha {
    public static final fil b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        fil filVar = new fil();
        b = filVar;
        nfm.L(fil.class, filVar);
    }

    private fil() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", fin.class});
            }
            if (i2 == 3) {
                return new fil();
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
                synchronized (fil.class) {
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
