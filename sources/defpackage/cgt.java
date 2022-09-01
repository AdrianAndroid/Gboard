package defpackage;

/* compiled from: PG */
/* renamed from: mbw  reason: default package */
/* loaded from: classes.dex */
public final class mbw extends nfm implements nha {
    public static final mbw k;
    private static volatile nhf l;
    public int a;
    public boolean e;
    public int f;
    public boolean g;
    public long j;
    public String b = "";
    public String c = "";
    public nga d = nhi.b;
    public String h = "";
    public nga i = nhi.b;

    static {
        mbw mbwVar = new mbw();
        k = mbwVar;
        nfm.L(mbw.class, mbwVar);
    }

    private mbw() {
        ngp ngpVar = ngp.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(k, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဇ\u0002\u0007ဌ\u0005\bဇ\u0006\tဈ\u0007\u000b\u001b\fဂ\b", new Object[]{"a", "b", "c", "d", "e", "f", mbm.g, "g", "h", "i", mcj.class, "j"});
            }
            if (i2 == 3) {
                return new mbw();
            }
            if (i2 == 4) {
                return new nfh(k);
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = l;
            if (nhfVar == null) {
                synchronized (mbw.class) {
                    nhfVar = l;
                    if (nhfVar == null) {
                        nhfVar = new nfi(k);
                        l = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
