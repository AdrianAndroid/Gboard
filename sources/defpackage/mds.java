package defpackage;

/* compiled from: PG */
/* renamed from: mds  reason: default package */
/* loaded from: classes.dex */
public final class mds extends nfm implements nha {
    public static final mds k;
    private static volatile nhf l;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    static {
        mds mdsVar = new mds();
        k = mdsVar;
        nfm.L(mds.class, mdsVar);
    }

    private mds() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b", new Object[]{"a", "b", mdr.c(), "c", mdq.c(), "d", mdq.c(), "e", "f", "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new mds();
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
                synchronized (mds.class) {
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
