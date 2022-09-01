package defpackage;

/* compiled from: PG */
/* renamed from: ifj  reason: default package */
/* loaded from: classes.dex */
public final class ifj extends nfm implements nha {
    public static final ifj g;
    private static volatile nhf i;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    private int h;

    static {
        ifj ifjVar = new ifj();
        g = ifjVar;
        nfm.L(ifj.class, ifjVar);
    }

    private ifj() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0004\u0005င\u0003\u0006င\u0005", new Object[]{"h", "a", "b", "c", "e", "d", "f"});
            }
            if (i3 == 3) {
                return new ifj();
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
                synchronized (ifj.class) {
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
