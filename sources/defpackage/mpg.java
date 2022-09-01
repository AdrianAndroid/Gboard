package defpackage;

/* compiled from: PG */
/* renamed from: mpg  reason: default package */
/* loaded from: classes2.dex */
public final class mpg extends nfm implements nha {
    public static final mpg e;
    private static volatile nhf f;
    public int a;
    public nga b = nhi.b;
    public String c = "";
    public String d = "";

    static {
        mpg mpgVar = new mpg();
        e = mpgVar;
        nfm.L(mpg.class, mpgVar);
    }

    private mpg() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", mpf.class, "c", "d"});
            }
            if (i2 == 3) {
                return new mpg();
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
                synchronized (mpg.class) {
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
