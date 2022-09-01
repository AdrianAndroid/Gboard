package defpackage;

/* compiled from: PG */
/* renamed from: fin  reason: default package */
/* loaded from: classes.dex */
public final class fin extends nfm implements nha {
    public static final fin e;
    private static volatile nhf f;
    public String a = "";
    public double b;
    public int c;
    public fim d;

    static {
        fin finVar = new fin();
        e = finVar;
        nfm.L(fin.class, finVar);
    }

    private fin() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0000\u0003\f\u0004\t", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new fin();
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
                synchronized (fin.class) {
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
