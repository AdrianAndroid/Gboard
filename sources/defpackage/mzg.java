package defpackage;

/* compiled from: PG */
/* renamed from: mzg  reason: default package */
/* loaded from: classes2.dex */
public final class mzg extends nfm implements nha {
    public static final mzg b;
    private static volatile nhf c;
    public mzf a;

    static {
        mzg mzgVar = new mzg();
        b = mzgVar;
        nfm.L(mzg.class, mzgVar);
    }

    private mzg() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new mzg();
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
                synchronized (mzg.class) {
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
