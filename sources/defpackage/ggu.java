package defpackage;

/* compiled from: PG */
/* renamed from: ggu  reason: default package */
/* loaded from: classes.dex */
public final class ggu extends nfm implements nha {
    public static final ggu k;
    private static volatile nhf l;
    public int a;
    public int b;
    public boolean c;
    public int e;
    public int f;
    public boolean h;
    public boolean i;
    public boolean j;
    public int d = -1;
    public int g = 1;

    static {
        ggu gguVar = new ggu();
        k = gguVar;
        nfm.L(ggu.class, gguVar);
    }

    private ggu() {
        nem nemVar = nem.b;
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(k, "\u0001\b\u0000\u0002\u0014Y\b\u0000\u0000\u0000\u0014ဇ\u0002)ဌ\u0006/ဌ\u000b2ဌ\r4ဌ\u000eAဇ\u0017Bဇ\u0018Yဇ#", new Object[]{"a", "b", "c", "d", ggq.h, "e", ggq.e, "f", ggq.f, "g", ggq.g, "h", "i", "j"});
            }
            if (i2 == 3) {
                return new ggu();
            }
            if (i2 == 4) {
                return new nfh(k);
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = l;
            if (nhfVar == null) {
                synchronized (ggu.class) {
                    nhfVar = l;
                    if (nhfVar == null) {
                        nhfVar = new nfi(k);
                        l = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
