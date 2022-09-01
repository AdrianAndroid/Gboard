package defpackage;

/* compiled from: PG */
/* renamed from: mal  reason: default package */
/* loaded from: classes.dex */
public final class mal extends nfm implements nha {
    public static final mal h;
    private static volatile nhf i;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        mal malVar = new mal();
        h = malVar;
        nfm.L(mal.class, malVar);
    }

    private mal() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                nfq nfqVar = jih.m;
                return K(h, "\u0001\u0006\u0000\u0001\u0004\n\u0006\u0000\u0000\u0000\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\tဌ\b\nဌ\t", new Object[]{"a", "b", nfqVar, "c", nfqVar, "d", nfqVar, "e", nfqVar, "f", nfqVar, "g", nfqVar});
            } else if (i3 == 3) {
                return new mal();
            } else {
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
                    synchronized (mal.class) {
                        nhfVar = i;
                        if (nhfVar == null) {
                            nhfVar = new nfi(h);
                            i = nhfVar;
                        }
                    }
                }
                return nhfVar;
            }
        }
        return (byte) 1;
    }
}
