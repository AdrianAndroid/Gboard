package defpackage;

/* compiled from: PG */
/* renamed from: fgu  reason: default package */
/* loaded from: classes.dex */
public final class fgu extends nfm implements nha {
    public static final fgu e;
    private static volatile nhf g;
    public int a;
    public int b;
    public boolean c;
    public String d = "";
    private int f;

    static {
        fgu fguVar = new fgu();
        e = fguVar;
        nfm.L(fgu.class, fguVar);
    }

    private fgu() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002ဌ\u0000\u0003\u0007\u0004Ȉ", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new fgu();
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
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (fgu.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
