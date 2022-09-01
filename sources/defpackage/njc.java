package defpackage;

/* compiled from: PG */
/* renamed from: njc  reason: default package */
/* loaded from: classes2.dex */
public final class njc extends nfm implements nha {
    public static final njc b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        njc njcVar = new njc();
        b = njcVar;
        nfm.L(njc.class, njcVar);
    }

    private njc() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new njc();
            }
            if (i2 == 4) {
                return new nfh((float[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (njc.class) {
                    nhfVar = c;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        c = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
