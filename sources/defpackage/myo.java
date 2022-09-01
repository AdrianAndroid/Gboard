package defpackage;

/* compiled from: PG */
/* renamed from: myo  reason: default package */
/* loaded from: classes2.dex */
public final class myo extends nfm implements nha {
    public static final myo a;
    private static volatile nhf c;
    private ngu b = ngu.a;

    static {
        myo myoVar = new myo();
        a = myoVar;
        nfm.L(myo.class, myoVar);
    }

    private myo() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", myn.a});
            }
            if (i2 == 3) {
                return new myo();
            }
            if (i2 == 4) {
                return new nfh(a);
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = c;
            if (nhfVar == null) {
                synchronized (myo.class) {
                    nhfVar = c;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        c = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
