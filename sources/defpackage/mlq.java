package defpackage;

/* compiled from: PG */
/* renamed from: mlq  reason: default package */
/* loaded from: classes.dex */
public final class mlq extends nfm implements nha {
    public static final mlq c;
    private static volatile nhf d;
    public mlp a;
    public mlr b;

    static {
        mlq mlqVar = new mlq();
        c = mlqVar;
        nfm.L(mlq.class, mlqVar);
    }

    private mlq() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\t\u0003\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new mlq();
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
                synchronized (mlq.class) {
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
