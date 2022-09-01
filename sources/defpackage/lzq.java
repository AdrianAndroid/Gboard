package defpackage;

/* compiled from: PG */
/* renamed from: lzq  reason: default package */
/* loaded from: classes.dex */
public final class lzq extends nfm implements nha {
    public static final lzq a;
    private static volatile nhf e;
    private int b;
    private mgp c;
    private byte d = 2;

    static {
        lzq lzqVar = new lzq();
        a = lzqVar;
        nfm.L(lzq.class, lzqVar);
    }

    private lzq() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new lzq();
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
                synchronized (lzq.class) {
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
