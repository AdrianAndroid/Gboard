package defpackage;

/* compiled from: PG */
/* renamed from: muq  reason: default package */
/* loaded from: classes2.dex */
public final class muq extends nfm implements nha {
    public static final muq e;
    private static volatile nhf g;
    public int a;
    public int b;
    public int c;
    public long d;
    private int f;

    static {
        muq muqVar = new muq();
        e = muqVar;
        nfm.L(muq.class, muqVar);
    }

    private muq() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0005ဂ\u0004", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new muq();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (muq.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
