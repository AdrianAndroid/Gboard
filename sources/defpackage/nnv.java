package defpackage;

/* compiled from: PG */
/* renamed from: nnv  reason: default package */
/* loaded from: classes2.dex */
public final class nnv extends nfm implements nha {
    public static final nnv b;
    private static volatile nhf c;
    public String a = "";

    static {
        nnv nnvVar = new nnv();
        b = nnvVar;
        nfm.L(nnv.class, nnvVar);
    }

    private nnv() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new nnv();
            }
            if (i2 == 4) {
                return new nfh(b);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (nnv.class) {
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
