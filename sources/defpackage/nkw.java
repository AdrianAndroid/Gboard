package defpackage;

/* compiled from: PG */
/* renamed from: nkw  reason: default package */
/* loaded from: classes2.dex */
public final class nkw extends nfm implements nha {
    public static final nkw f;
    private static volatile nhf g;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        nkw nkwVar = new nkw();
        f = nkwVar;
        nfm.L(nkw.class, nkwVar);
    }

    private nkw() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new nkw();
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
                synchronized (nkw.class) {
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
