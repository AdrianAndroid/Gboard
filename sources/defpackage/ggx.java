package defpackage;

/* compiled from: PG */
/* renamed from: ggx  reason: default package */
/* loaded from: classes.dex */
public final class ggx extends nfm implements nha {
    public static final ggx c;
    private static volatile nhf e;
    public long a;
    public String b = "";
    private int d;

    static {
        ggx ggxVar = new ggx();
        c = ggxVar;
        nfm.L(ggx.class, ggxVar);
    }

    private ggx() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0003ဈ\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new ggx();
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
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (ggx.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
