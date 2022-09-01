package defpackage;

/* compiled from: PG */
/* renamed from: eux  reason: default package */
/* loaded from: classes.dex */
public final class eux extends nfm implements nha {
    public static final eux f;
    private static volatile nhf g;
    public int a;
    public eut c;
    public int e;
    public String b = "";
    public String d = "";

    static {
        eux euxVar = new eux();
        f = euxVar;
        nfm.L(eux.class, euxVar);
    }

    private eux() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", eup.c()});
            }
            if (i2 == 3) {
                return new eux();
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
                synchronized (eux.class) {
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
