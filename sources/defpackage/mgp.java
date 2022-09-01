package defpackage;

/* compiled from: PG */
/* renamed from: mgp  reason: default package */
/* loaded from: classes.dex */
public final class mgp extends nfm implements nha {
    public static final mgp a;
    private static volatile nhf e;
    private int b;
    private mgq c;
    private byte d = 2;

    static {
        mgp mgpVar = new mgp();
        a = mgpVar;
        nfm.L(mgp.class, mgpVar);
    }

    private mgp() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(a, "\u0001\u0001\u0000\u0001\r\r\u0001\u0000\u0000\u0001\rᐉ\u000b", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new mgp();
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
                synchronized (mgp.class) {
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
