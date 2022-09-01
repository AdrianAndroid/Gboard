package defpackage;

/* compiled from: PG */
/* renamed from: mfw  reason: default package */
/* loaded from: classes.dex */
public final class mfw extends nfm implements nha {
    public static final mfw f;
    private static volatile nhf g;
    public int a;
    public float b;
    public long c;
    public int d;
    public int e;

    static {
        mfw mfwVar = new mfw();
        f = mfwVar;
        nfm.L(mfw.class, mfwVar);
    }

    private mfw() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", mdw.r, "e", mdw.q});
            }
            if (i2 == 3) {
                return new mfw();
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
                synchronized (mfw.class) {
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
