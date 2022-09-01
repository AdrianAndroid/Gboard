package defpackage;

/* compiled from: PG */
/* renamed from: mbz  reason: default package */
/* loaded from: classes.dex */
public final class mbz extends nfm implements nha {
    public static final mbz d;
    private static volatile nhf e;
    public int a;
    public int b;
    public boolean c;

    static {
        mbz mbzVar = new mbz();
        d = mbzVar;
        nfm.L(mbz.class, mbzVar);
    }

    private mbz() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0005\u0007\u0002\u0000\u0000\u0000\u0005ဌ\u0004\u0007ဇ\u0006", new Object[]{"a", "b", mbm.j, "c"});
            }
            if (i2 == 3) {
                return new mbz();
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
                synchronized (mbz.class) {
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
