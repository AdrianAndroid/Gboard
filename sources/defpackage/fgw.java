package defpackage;

/* compiled from: PG */
/* renamed from: fgw  reason: default package */
/* loaded from: classes.dex */
public final class fgw extends nfm implements nha {
    public static final fgw f;
    public static final nfw g = new nfw(fgt.UNRECOGNIZED);
    private static volatile nhf h;
    public int a;
    public int b;
    public boolean d;
    public ngu c = ngu.a;
    public String e = "";

    static {
        fgt fgtVar = fgt.UNKNOWN;
        fgw fgwVar = new fgw();
        f = fgwVar;
        nfm.L(fgw.class, fgwVar);
    }

    private fgw() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0001\u0000\u0000\u0001\f\u0002\f\u00032\u0005\u0007\u0006Ȉ", new Object[]{"a", "b", "c", fgv.a, "d", "e"});
            }
            if (i2 == 3) {
                return new fgw();
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
            nhf nhfVar = h;
            if (nhfVar == null) {
                synchronized (fgw.class) {
                    nhfVar = h;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        h = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
