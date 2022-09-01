package defpackage;

/* compiled from: PG */
/* renamed from: mxk  reason: default package */
/* loaded from: classes2.dex */
public final class mxk extends nfm implements nha {
    public static final nft d = new euq(5);
    public static final nft f = new euq(6);
    public static final mxk g;
    private static volatile nhf i;
    public int a;
    public long b;
    public nfs c;
    public nfs e;
    private int h;

    static {
        mxk mxkVar = new mxk();
        g = mxkVar;
        nfm.L(mxk.class, mxkVar);
    }

    private mxk() {
        nfn nfnVar = nfn.b;
        this.c = nfnVar;
        this.e = nfnVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(g, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001e\u0003\u001e\u0004ဂ\u0001", new Object[]{"h", "a", mxe.e, "c", mxl.c(), "e", mxo.c(), "b"});
            }
            if (i3 == 3) {
                return new mxk();
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
                synchronized (mxk.class) {
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
