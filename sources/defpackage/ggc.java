package defpackage;

/* compiled from: PG */
/* renamed from: ggc  reason: default package */
/* loaded from: classes.dex */
public final class ggc extends nfm implements nha {
    public static final ggc d;
    private static volatile nhf f;
    public int a;
    public ggh b;
    public ggn c;
    private byte e = 2;

    static {
        ggc ggcVar = new ggc();
        d = ggcVar;
        nfm.L(ggc.class, ggcVar);
    }

    private ggc() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔉ\u0000\u0002ᔉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ggc();
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
                this.e = b;
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (ggc.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.e);
    }
}
