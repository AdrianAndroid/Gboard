package defpackage;

/* compiled from: PG */
/* renamed from: nlf  reason: default package */
/* loaded from: classes2.dex */
public final class nlf extends nfm implements nha {
    public static final nlf f;
    private static volatile nhf g;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        nlf nlfVar = new nlf();
        f = nlfVar;
        nfm.L(nlf.class, nlfVar);
    }

    private nlf() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0000\u0002ဈ\u0004\u0003ဈ\u0005\u0004ဈ\u0006\u0006ဌ\u0001", new Object[]{"a", "c", "d", "e", "b", nlc.d});
            }
            if (i2 == 3) {
                return new nlf();
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
                synchronized (nlf.class) {
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
