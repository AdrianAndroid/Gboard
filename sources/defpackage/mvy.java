package defpackage;

/* compiled from: PG */
/* renamed from: mvy  reason: default package */
/* loaded from: classes2.dex */
public final class mvy extends nfm implements nha {
    public static final mvy a;
    private static volatile nhf b;

    static {
        mvy mvyVar = new mvy();
        a = mvyVar;
        nfm.L(mvy.class, mvyVar);
    }

    private mvy() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new mvy();
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
            nhf nhfVar = b;
            if (nhfVar == null) {
                synchronized (mvy.class) {
                    nhfVar = b;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        b = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
