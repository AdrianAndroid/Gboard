package defpackage;

/* compiled from: PG */
/* renamed from: nls  reason: default package */
/* loaded from: classes2.dex */
public final class nls extends nfm implements nha {
    public static final nls a;
    private static volatile nhf c;
    private ngu b = ngu.a;

    static {
        nls nlsVar = new nls();
        a = nlsVar;
        nfm.L(nls.class, nlsVar);
    }

    private nls() {
        nfn nfnVar = nfn.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0001\u0000\u0000\u0007\u0007\u0001\u0001\u0000\u0000\u00072", new Object[]{"b", nlr.a});
            }
            if (i2 == 3) {
                return new nls();
            }
            if (i2 == 4) {
                return new nfh(a);
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (nls.class) {
                    nhfVar = c;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        c = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
