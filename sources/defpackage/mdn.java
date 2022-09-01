package defpackage;

/* compiled from: PG */
/* renamed from: mdn  reason: default package */
/* loaded from: classes.dex */
public final class mdn extends nfm implements nha {
    public static final mdn f;
    private static volatile nhf g;
    public int a;
    public int b;
    public int c;
    public String d = "";
    public String e = "";

    static {
        mdn mdnVar = new mdn();
        f = mdnVar;
        nfm.L(mdn.class, mdnVar);
    }

    private mdn() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", mco.q, "d", "e"});
            }
            if (i2 == 3) {
                return new mdn();
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
                synchronized (mdn.class) {
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
