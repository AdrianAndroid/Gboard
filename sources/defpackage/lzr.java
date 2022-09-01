package defpackage;

/* compiled from: PG */
/* renamed from: lzr  reason: default package */
/* loaded from: classes.dex */
public final class lzr extends nfm implements nha {
    public static final lzr a;
    private static volatile nhf i;
    private int b;
    private mgq c;
    private mgq d;
    private mgq e;
    private mfr f;
    private lzy g;
    private byte h = 2;

    static {
        lzr lzrVar = new lzr();
        a = lzrVar;
        nfm.L(lzr.class, lzrVar);
    }

    private lzr() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return K(a, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0004\bᐉ\u0003\tᐉ\u0007", new Object[]{"b", "c", "d", "f", "e", "g"});
            }
            if (i3 == 3) {
                return new lzr();
            }
            if (i3 == 4) {
                return new nfh(a);
            }
            if (i3 == 5) {
                return a;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (lzr.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.h);
    }
}
