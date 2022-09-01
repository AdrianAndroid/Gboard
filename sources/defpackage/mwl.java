package defpackage;

/* compiled from: PG */
/* renamed from: mwl  reason: default package */
/* loaded from: classes2.dex */
public final class mwl extends nfm implements nha {
    public static final mwl b;
    private static volatile nhf g;
    private int c;
    private int d;
    private byte f = 2;
    private String e = "";
    public nga a = nhi.b;

    static {
        mwl mwlVar = new mwl();
        b = mwlVar;
        nfm.L(mwl.class, mwlVar);
    }

    private mwl() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return K(b, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001ᔄ\u0000\u0002ᔈ\u0001\u0003Л", new Object[]{"c", "d", "e", "a", mwn.class});
            }
            if (i2 == 3) {
                return new mwl();
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
                this.f = b2;
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (mwl.class) {
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
