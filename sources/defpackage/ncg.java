package defpackage;

/* compiled from: PG */
/* renamed from: ncg  reason: default package */
/* loaded from: classes2.dex */
public final class ncg extends nfm implements nha {
    public static final ncg c;
    private static volatile nhf d;
    public int a = 0;
    public Object b;

    static {
        ncg ncgVar = new ncg();
        c = ncgVar;
        nfm.L(ncg.class, ncgVar);
    }

    private ncg() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ံ\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
            }
            if (i2 == 3) {
                return new ncg();
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
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (ncg.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
