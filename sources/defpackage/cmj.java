package defpackage;

/* compiled from: PG */
/* renamed from: cmj  reason: default package */
/* loaded from: classes.dex */
public final class cmj extends nfm implements nha {
    public static final cmj c;
    private static volatile nhf d;
    public int a;
    public int b;

    static {
        cmj cmjVar = new cmj();
        c = cmjVar;
        nfm.L(cmj.class, cmjVar);
    }

    private cmj() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new cmj();
            }
            if (i2 == 4) {
                return new nfh(c);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (cmj.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
