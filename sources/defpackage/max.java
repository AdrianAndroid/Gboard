package defpackage;

/* compiled from: PG */
/* renamed from: max  reason: default package */
/* loaded from: classes.dex */
public final class max extends nfm implements nha {
    public static final max d;
    private static volatile nhf e;
    public int a;
    public int b;
    public int c;

    static {
        max maxVar = new max();
        d = maxVar;
        nfm.L(max.class, maxVar);
    }

    private max() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", maw.e, "c"});
            }
            if (i2 == 3) {
                return new max();
            }
            if (i2 == 4) {
                return new nfh(d);
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (max.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
