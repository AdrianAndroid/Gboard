package defpackage;

/* compiled from: PG */
/* renamed from: nlt  reason: default package */
/* loaded from: classes2.dex */
public final class nlt extends nfm implements nha {
    public static final nlt a;
    private static volatile nhf d;
    private int b;
    private nmc c;

    static {
        nlt nltVar = new nlt();
        a = nltVar;
        nfm.L(nlt.class, nltVar);
    }

    private nlt() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new nlt();
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
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (nlt.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
