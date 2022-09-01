package defpackage;

/* compiled from: PG */
/* renamed from: msm  reason: default package */
/* loaded from: classes2.dex */
public final class msm extends nfm implements nha {
    public static final msm c;
    private static volatile nhf d;
    public int a;
    public long b;

    static {
        msm msmVar = new msm();
        c = msmVar;
        nfm.L(msm.class, msmVar);
    }

    private msm() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဂ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new msm();
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
                synchronized (msm.class) {
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
