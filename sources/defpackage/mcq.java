package defpackage;

/* compiled from: PG */
/* renamed from: mcq  reason: default package */
/* loaded from: classes.dex */
public final class mcq extends nfm implements nha {
    public static final mcq e;
    private static volatile nhf f;
    public int a;
    public int b;
    public int c;
    public nga d = nhi.b;

    static {
        mcq mcqVar = new mcq();
        e = mcqVar;
        nfm.L(mcq.class, mcqVar);
    }

    private mcq() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0003ဌ\u0002\u0004\u001b", new Object[]{"a", "b", mcp.c(), "c", mcn.c(), "d", mbw.class});
            }
            if (i2 == 3) {
                return new mcq();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (mcq.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
