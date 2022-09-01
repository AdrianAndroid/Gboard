package defpackage;

/* compiled from: PG */
/* renamed from: ncj  reason: default package */
/* loaded from: classes2.dex */
public final class ncj extends nfm implements nha {
    public static final ncj c;
    private static volatile nhf d;
    public int a;
    public nck b;

    static {
        ncj ncjVar = new ncj();
        c = ncjVar;
        nfm.L(ncj.class, ncjVar);
    }

    private ncj() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u000177\u0001\u0000\u0000\u00007ဉ\u0014", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ncj();
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
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (ncj.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
