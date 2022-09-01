package defpackage;

/* compiled from: PG */
/* renamed from: nnz  reason: default package */
/* loaded from: classes2.dex */
public final class nnz extends nfm implements nha {
    public static final nnz f;
    private static volatile nhf g;
    public int a;
    public int b;
    public nga c = nhi.b;
    public int d;
    public int e;

    static {
        nnz nnzVar = new nnz();
        f = nnzVar;
        nfm.L(nnz.class, nnzVar);
    }

    private nnz() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002\u001b\u0003င\u0001\u0004င\u0002", new Object[]{"a", "b", "c", nnk.class, "d", "e"});
            }
            if (i2 == 3) {
                return new nnz();
            }
            if (i2 == 4) {
                return new nfh((char[]) null, (short[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (nnz.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
