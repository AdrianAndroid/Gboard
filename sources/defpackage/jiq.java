package defpackage;

/* compiled from: PG */
/* renamed from: jiq  reason: default package */
/* loaded from: classes.dex */
public final class jiq extends nfm implements nha {
    public static final jiq f;
    private static volatile nhf g;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public boolean e;

    static {
        jiq jiqVar = new jiq();
        f = jiqVar;
        nfm.L(jiq.class, jiqVar);
    }

    private jiq() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဇ\u0003\u0005ဈ\u0002", new Object[]{"a", "b", "c", "e", "d"});
            }
            if (i2 == 3) {
                return new jiq();
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
                synchronized (jiq.class) {
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
