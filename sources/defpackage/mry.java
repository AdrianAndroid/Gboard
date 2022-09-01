package defpackage;

/* compiled from: PG */
/* renamed from: mry  reason: default package */
/* loaded from: classes2.dex */
public final class mry extends nfm implements nha {
    public static final nft d = new euq(4);
    public static final mry g;
    private static volatile nhf i;
    public int b;
    public int e;
    public long f;
    private int h;
    public int a = 1;
    public nfs c = nfn.b;

    static {
        mry mryVar = new mry();
        g = mryVar;
        nfm.L(mry.class, mryVar);
    }

    private mry() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဌ\u0000\u0002င\u0001\u0003\u001e\u0004ဌ\u0002\u0005ဂ\u0003", new Object[]{"h", "a", mrx.c(), "b", "c", mti.c(), "e", mvl.c(), "f"});
            }
            if (i3 == 3) {
                return new mry();
            }
            if (i3 == 4) {
                return new nfh(g);
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (mry.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(g);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
