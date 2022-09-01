package defpackage;

/* compiled from: PG */
/* renamed from: mvb  reason: default package */
/* loaded from: classes2.dex */
public final class mvb extends nfm implements nha {
    public static final mvb c;
    private static volatile nhf e;
    public long a;
    public String b = "";
    private int d;

    static {
        mvb mvbVar = new mvb();
        c = mvbVar;
        nfm.L(mvb.class, mvbVar);
    }

    private mvb() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဂ\u0001\u0003ဈ\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new mvb();
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
                synchronized (mvb.class) {
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
