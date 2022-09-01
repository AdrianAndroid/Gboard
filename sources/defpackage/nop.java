package defpackage;

/* compiled from: PG */
/* renamed from: nop  reason: default package */
/* loaded from: classes2.dex */
public final class nop extends nfm implements nha {
    public static final nop f;
    private static volatile nhf g;
    public int a;
    public int b;
    public String c = "";
    public long d;
    public long e;

    static {
        nop nopVar = new nop();
        f = nopVar;
        nfm.L(nop.class, nopVar);
    }

    private nop() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new nop();
            }
            if (i2 == 4) {
                return new nfh(f);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (nop.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
