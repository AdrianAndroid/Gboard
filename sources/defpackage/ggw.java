package defpackage;

/* compiled from: PG */
/* renamed from: ggw  reason: default package */
/* loaded from: classes.dex */
public final class ggw extends nfm implements nha {
    public static final ggw b;
    private static volatile nhf f;
    public int a;
    private int c;
    private ggv d;
    private byte e = 2;

    static {
        ggw ggwVar = new ggw();
        b = ggwVar;
        nfm.L(ggw.class, ggwVar);
    }

    private ggw() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return K(b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔌ\u0000\u0002ᐉ\u0001", new Object[]{"c", "a", ggq.j, "d"});
            }
            if (i2 == 3) {
                return new ggw();
            }
            if (i2 == 4) {
                return new nfh(b);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (ggw.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.e);
    }
}
