package defpackage;

/* compiled from: PG */
/* renamed from: mff  reason: default package */
/* loaded from: classes.dex */
public final class mff extends nfm implements nha {
    public static final mff a;
    private static volatile nhf e;
    private int b;
    private byte d = 2;
    private String c = "";

    static {
        mff mffVar = new mff();
        a = mffVar;
        nfm.L(mff.class, mffVar);
    }

    private mff() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new mff();
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
                synchronized (mff.class) {
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
