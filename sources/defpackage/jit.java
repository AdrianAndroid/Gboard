package defpackage;

/* compiled from: PG */
/* renamed from: jit  reason: default package */
/* loaded from: classes.dex */
public final class jit extends nfm implements nha {
    public static final jit g;
    private static volatile nhf h;
    public int a;
    public int c;
    public int e;
    public noi f;
    public String b = "";
    public String d = "";

    static {
        jit jitVar = new jit();
        g = jitVar;
        nfm.L(jit.class, jitVar);
    }

    private jit() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", jih.b, "f"});
            }
            if (i2 == 3) {
                return new jit();
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
                synchronized (jit.class) {
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
