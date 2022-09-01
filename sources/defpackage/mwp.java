package defpackage;

/* compiled from: PG */
/* renamed from: mwp  reason: default package */
/* loaded from: classes2.dex */
public final class mwp extends nfk implements nha {
    public static final mwp b;
    private static volatile nhf h;
    public njo a;
    private int c;
    private int e;
    private mws f;
    private byte g = 2;

    static {
        mwp mwpVar = new mwp();
        b = mwpVar;
        nfm.L(mwp.class, mwpVar);
    }

    private mwp() {
        nex nexVar = nex.b;
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return K(b, "\u0001\u0002\u0000\u0002\u0003R\u0002\u0000\u0000\u0001\u0003ᐉ\u0006Rဉ'", new Object[]{"c", "e", "a", "f"});
            }
            if (i2 == 3) {
                return new mwp();
            }
            if (i2 == 4) {
                return new nfj(b);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            }
            nhf nhfVar = h;
            if (nhfVar == null) {
                synchronized (mwp.class) {
                    nhfVar = h;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        h = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.g);
    }
}
