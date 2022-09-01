package defpackage;

/* compiled from: PG */
/* renamed from: nct  reason: default package */
/* loaded from: classes2.dex */
public final class nct extends nfm implements nha {
    public static final nct c;
    private static volatile nhf d;
    public String a = "";
    public boolean b;

    static {
        nct nctVar = new nct();
        c = nctVar;
        nfm.L(nct.class, nctVar);
    }

    private nct() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new nct();
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
                synchronized (nct.class) {
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
