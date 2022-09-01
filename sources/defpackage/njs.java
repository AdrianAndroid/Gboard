package defpackage;

/* compiled from: PG */
/* renamed from: njs  reason: default package */
/* loaded from: classes2.dex */
public final class njs extends nfm implements nha {
    public static final njs g;
    private static volatile nhf i;
    public int a;
    public njr e;
    private int h;
    public String b = "";
    public String c = "";
    public String d = "";
    public nga f = nhi.b;

    static {
        njs njsVar = new njs();
        g = njsVar;
        nfm.L(njs.class, njsVar);
    }

    private njs() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(g, "\u0001\u0006\u0000\u0001\u0001\u0014\u0006\u0000\u0001\u0000\u0001င\u0000\u0007ဈ\u0004\bဈ\u0005\u000b\u001b\u0012ဉ\u0007\u0014ဈ\u0003", new Object[]{"h", "a", "c", "d", "f", njr.class, "e", "b"});
            }
            if (i3 == 3) {
                return new njs();
            }
            if (i3 == 4) {
                return new nfh(g);
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (njs.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(g);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
