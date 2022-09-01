package defpackage;

/* compiled from: PG */
/* renamed from: maj  reason: default package */
/* loaded from: classes.dex */
public final class maj extends nfm implements nha {
    public static final maj h;
    private static volatile nhf i;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        maj majVar = new maj();
        h = majVar;
        nfm.L(maj.class, majVar);
    }

    private maj() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new maj();
            }
            if (i3 == 4) {
                return new nfh(h);
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (maj.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(h);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
