package defpackage;

/* compiled from: PG */
/* renamed from: mca  reason: default package */
/* loaded from: classes.dex */
public final class mca extends nfm implements nha {
    public static final mca j;
    private static volatile nhf k;
    public int a;
    public int b;
    public int c;
    public boolean d;
    public String e = "";
    public int f;
    public int g;
    public boolean h;
    public int i;

    static {
        mca mcaVar = new mca();
        j = mcaVar;
        nfm.L(mca.class, mcaVar);
    }

    private mca() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဇ\u0006\bဌ\u0007", new Object[]{"a", "b", "c", mbm.q, "d", "e", "f", mbm.l, "g", mbm.k, "h", "i", mbm.m});
            }
            if (i2 == 3) {
                return new mca();
            }
            if (i2 == 4) {
                return new nfh(j);
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = k;
            if (nhfVar == null) {
                synchronized (mca.class) {
                    nhfVar = k;
                    if (nhfVar == null) {
                        nhfVar = new nfi(j);
                        k = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
