package defpackage;

/* compiled from: PG */
/* renamed from: mqu  reason: default package */
/* loaded from: classes2.dex */
public final class mqu extends nfm implements nha {
    public static final mqu g;
    private static volatile nhf i;
    public float a;
    public float b;
    public nga c;
    public nga d;
    public nga e;
    public nga f;
    private int h;

    static {
        mqu mquVar = new mqu();
        g = mquVar;
        nfm.L(mqu.class, mquVar);
    }

    private mqu() {
        nhi nhiVar = nhi.b;
        this.c = nhiVar;
        this.d = nhiVar;
        this.e = nhiVar;
        this.f = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(g, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0004\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b", new Object[]{"h", "a", "b", "c", mqt.class, "d", mqt.class, "e", mqt.class, "f", mqt.class});
            }
            if (i3 == 3) {
                return new mqu();
            }
            if (i3 == 4) {
                return new nfh(g);
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (mqu.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(g);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
