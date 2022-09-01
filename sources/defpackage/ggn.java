package defpackage;

/* compiled from: PG */
/* renamed from: ggn  reason: default package */
/* loaded from: classes.dex */
public final class ggn extends nfm implements nha {
    public static final ggn k;
    private static volatile nhf o;
    public int a;
    public long b;
    public boolean c;
    public ggs d;
    public ggp e;
    public gfv f;
    public ggf g;
    public gha h;
    public ggw i;
    public ggb j;
    private gfx l;
    private ggm m;
    private byte n = 2;

    static {
        ggn ggnVar = new ggn();
        k = ggnVar;
        nfm.L(ggn.class, ggnVar);
    }

    private ggn() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(k, "\u0001\u000b\u0000\u0001\u0001\u0018\u000b\u0000\u0000\u0006\u0001ဃ\u0000\u0003ဇ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u000eဉ\f\u0010ဉ\r\u0012ᐉ\u000f\u0015ᐉ\u0011\u0016ᐉ\u0012\u0018ဉ\u0014", new Object[]{"a", "b", "c", "d", "e", "l", "f", "g", "m", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new ggn();
            }
            if (i2 == 4) {
                return new nfh(k);
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            }
            nhf nhfVar = o;
            if (nhfVar == null) {
                synchronized (ggn.class) {
                    nhfVar = o;
                    if (nhfVar == null) {
                        nhfVar = new nfi(k);
                        o = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.n);
    }
}
