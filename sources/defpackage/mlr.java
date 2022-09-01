package defpackage;

/* compiled from: PG */
/* renamed from: mlr  reason: default package */
/* loaded from: classes.dex */
public final class mlr extends nfm implements nha {
    public static final mlr e;
    private static volatile nhf f;
    public int a;
    public String b = "";
    public String c = "";
    public int d;

    static {
        mlr mlrVar = new mlr();
        e = mlrVar;
        nfm.L(mlr.class, mlrVar);
    }

    private mlr() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0004\f\u0005Ȉ", new Object[]{"a", "b", "d", "c"});
            }
            if (i2 == 3) {
                return new mlr();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (mlr.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
