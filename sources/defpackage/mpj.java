package defpackage;

/* compiled from: PG */
/* renamed from: mpj  reason: default package */
/* loaded from: classes2.dex */
public final class mpj extends nfm implements nha {
    public static final mpj a;
    private static volatile nhf d;
    private int b;
    private mpi c;

    static {
        mpj mpjVar = new mpj();
        a = mpjVar;
        nfm.L(mpj.class, mpjVar);
    }

    private mpj() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0003", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new mpj();
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
                synchronized (mpj.class) {
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
