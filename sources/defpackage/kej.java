package defpackage;

/* compiled from: PG */
/* renamed from: kej  reason: default package */
/* loaded from: classes.dex */
public final class kej extends nfm implements nha {
    public static final kej c;
    private static volatile nhf e;
    public int a;
    public int b;
    private int d;

    static {
        kej kejVar = new kej();
        c = kejVar;
        nfm.L(kej.class, kejVar);
    }

    private kej() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new kej();
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
                synchronized (kej.class) {
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
