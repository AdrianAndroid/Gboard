package defpackage;

/* compiled from: PG */
/* renamed from: mwg  reason: default package */
/* loaded from: classes2.dex */
public final class mwg extends nfm implements nha {
    public static final mwg c;
    private static volatile nhf d;
    public nga a;
    public nga b;

    static {
        mwg mwgVar = new mwg();
        c = mwgVar;
        nfm.L(mwg.class, mwgVar);
    }

    private mwg() {
        nhi nhiVar = nhi.b;
        this.a = nhiVar;
        this.b = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001a", new Object[]{"a", mwf.class, "b"});
            }
            if (i2 == 3) {
                return new mwg();
            }
            if (i2 == 4) {
                return new nfh((char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (mwg.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
