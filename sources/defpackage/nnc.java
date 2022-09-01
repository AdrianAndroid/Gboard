package defpackage;

/* compiled from: PG */
/* renamed from: nnc  reason: default package */
/* loaded from: classes2.dex */
public final class nnc extends nfm implements nha {
    public static final nnc d;
    private static volatile nhf f;
    public int a;
    public nnh b;
    public nga c = nhi.b;
    private int e;

    static {
        nnc nncVar = new nnc();
        d = nncVar;
        nfm.L(nnc.class, nncVar);
    }

    private nnc() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0001\u0000\u0001င\u0000\u0002\u001b\tဉ\u0001", new Object[]{"e", "a", "c", nnj.class, "b"});
            }
            if (i2 == 3) {
                return new nnc();
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
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (nnc.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
