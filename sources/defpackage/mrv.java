package defpackage;

/* compiled from: PG */
/* renamed from: mrv  reason: default package */
/* loaded from: classes2.dex */
public final class mrv extends nfm implements nha {
    public static final mrv c;
    private static volatile nhf e;
    public boolean a;
    public nga b = nhi.b;
    private int d;

    static {
        mrv mrvVar = new mrv();
        c = mrvVar;
        nfm.L(mrv.class, mrvVar);
    }

    private mrv() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001a", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new mrv();
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
                synchronized (mrv.class) {
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
