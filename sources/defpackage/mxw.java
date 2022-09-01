package defpackage;

/* compiled from: PG */
/* renamed from: mxw  reason: default package */
/* loaded from: classes2.dex */
public final class mxw extends nfm implements nha {
    public static final mxw b;
    private static volatile nhf e;
    public myi a;
    private int c;
    private byte d = 2;

    static {
        mxw mxwVar = new mxw();
        b = mxwVar;
        nfm.L(mxw.class, mxwVar);
    }

    private mxw() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new mxw();
            }
            if (i2 == 4) {
                return new nfh(b);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.d = b2;
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (mxw.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.d);
    }
}
