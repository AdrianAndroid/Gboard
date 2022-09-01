package defpackage;

/* compiled from: PG */
/* renamed from: cdz  reason: default package */
/* loaded from: classes.dex */
public final class cdz extends nfm implements nha {
    public static final cdz f;
    private static volatile nhf g;
    public int a;
    public int c;
    public boolean e;
    public String b = "";
    public nga d = nhi.b;

    static {
        cdz cdzVar = new cdz();
        f = cdzVar;
        nfm.L(cdz.class, cdzVar);
    }

    private cdz() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001a\u0004ဇ\u0002", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new cdz();
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
                synchronized (cdz.class) {
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
