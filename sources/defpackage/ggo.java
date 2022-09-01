package defpackage;

/* compiled from: PG */
/* renamed from: ggo  reason: default package */
/* loaded from: classes.dex */
public final class ggo extends nfm implements nha {
    public static final ggo c;
    private static volatile nhf g;
    public int a;
    private int d;
    private int e;
    private byte f = 2;
    public String b = "";

    static {
        ggo ggoVar = new ggo();
        c = ggoVar;
        nfm.L(ggo.class, ggoVar);
    }

    private ggo() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(c, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0003\u0003ᔌ\u0000\u0004ᔈ\u0001\u0005ᔋ\u0002", new Object[]{"d", "a", cgs.s, "b", "e"});
            }
            if (i2 == 3) {
                return new ggo();
            }
            if (i2 == 4) {
                return new nfh(c);
            }
            if (i2 == 5) {
                return c;
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
                synchronized (ggo.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.f);
    }
}
