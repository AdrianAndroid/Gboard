package defpackage;

/* compiled from: PG */
/* renamed from: euz  reason: default package */
/* loaded from: classes.dex */
public final class euz extends nfm implements nha {
    public static final euz d;
    private static volatile nhf f;
    public String a = "";
    public String b = "";
    public String c = "";
    private int e;

    static {
        euz euzVar = new euz();
        d = euzVar;
        nfm.L(euz.class, euzVar);
    }

    private euz() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new euz();
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
                synchronized (euz.class) {
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
