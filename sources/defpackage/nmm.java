package defpackage;

/* compiled from: PG */
/* renamed from: nmm  reason: default package */
/* loaded from: classes2.dex */
public final class nmm extends nfm implements nha {
    public static final nmm h;
    private static volatile nhf i;
    public int a;
    public int b = 0;
    public Object c;
    public int d;
    public int e;
    public nle f;
    public boolean g;

    static {
        nmm nmmVar = new nmm();
        h = nmmVar;
        nfm.L(nmm.class, nmmVar);
    }

    private nmm() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ျ\u0000\u0004ဉ\u0004\u0005ွ\u0000\u0006ဇ\u0005", new Object[]{"c", "b", "a", "d", nlc.j, "e", nlc.k, "f", "g"});
            }
            if (i3 == 3) {
                return new nmm();
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
                synchronized (nmm.class) {
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
