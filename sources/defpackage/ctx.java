package defpackage;

/* compiled from: PG */
/* renamed from: ctx  reason: default package */
/* loaded from: classes.dex */
public final class ctx extends nfm implements nha {
    public static final ctx d;
    private static volatile nhf f;
    public String a = "";
    public String b = "";
    public float c;
    private int e;

    static {
        ctx ctxVar = new ctx();
        d = ctxVar;
        nfm.L(ctx.class, ctxVar);
    }

    private ctx() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ခ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new ctx();
            }
            if (i2 == 4) {
                return new nfh(d);
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (ctx.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
