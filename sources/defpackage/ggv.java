package defpackage;

/* compiled from: PG */
/* renamed from: ggv  reason: default package */
/* loaded from: classes.dex */
public final class ggv extends nfm implements nha {
    public static final ggv e;
    private static volatile nhf g;
    public int a;
    public int b;
    private byte f = 2;
    public String c = "";
    public String d = "";

    static {
        ggv ggvVar = new ggv();
        e = ggvVar;
        nfm.L(ggv.class, ggvVar);
    }

    private ggv() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᔌ\u0000\u0002ᔈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", ggq.i, "c", "d"});
            }
            if (i2 == 3) {
                return new ggv();
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
                this.f = b;
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (ggv.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.f);
    }
}
