package defpackage;

/* compiled from: PG */
/* renamed from: gft  reason: default package */
/* loaded from: classes.dex */
public final class gft extends nfm implements nha {
    public static final gft c;
    private static volatile nhf d;
    public int a;
    public String b = "";

    static {
        gft gftVar = new gft();
        c = gftVar;
        nfm.L(gft.class, gftVar);
    }

    private gft() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0002", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new gft();
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
                synchronized (gft.class) {
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
