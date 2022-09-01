package defpackage;

/* compiled from: PG */
/* renamed from: njt  reason: default package */
/* loaded from: classes2.dex */
public final class njt extends nfm implements nha {
    public static final njt a;
    private static volatile nhf e;
    private int b;
    private int c;
    private byte d = 2;

    static {
        njt njtVar = new njt();
        a = njtVar;
        nfm.L(njt.class, njtVar);
    }

    private njt() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᔄ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new njt();
            }
            if (i2 == 4) {
                return new nfh(a);
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (njt.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.d);
    }
}
