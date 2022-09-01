package defpackage;

/* compiled from: PG */
/* renamed from: fhm  reason: default package */
/* loaded from: classes.dex */
public final class fhm extends nfm implements nha {
    public static final fhm c;
    private static volatile nhf d;
    public bkl a;
    public boolean b;

    static {
        fhm fhmVar = new fhm();
        c = fhmVar;
        nfm.L(fhm.class, fhmVar);
    }

    private fhm() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0007", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new fhm();
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
                synchronized (fhm.class) {
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
