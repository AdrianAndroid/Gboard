package defpackage;

/* compiled from: PG */
/* renamed from: nch  reason: default package */
/* loaded from: classes2.dex */
public final class nch extends nfm implements nha {
    public static final nch c;
    private static volatile nhf d;
    public int a;
    public ncg b;

    static {
        nch nchVar = new nch();
        c = nchVar;
        nfm.L(nch.class, nchVar);
    }

    private nch() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\f\f\u0001\u0000\u0000\u0000\fဉ\u000e", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new nch();
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
                synchronized (nch.class) {
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
