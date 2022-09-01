package defpackage;

/* compiled from: PG */
/* renamed from: omy  reason: default package */
/* loaded from: classes2.dex */
public final class omy extends nfm implements nha {
    public static final omy j;
    private static volatile nhf k;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    public long h;
    public boolean i;

    static {
        omy omyVar = new omy();
        j = omyVar;
        nfm.L(omy.class, omyVar);
    }

    private omy() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဇ\u0007", new Object[]{"a", "b", "c", nlc.t, "d", "e", nlc.s, "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new omy();
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
                synchronized (omy.class) {
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
