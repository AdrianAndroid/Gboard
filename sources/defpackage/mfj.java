package defpackage;

/* compiled from: PG */
/* renamed from: mfj  reason: default package */
/* loaded from: classes.dex */
public final class mfj extends nfm implements nha {
    public static final mfj a;
    private static volatile nhf e;
    private int b;
    private mgr c;
    private byte d = 2;

    static {
        mfj mfjVar = new mfj();
        a = mfjVar;
        nfm.L(mfj.class, mfjVar);
    }

    private mfj() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0001", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new mfj();
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
                synchronized (mfj.class) {
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
