package defpackage;

/* compiled from: PG */
/* renamed from: mri  reason: default package */
/* loaded from: classes2.dex */
public final class mri extends nfm implements nha {
    public static final mri f;
    private static volatile nhf g;
    public int a;
    public float b = 4.0f;
    public float c = 0.33f;
    public float d = 0.4f;
    public mpw e;

    static {
        mri mriVar = new mri();
        f = mriVar;
        nfm.L(mri.class, mriVar);
    }

    private mri() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new mri();
            }
            if (i2 == 4) {
                return new nfh(f);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (mri.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
