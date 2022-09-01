package defpackage;

/* compiled from: PG */
/* renamed from: gfy  reason: default package */
/* loaded from: classes.dex */
public final class gfy extends nfm implements nha {
    public static final gfy c;
    private static volatile nhf d;
    public int a;
    public int b;

    static {
        gfy gfyVar = new gfy();
        c = gfyVar;
        nfm.L(gfy.class, gfyVar);
    }

    private gfy() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", cgs.m});
            }
            if (i2 == 3) {
                return new gfy();
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
                synchronized (gfy.class) {
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
