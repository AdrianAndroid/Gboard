package defpackage;

/* compiled from: PG */
/* renamed from: ghi  reason: default package */
/* loaded from: classes.dex */
public final class ghi extends nfm implements nha {
    public static final ghi g;
    private static volatile nhf h;
    public int a;
    public float c;
    public int d;
    public int e;
    public String b = "";
    public nfs f = nfn.b;

    static {
        ghi ghiVar = new ghi();
        g = ghiVar;
        nfm.L(ghi.class, ghiVar);
    }

    private ghi() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003င\u0002\u0004င\u0003\u0005\u0016", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new ghi();
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
                synchronized (ghi.class) {
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
