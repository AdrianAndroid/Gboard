package defpackage;

/* compiled from: PG */
/* renamed from: nnr */
/* loaded from: classes2.dex */
public final class nnr extends nfm implements nha {
    public static final nnr c;
    private static volatile nhf e;
    public int a;
    public int b;
    private int d;

    static {
        nnr nnrVar = new nnr();
        c = nnrVar;
        nfm.L(nnr.class, nnrVar);
    }

    private nnr() {
    }

    public static /* synthetic */ void c(nnr nnrVar) {
        nnrVar.a |= 2;
        nnrVar.d = 1512;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", nni.c(), "d"});
            }
            if (i2 == 3) {
                return new nnr();
            }
            if (i2 == 4) {
                return new nfh(c);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (nnr.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
