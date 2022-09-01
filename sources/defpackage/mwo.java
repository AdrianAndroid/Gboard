package defpackage;

/* compiled from: PG */
/* renamed from: mwo  reason: default package */
/* loaded from: classes2.dex */
public final class mwo extends nfm implements nha {
    public static final mwo b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        mwo mwoVar = new mwo();
        b = mwoVar;
        nfm.L(mwo.class, mwoVar);
    }

    private mwo() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001a", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new mwo();
            }
            if (i2 == 4) {
                return new nfh(b);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (mwo.class) {
                    nhfVar = c;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        c = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
