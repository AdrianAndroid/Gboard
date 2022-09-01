package defpackage;

/* compiled from: PG */
/* renamed from: nku  reason: default package */
/* loaded from: classes2.dex */
public final class nku extends nfm implements nha {
    public static final nku c;
    public static final ngt d;
    private static volatile nhf e;
    public int a;
    public String b = "";

    static {
        nku nkuVar = new nku();
        c = nkuVar;
        nfm.L(nku.class, nkuVar);
        d = nfm.P(nks.f, nkuVar, nkuVar, 27423252, nik.MESSAGE);
    }

    private nku() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new nku();
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
                synchronized (nku.class) {
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
