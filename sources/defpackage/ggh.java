package defpackage;

/* compiled from: PG */
/* renamed from: ggh  reason: default package */
/* loaded from: classes.dex */
public final class ggh extends nfm implements nha {
    public static final ggh o;
    private static volatile nhf q;
    public int a;
    public int b;
    public long c;
    public ggl d;
    public ggt e;
    public ggu f;
    public ggd g;
    public gfy h;
    public ggr i;
    public ggy k;
    public ggv m;
    public gfz n;
    private byte p = 2;
    public nga j = nhi.b;
    public boolean l = true;

    static {
        ggh gghVar = new ggh();
        o = gghVar;
        nfm.L(ggh.class, gghVar);
    }

    private ggh() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(o, "\u0001\r\u0000\u0001\u0001\u0010\r\u0000\u0001\u0004\u0001ᔌ\u0000\u0002ဃ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\tဉ\b\f\u001b\rᐉ\n\u000eဇ\u000b\u000fᐉ\f\u0010ဉ\r", new Object[]{"a", "b", cgs.p, "c", "d", "e", "f", "g", "h", "i", "j", ggg.class, "k", "l", "m", "n"});
            }
            if (i2 == 3) {
                return new ggh();
            }
            if (i2 == 4) {
                return new nfh(o);
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            }
            nhf nhfVar = q;
            if (nhfVar == null) {
                synchronized (ggh.class) {
                    nhfVar = q;
                    if (nhfVar == null) {
                        nhfVar = new nfi(o);
                        q = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.p);
    }
}
