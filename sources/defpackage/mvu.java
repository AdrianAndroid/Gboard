package defpackage;

/* compiled from: PG */
/* renamed from: mvu  reason: default package */
/* loaded from: classes2.dex */
public final class mvu extends nfm implements nha {
    public static final mvu f;
    private static volatile nhf g;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        mvu mvuVar = new mvu();
        f = mvuVar;
        nfm.L(mvu.class, mvuVar);
    }

    private mvu() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new mvu();
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
                synchronized (mvu.class) {
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
