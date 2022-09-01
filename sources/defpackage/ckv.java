package defpackage;

/* compiled from: PG */
/* renamed from: ckv  reason: default package */
/* loaded from: classes.dex */
public final class ckv extends nfm implements nha {
    public static final ckv c;
    private static volatile nhf e;
    public String a = "";
    public boolean b;
    private int d;

    static {
        ckv ckvVar = new ckv();
        c = ckvVar;
        nfm.L(ckv.class, ckvVar);
    }

    private ckv() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new ckv();
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
                synchronized (ckv.class) {
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
