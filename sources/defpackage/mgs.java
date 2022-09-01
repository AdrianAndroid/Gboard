package defpackage;

/* compiled from: PG */
/* renamed from: mgs  reason: default package */
/* loaded from: classes.dex */
public final class mgs extends nfm implements nha {
    public static final mgs a;
    private static volatile nhf h;
    private int b;
    private mgr c;
    private int e;
    private mgx f;
    private byte g = 2;
    private String d = "";

    static {
        mgs mgsVar = new mgs();
        a = mgsVar;
        nfm.L(mgs.class, mgsVar);
    }

    private mgs() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0004\u0001ᔉ\u0000\u0002ᔈ\u0001\u0003ᔄ\u0002\bᐉ\n", new Object[]{"b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new mgs();
            }
            if (i2 == 4) {
                return new nfh(a);
            }
            if (i2 == 5) {
                return a;
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
                synchronized (mgs.class) {
                    nhfVar = h;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        h = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.g);
    }
}
