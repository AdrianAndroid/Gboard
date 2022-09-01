package defpackage;

/* compiled from: PG */
/* renamed from: ncn  reason: default package */
/* loaded from: classes2.dex */
public final class ncn extends nfm implements nha {
    public static final ncn d;
    private static volatile nhf e;
    public int a;
    public int b;
    public ncl c;

    static {
        ncn ncnVar = new ncn();
        d = ncnVar;
        nfm.L(ncn.class, ncnVar);
    }

    private ncn() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0003", new Object[]{"a", "b", mgk.k, "c"});
            }
            if (i2 == 3) {
                return new ncn();
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
                synchronized (ncn.class) {
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
