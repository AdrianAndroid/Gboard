package defpackage;

/* compiled from: PG */
/* renamed from: mve  reason: default package */
/* loaded from: classes2.dex */
public final class mve extends nfm implements nha {
    public static final mve g;
    private static volatile nhf h;
    public nga a;
    public nga b;
    public nga c;
    public nga d;
    public nga e;
    public nga f;

    static {
        mve mveVar = new mve();
        g = mveVar;
        nfm.L(mve.class, mveVar);
    }

    private mve() {
        nhi nhiVar = nhi.b;
        this.a = nhiVar;
        this.b = nhiVar;
        this.c = nhiVar;
        this.d = nhiVar;
        this.e = nhiVar;
        this.f = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0006\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b", new Object[]{"a", muy.class, "b", muw.class, "c", mva.class, "d", mvb.class, "e", mux.class, "f", muz.class});
            }
            if (i2 == 3) {
                return new mve();
            }
            if (i2 == 4) {
                return new nfh((char[]) null);
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = h;
            if (nhfVar == null) {
                synchronized (mve.class) {
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
