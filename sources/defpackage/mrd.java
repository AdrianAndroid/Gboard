package defpackage;

/* compiled from: PG */
/* renamed from: mrd  reason: default package */
/* loaded from: classes2.dex */
public final class mrd extends nfm implements nha {
    public static final mrd b;
    private static volatile nhf c;
    public nga a = nhi.b;

    static {
        mrd mrdVar = new mrd();
        b = mrdVar;
        nfm.L(mrd.class, mrdVar);
    }

    private mrd() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", mrc.class});
            }
            if (i2 == 3) {
                return new mrd();
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
                synchronized (mrd.class) {
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
