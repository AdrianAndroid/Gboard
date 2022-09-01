package defpackage;

/* compiled from: PG */
/* renamed from: cyd  reason: default package */
/* loaded from: classes.dex */
public final class cyd extends nfm implements nha {
    public static final cyd d;
    private static volatile nhf e;
    public nga a = nhi.b;
    public String b = "";
    public long c;

    static {
        cyd cydVar = new cyd();
        d = cydVar;
        nfm.L(cyd.class, cydVar);
    }

    private cyd() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003\u0002", new Object[]{"a", cyc.class, "b", "c"});
            }
            if (i2 == 3) {
                return new cyd();
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
                synchronized (cyd.class) {
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
