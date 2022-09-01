package defpackage;

/* compiled from: PG */
/* renamed from: mgz  reason: default package */
/* loaded from: classes.dex */
public final class mgz extends nfm implements nha {
    public static final mgz j;
    private static volatile nhf k;
    public int a;
    public int b;
    public int d;
    public boolean f;
    public long g;
    public long h;
    public String c = "";
    public String e = "";
    public String i = "";

    static {
        mgz mgzVar = new mgz();
        j = mgzVar;
        nfm.L(mgz.class, mgzVar);
    }

    private mgz() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဂ\u0005\bဂ\u0007\tဈ\b", new Object[]{"a", "b", mgk.d, "c", "d", "e", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new mgz();
            }
            if (i2 == 4) {
                return new nfh(j);
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = k;
            if (nhfVar == null) {
                synchronized (mgz.class) {
                    nhfVar = k;
                    if (nhfVar == null) {
                        nhfVar = new nfi(j);
                        k = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
