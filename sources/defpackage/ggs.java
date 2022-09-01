package defpackage;

/* compiled from: PG */
/* renamed from: ggs  reason: default package */
/* loaded from: classes.dex */
public final class ggs extends nfm implements nha {
    public static final ggs e;
    private static volatile nhf h;
    public int a;
    public int d;
    private int f;
    private byte g = 2;
    public String b = "";
    public String c = "";

    static {
        ggs ggsVar = new ggs();
        e = ggsVar;
        nfm.L(ggs.class, ggsVar);
    }

    private ggs() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᔌ\u0000\u0002ᔈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"a", "f", ggq.c, "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ggs();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            nhf nhfVar = h;
            if (nhfVar == null) {
                synchronized (ggs.class) {
                    nhfVar = h;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        h = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.g);
    }
}
