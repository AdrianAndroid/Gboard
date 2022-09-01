package defpackage;

/* compiled from: PG */
/* renamed from: mdc  reason: default package */
/* loaded from: classes.dex */
public final class mdc extends nfm implements nha {
    public static final mdc e;
    private static volatile nhf f;
    public int a;
    public boolean c;
    public String b = "";
    public nga d = nhi.b;

    static {
        mdc mdcVar = new mdc();
        e = mdcVar;
        nfm.L(mdc.class, mdcVar);
    }

    private mdc() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0003ဇ\u0001\u0004\u001b", new Object[]{"a", "b", "c", "d", mda.class});
            }
            if (i2 == 3) {
                return new mdc();
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
                synchronized (mdc.class) {
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
