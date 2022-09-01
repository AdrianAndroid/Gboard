package defpackage;

/* compiled from: PG */
/* renamed from: euy  reason: default package */
/* loaded from: classes.dex */
public final class euy extends nfm implements nha {
    public static final euy d;
    private static volatile nhf f;
    public String a = "";
    public String b = "";
    public nga c = nhi.b;
    private int e;

    static {
        euy euyVar = new euy();
        d = euyVar;
        nfm.L(euy.class, euyVar);
    }

    private euy() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"e", "a", "b", "c", euz.class});
            }
            if (i2 == 3) {
                return new euy();
            }
            if (i2 == 4) {
                return new nfh(d);
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (euy.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
