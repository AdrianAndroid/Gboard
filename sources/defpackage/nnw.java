package defpackage;

/* compiled from: PG */
/* renamed from: nnw  reason: default package */
/* loaded from: classes2.dex */
public final class nnw extends nfm implements nha {
    public static final nnw d;
    private static volatile nhf f;
    public String a = "";
    public String b = "";
    public boolean c;
    private int e;

    static {
        nnw nnwVar = new nnw();
        d = nnwVar;
        nfm.L(nnw.class, nnwVar);
    }

    private nnw() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဇ\u0000", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new nnw();
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
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (nnw.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
