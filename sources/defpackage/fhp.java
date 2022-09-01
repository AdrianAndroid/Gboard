package defpackage;

/* compiled from: PG */
/* renamed from: fhp  reason: default package */
/* loaded from: classes.dex */
public final class fhp extends nfm implements nha {
    public static final fhp e;
    private static volatile nhf f;
    public int a;
    public int b;
    public boolean c;
    public boolean d;

    static {
        fhp fhpVar = new fhp();
        e = fhpVar;
        nfm.L(fhp.class, fhpVar);
    }

    private fhp() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0007\u0004\u0007", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new fhp();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (fhp.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
