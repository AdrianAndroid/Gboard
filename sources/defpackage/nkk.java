package defpackage;

/* compiled from: PG */
/* renamed from: nkk  reason: default package */
/* loaded from: classes2.dex */
public final class nkk extends nfm implements nha {
    public static final nkk c;
    public static final ngt d;
    private static volatile nhf e;
    public int a;
    public nem b = nem.b;

    static {
        nkk nkkVar = new nkk();
        c = nkkVar;
        nfm.L(nkk.class, nkkVar);
        d = nfm.P(nks.f, nkkVar, nkkVar, 293101, nik.MESSAGE);
    }

    private nkk() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new nkk();
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
                synchronized (nkk.class) {
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
