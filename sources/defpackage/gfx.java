package defpackage;

/* compiled from: PG */
/* renamed from: gfx  reason: default package */
/* loaded from: classes.dex */
public final class gfx extends nfm implements nha {
    public static final gfx a;
    private static volatile nhf g;
    private int b;
    private int c;
    private int d;
    private gfx e;
    private byte f = 2;

    static {
        gfx gfxVar = new gfx();
        a = gfxVar;
        nfm.L(gfx.class, gfxVar);
    }

    private gfx() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(a, "\u0001\u0003\u0000\u0001\u0002\b\u0003\u0000\u0000\u0003\u0002ᔋ\u0001\u0006ᔋ\u0002\bᐉ\u0003", new Object[]{"b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new gfx();
            }
            if (i2 == 4) {
                return new nfh(a);
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (gfx.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.f);
    }
}
