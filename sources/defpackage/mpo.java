package defpackage;

/* compiled from: PG */
/* renamed from: mpo  reason: default package */
/* loaded from: classes2.dex */
public final class mpo extends nfm implements nha {
    public static final mpo j;
    private static volatile nhf k;
    public int a;
    public String b = "";
    public mpp c;
    public mpk d;
    public mpn e;
    public mpn f;
    public mpl g;
    public mpe h;
    public mpk i;

    static {
        mpo mpoVar = new mpo();
        j = mpoVar;
        nfm.L(mpo.class, mpoVar);
    }

    private mpo() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(j, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\nဉ\t\u000fဉ\u000e\u0010ဉ\u000f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new mpo();
            }
            if (i2 == 4) {
                return new nfh(j);
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = k;
            if (nhfVar == null) {
                synchronized (mpo.class) {
                    nhfVar = k;
                    if (nhfVar == null) {
                        nhfVar = new nfi(j);
                        k = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
