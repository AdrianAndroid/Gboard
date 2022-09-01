package defpackage;

/* compiled from: PG */
/* renamed from: ldq  reason: default package */
/* loaded from: classes.dex */
public final class ldq extends nfm implements nha {
    public static final ldq f;
    private static volatile nhf g;
    public int a;
    public nem b = nem.b;
    public nem c = nem.b;
    public ldp d;
    public ldn e;

    static {
        ldq ldqVar = new ldq();
        f = ldqVar;
        nfm.L(ldq.class, ldqVar);
    }

    private ldq() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new ldq();
            }
            if (i2 == 4) {
                return new nfh(f);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (ldq.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
