package defpackage;

/* compiled from: PG */
/* renamed from: mzf  reason: default package */
/* loaded from: classes2.dex */
public final class mzf extends nfm implements nha {
    public static final mzf b;
    private static volatile nhf c;
    public long a;

    static {
        mzf mzfVar = new mzf();
        b = mzfVar;
        nfm.L(mzf.class, mzfVar);
    }

    private mzf() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0000\u0001\u0000\u0000\u0005\u0005\u0001\u0000\u0000\u0000\u0005\u0002", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new mzf();
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
                synchronized (mzf.class) {
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
