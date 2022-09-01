package defpackage;

/* compiled from: PG */
/* renamed from: mfr  reason: default package */
/* loaded from: classes.dex */
public final class mfr extends nfk implements nha {
    public static final mfr a;
    private static volatile nhf f;
    private int b;
    private mgp c;
    private byte e = 2;

    static {
        mfr mfrVar = new mfr();
        a = mfrVar;
        nfm.L(mfr.class, mfrVar);
    }

    private mfr() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(a, "\u0001\u0001\u0000\u0001\u0010\u0010\u0001\u0000\u0000\u0001\u0010ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new mfr();
            }
            if (i2 == 4) {
                return new nfj(a);
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (mfr.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.e);
    }
}
