package defpackage;

/* compiled from: PG */
/* renamed from: ooh  reason: default package */
/* loaded from: classes2.dex */
public final class ooh extends nfm implements nha {
    public static final ooh a;
    private static volatile nhf b;

    static {
        ooh oohVar = new ooh();
        a = oohVar;
        nfm.L(ooh.class, oohVar);
    }

    private ooh() {
        ngp ngpVar = ngp.b;
        nfn nfnVar = nfn.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new ooh();
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
            nhf nhfVar = b;
            if (nhfVar == null) {
                synchronized (ooh.class) {
                    nhfVar = b;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        b = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
