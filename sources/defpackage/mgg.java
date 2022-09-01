package defpackage;

/* compiled from: PG */
/* renamed from: mgg  reason: default package */
/* loaded from: classes.dex */
public final class mgg extends nfm implements nha {
    public static final mgg f;
    private static volatile nhf g;
    public int a;
    public long b;
    public long c;
    public long d;
    public int e;

    static {
        mgg mggVar = new mgg();
        f = mggVar;
        nfm.L(mgg.class, mggVar);
    }

    private mgg() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0005ဌ\u0004", new Object[]{"a", "b", "c", "d", "e", mdw.u});
            }
            if (i2 == 3) {
                return new mgg();
            }
            if (i2 == 4) {
                return new nfh(f);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (mgg.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
