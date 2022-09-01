package defpackage;

/* compiled from: PG */
/* renamed from: meg  reason: default package */
/* loaded from: classes.dex */
public final class meg extends nfm implements nha {
    public static final meg f;
    private static volatile nhf g;
    public int a;
    public int c;
    public long e;
    public String b = "";
    public String d = "";

    static {
        meg megVar = new meg();
        f = megVar;
        nfm.L(meg.class, megVar);
    }

    private meg() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new meg();
            }
            if (i2 == 4) {
                return new nfh(f);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (meg.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
