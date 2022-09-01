package defpackage;

/* compiled from: PG */
/* renamed from: eeu  reason: default package */
/* loaded from: classes.dex */
public final class eeu extends nfm implements nha {
    public static final eeu g;
    private static volatile nhf h;
    public int a;
    public long b;
    public oxo c;
    public long d;
    public String e = "";
    public int f;

    static {
        eeu eeuVar = new eeu();
        g = eeuVar;
        nfm.L(eeu.class, eeuVar);
    }

    private eeu() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0007င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new eeu();
            }
            if (i2 == 4) {
                return new nfh(g);
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = h;
            if (nhfVar == null) {
                synchronized (eeu.class) {
                    nhfVar = h;
                    if (nhfVar == null) {
                        nhfVar = new nfi(g);
                        h = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
