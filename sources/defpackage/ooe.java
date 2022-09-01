package defpackage;

/* compiled from: PG */
/* renamed from: ooe  reason: default package */
/* loaded from: classes2.dex */
public final class ooe extends nfm implements nha {
    public static final ooe g;
    private static volatile nhf h;
    public int a;
    public int d;
    public long e;
    public String b = "";
    public String c = "";
    public String f = "";

    static {
        ooe ooeVar = new ooe();
        g = ooeVar;
        nfm.L(ooe.class, ooeVar);
    }

    private ooe() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", ons.g, "e", "f"});
            }
            if (i2 == 3) {
                return new ooe();
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
                synchronized (ooe.class) {
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
