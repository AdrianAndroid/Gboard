package defpackage;

/* compiled from: PG */
/* renamed from: mlp  reason: default package */
/* loaded from: classes.dex */
public final class mlp extends nfm implements nha {
    public static final mlp c;
    private static volatile nhf d;
    public int a;
    public String b = "";

    static {
        mlp mlpVar = new mlp();
        c = mlpVar;
        nfm.L(mlp.class, mlpVar);
    }

    private mlp() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new mlp();
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
                synchronized (mlp.class) {
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
