package defpackage;

/* compiled from: PG */
/* renamed from: nkj  reason: default package */
/* loaded from: classes2.dex */
public final class nkj extends nfk implements nha {
    public static final nkj b;
    private static volatile nhf g;
    private int c;
    private nki e;
    private byte f = 2;
    public nga a = nhi.b;

    static {
        nkj nkjVar = new nkj();
        b = nkjVar;
        nfm.L(nkj.class, nkjVar);
    }

    private nkj() {
        nem nemVar = nem.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return K(b, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0001\u0002\u0003Л\u0005ᐉ\u0003", new Object[]{"c", "a", nka.class, "e"});
            }
            if (i2 == 3) {
                return new nkj();
            }
            if (i2 == 4) {
                return new nfj(b);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (nkj.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.f);
    }
}
