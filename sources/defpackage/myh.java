package defpackage;

/* compiled from: PG */
/* renamed from: myh  reason: default package */
/* loaded from: classes2.dex */
public final class myh extends nfm implements nha {
    public static final nft d = new euq(7);
    public static final myh e;
    private static volatile nhf f;
    public nga a;
    public nga b;
    public nfs c = nfn.b;

    static {
        myh myhVar = new myh();
        e = myhVar;
        nfm.L(myh.class, myhVar);
    }

    private myh() {
        nhi nhiVar = nhi.b;
        this.a = nhiVar;
        this.b = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003,", new Object[]{"a", myf.class, "b", myg.class, "c", mvl.c()});
            }
            if (i2 == 3) {
                return new myh();
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
                synchronized (myh.class) {
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
