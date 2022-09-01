package defpackage;

/* compiled from: PG */
/* renamed from: ifi  reason: default package */
/* loaded from: classes.dex */
public final class ifi extends nfm implements nha {
    public static final ifi e;
    private static volatile nhf f;
    public int a;
    public ifj b;
    public int c;
    public int d;

    static {
        ifi ifiVar = new ifi();
        e = ifiVar;
        nfm.L(ifi.class, ifiVar);
    }

    private ifi() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ifi();
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
                synchronized (ifi.class) {
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
