package defpackage;

/* compiled from: PG */
/* renamed from: mtg  reason: default package */
/* loaded from: classes2.dex */
public final class mtg extends nfm implements nha {
    public static final mtg f;
    private static volatile nhf g;
    public int a;
    public boolean c;
    public mth d;
    public String b = "";
    public nga e = nhi.b;

    static {
        mtg mtgVar = new mtg();
        f = mtgVar;
        nfm.L(mtg.class, mtgVar);
    }

    private mtg() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0005\u001b\u0006ဉ\u0002", new Object[]{"a", "b", "c", "e", mth.class, "d"});
            }
            if (i2 == 3) {
                return new mtg();
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
                synchronized (mtg.class) {
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
