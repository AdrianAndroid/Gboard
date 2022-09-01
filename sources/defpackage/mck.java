package defpackage;

/* compiled from: PG */
/* renamed from: mck  reason: default package */
/* loaded from: classes.dex */
public final class mck extends nfm implements nha {
    public static final mck h;
    private static volatile nhf i;
    public int a;
    public boolean b;
    public int c;
    public boolean d;
    public boolean e;
    public int f;
    public boolean g;

    static {
        mck mckVar = new mck();
        h = mckVar;
        nfm.L(mck.class, mckVar);
    }

    private mck() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                nfq nfqVar = mco.g;
                return K(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဌ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", nfqVar, "d", "e", "f", nfqVar, "g"});
            } else if (i3 == 3) {
                return new mck();
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
                    synchronized (mck.class) {
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
