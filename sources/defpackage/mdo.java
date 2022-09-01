package defpackage;

/* compiled from: PG */
/* renamed from: mdo  reason: default package */
/* loaded from: classes.dex */
public final class mdo extends nfm implements nha {
    public static final mdo d;
    private static volatile nhf e;
    public int a;
    public int b;
    public int c;

    static {
        mdo mdoVar = new mdo();
        d = mdoVar;
        nfm.L(mdo.class, mdoVar);
    }

    private mdo() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", maw.q, "c"});
            }
            if (i2 == 3) {
                return new mdo();
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
                synchronized (mdo.class) {
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
