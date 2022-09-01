package defpackage;

/* compiled from: PG */
/* renamed from: njg  reason: default package */
/* loaded from: classes2.dex */
public final class njg extends nfm implements nha {
    public static final njg a;
    private static volatile nhf e;
    private int b;
    private mgq c;
    private byte d = 2;

    static {
        njg njgVar = new njg();
        a = njgVar;
        nfm.L(njg.class, njgVar);
    }

    private njg() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(a, "\u0001\u0001\u0000\u0001\u0011\u0011\u0001\u0000\u0000\u0001\u0011ᐉ\u0002", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new njg();
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
                synchronized (njg.class) {
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
