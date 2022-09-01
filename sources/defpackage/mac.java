package defpackage;

/* compiled from: PG */
/* renamed from: mac  reason: default package */
/* loaded from: classes.dex */
public final class mac extends nfm implements nha {
    public static final mac e;
    private static volatile nhf f;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        mac macVar = new mac();
        e = macVar;
        nfm.L(mac.class, macVar);
    }

    private mac() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0004\u0007\u0003\u0000\u0000\u0000\u0004ဇ\u0003\u0005ဇ\u0004\u0007ဇ\u0006", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new mac();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (mac.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
