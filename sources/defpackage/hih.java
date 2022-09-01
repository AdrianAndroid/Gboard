package defpackage;

/* compiled from: PG */
/* renamed from: hih  reason: default package */
/* loaded from: classes.dex */
public final class hih extends nfm implements nha {
    public static final hih c;
    private static volatile nhf d;
    public int a = 0;
    public Object b;

    static {
        hih hihVar = new hih();
        c = hihVar;
        nfm.L(hih.class, hihVar);
    }

    private hih() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001်\u0000\u0002း\u0000\u0003ဳ\u0000\u0004ျ\u0000\u0005ွ\u0000", new Object[]{"b", "a"});
            }
            if (i2 == 3) {
                return new hih();
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
                synchronized (hih.class) {
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
