package defpackage;

/* compiled from: PG */
/* renamed from: cyc  reason: default package */
/* loaded from: classes.dex */
public final class cyc extends nfm implements nha {
    public static final cyc d;
    private static volatile nhf e;
    public String a = "";
    public String b = "";
    public String c = "";

    static {
        cyc cycVar = new cyc();
        d = cycVar;
        nfm.L(cyc.class, cycVar);
    }

    private cyc() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new cyc();
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
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (cyc.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
