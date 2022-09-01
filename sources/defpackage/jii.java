package defpackage;

/* compiled from: PG */
/* renamed from: jii  reason: default package */
/* loaded from: classes.dex */
public final class jii extends nfm implements nha {
    public static final jii g;
    private static volatile nhf h;
    public int a;
    public int c;
    public int e;
    public jid f;
    public String b = "";
    public String d = "";

    static {
        jii jiiVar = new jii();
        g = jiiVar;
        nfm.L(jii.class, jiiVar);
    }

    private jii() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0005ဌ\u0003\u0006ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", jih.a, "f"});
            }
            if (i2 == 3) {
                return new jii();
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
                synchronized (jii.class) {
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
