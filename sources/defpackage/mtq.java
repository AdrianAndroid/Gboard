package defpackage;

/* compiled from: PG */
/* renamed from: mtq  reason: default package */
/* loaded from: classes2.dex */
public final class mtq extends nfm implements nha {
    public static final mtq e;
    private static volatile nhf g;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    private int f;

    static {
        mtq mtqVar = new mtq();
        e = mtqVar;
        nfm.L(mtq.class, mtqVar);
    }

    private mtq() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new mtq();
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
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (mtq.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
