package defpackage;

/* compiled from: PG */
/* renamed from: nmj  reason: default package */
/* loaded from: classes2.dex */
public final class nmj extends nfm implements nha {
    public static final nmj d;
    private static volatile nhf e;
    public int a;
    public int b;
    public nli c;

    static {
        nmj nmjVar = new nmj();
        d = nmjVar;
        nfm.L(nmj.class, nmjVar);
    }

    private nmj() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0002", new Object[]{"a", "b", nlc.i, "c"});
            }
            if (i2 == 3) {
                return new nmj();
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
                synchronized (nmj.class) {
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
