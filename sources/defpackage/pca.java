package defpackage;

/* compiled from: PG */
/* renamed from: pca  reason: default package */
/* loaded from: classes2.dex */
public final class pca extends nfm implements nha {
    public static final pca d;
    private static volatile nhf e;
    public int a;
    public nfs b = nfn.b;
    public int c;

    static {
        pca pcaVar = new pca();
        d = pcaVar;
        nfm.L(pca.class, pcaVar);
    }

    private pca() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002,\u0003င\u0001", new Object[]{"a", "b", mxe.k, "c"});
            }
            if (i2 == 3) {
                return new pca();
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
                synchronized (pca.class) {
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
