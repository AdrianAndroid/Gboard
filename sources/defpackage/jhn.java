package defpackage;

/* compiled from: PG */
/* renamed from: jhn  reason: default package */
/* loaded from: classes.dex */
public final class jhn extends nfm implements nha {
    public static final jhn g;
    private static volatile nhf h;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public int e;
    public ndy f;

    static {
        jhn jhnVar = new jhn();
        g = jhnVar;
        nfm.L(jhn.class, jhnVar);
    }

    private jhn() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new jhn();
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
                synchronized (jhn.class) {
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
