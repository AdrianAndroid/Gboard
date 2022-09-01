package defpackage;

/* compiled from: PG */
/* renamed from: ggp  reason: default package */
/* loaded from: classes.dex */
public final class ggp extends nfm implements nha {
    public static final ggp d;
    private static volatile nhf g;
    public int a;
    public boolean c;
    private int e;
    private byte f = 2;
    public nga b = nhi.b;

    static {
        ggp ggpVar = new ggp();
        d = ggpVar;
        nfm.L(ggp.class, ggpVar);
    }

    private ggp() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001ᔋ\u0000\u0002б\u0004ဇ\u0002", new Object[]{"e", "a", "b", ggo.class, "c"});
            }
            if (i2 == 3) {
                return new ggp();
            }
            if (i2 == 4) {
                return new nfh(d);
            }
            if (i2 == 5) {
                return d;
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
                synchronized (ggp.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.f);
    }
}
