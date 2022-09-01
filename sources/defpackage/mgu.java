package defpackage;

/* compiled from: PG */
/* renamed from: mgu  reason: default package */
/* loaded from: classes.dex */
public final class mgu extends nfm implements nha {
    public static final mgu f;
    private static volatile nhf h;
    public int a;
    public long d;
    private byte g = 2;
    public String b = "";
    public String c = "";
    public nga e = nhi.b;

    static {
        mgu mguVar = new mgu();
        f = mguVar;
        nfm.L(mgu.class, mguVar);
    }

    private mgu() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004б", new Object[]{"a", "b", "c", "d", "e", mgt.class});
            }
            if (i2 == 3) {
                return new mgu();
            }
            if (i2 == 4) {
                return new nfh(f);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            nhf nhfVar = h;
            if (nhfVar == null) {
                synchronized (mgu.class) {
                    nhfVar = h;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        h = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.g);
    }
}
