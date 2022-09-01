package defpackage;

/* compiled from: PG */
/* renamed from: msn  reason: default package */
/* loaded from: classes2.dex */
public final class msn extends nfm implements nha {
    public static final msn b;
    private static volatile nhf d;
    public int a;
    private int c;

    static {
        msn msnVar = new msn();
        b = msnVar;
        nfm.L(msn.class, msnVar);
    }

    private msn() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", mgk.p});
            }
            if (i2 == 3) {
                return new msn();
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
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (msn.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
