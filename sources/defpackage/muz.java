package defpackage;

/* compiled from: PG */
/* renamed from: muz  reason: default package */
/* loaded from: classes2.dex */
public final class muz extends nfm implements nha {
    public static final muz c;
    private static volatile nhf e;
    public nem a = nem.b;
    public long b;
    private int d;

    static {
        muz muzVar = new muz();
        c = muzVar;
        nfm.L(muz.class, muzVar);
    }

    private muz() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ည\u0000\u0003ဂ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new muz();
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
                synchronized (muz.class) {
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
