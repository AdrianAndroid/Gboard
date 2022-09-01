package defpackage;

/* compiled from: PG */
/* renamed from: gga  reason: default package */
/* loaded from: classes.dex */
public final class gga extends nfm implements nha {
    public static final gga d;
    private static volatile nhf f;
    public int a;
    public String b = "";
    public nga c = nhi.b;
    private int e;

    static {
        gga ggaVar = new gga();
        d = ggaVar;
        nfm.L(gga.class, ggaVar);
    }

    private gga() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဋ\u0000\u0003ဈ\u0002\u0004\u001a", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new gga();
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
                synchronized (gga.class) {
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
