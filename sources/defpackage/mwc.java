package defpackage;

/* compiled from: PG */
/* renamed from: mwc  reason: default package */
/* loaded from: classes2.dex */
public final class mwc extends nfm implements nha {
    public static final mwc f;
    private static volatile nhf g;
    public int a;
    public mwa b;
    public String c = "";
    public float d;
    public int e;

    static {
        mwc mwcVar = new mwc();
        f = mwcVar;
        nfm.L(mwc.class, mwcVar);
    }

    private mwc() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", mrs.c()});
            }
            if (i2 == 3) {
                return new mwc();
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
                synchronized (mwc.class) {
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
