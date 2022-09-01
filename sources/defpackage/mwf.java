package defpackage;

/* compiled from: PG */
/* renamed from: mwf  reason: default package */
/* loaded from: classes2.dex */
public final class mwf extends nfm implements nha {
    public static final mwf d;
    private static volatile nhf e;
    public nga a;
    public nga b;
    public nfo c = ned.b;

    static {
        mwf mwfVar = new mwf();
        d = mwfVar;
        nfm.L(mwf.class, mwfVar);
    }

    private mwf() {
        nhi nhiVar = nhi.b;
        this.a = nhiVar;
        this.b = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001a\u0002\u001a\u0003\u0019", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new mwf();
            }
            if (i2 == 4) {
                return new nfh((char[][]) null);
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (mwf.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
