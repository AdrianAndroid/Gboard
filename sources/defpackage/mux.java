package defpackage;

/* compiled from: PG */
/* renamed from: mux  reason: default package */
/* loaded from: classes2.dex */
public final class mux extends nfm implements nha {
    public static final mux g;
    private static volatile nhf h;
    public int a;
    public int b;
    public mbh c;
    public long d;
    public long e;
    public long f;

    static {
        mux muxVar = new mux();
        g = muxVar;
        nfm.L(mux.class, muxVar);
    }

    private mux() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new mux();
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
                synchronized (mux.class) {
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
