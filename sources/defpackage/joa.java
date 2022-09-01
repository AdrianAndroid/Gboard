package defpackage;

/* compiled from: PG */
/* renamed from: joa  reason: default package */
/* loaded from: classes.dex */
public final class joa extends nfm implements nha {
    public static final joa f;
    private static volatile nhf g;
    public jod d;
    public String a = "";
    public String b = "";
    public String c = "";
    public String e = "";

    static {
        joa joaVar = new joa();
        f = joaVar;
        nfm.L(joa.class, joaVar);
    }

    private joa() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004Ȉ\u0005\t\u0006Ȉ", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new joa();
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
                synchronized (joa.class) {
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
