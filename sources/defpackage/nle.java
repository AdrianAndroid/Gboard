package defpackage;

/* compiled from: PG */
/* renamed from: nle */
/* loaded from: classes2.dex */
public final class nle extends nfm implements nha {
    public static final nle e;
    private static volatile nhf f;
    public int a;
    public int b = 1;
    public int c;
    public int d;

    static {
        nle nleVar = new nle();
        e = nleVar;
        nfm.L(nle.class, nleVar);
    }

    private nle() {
    }

    public static /* synthetic */ void c(nle nleVar) {
        nleVar.a |= 2;
        nleVar.c = 16000;
    }

    public static /* synthetic */ void e(nle nleVar) {
        nleVar.a |= 4;
        nleVar.d = 1;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဌ\u0000\u0003င\u0001\u0004င\u0002", new Object[]{"a", "b", nlc.c, "c", "d"});
            }
            if (i2 == 3) {
                return new nle();
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
                synchronized (nle.class) {
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
