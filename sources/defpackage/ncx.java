package defpackage;

/* compiled from: PG */
/* renamed from: ncx  reason: default package */
/* loaded from: classes2.dex */
public final class ncx extends nfm implements nha {
    public static final ncx e;
    private static volatile nhf f;
    public nga a;
    public nga b;
    public nga c;
    public nga d;

    static {
        ncx ncxVar = new ncx();
        e = ncxVar;
        nfm.L(ncx.class, ncxVar);
    }

    private ncx() {
        nhi nhiVar = nhi.b;
        this.a = nhiVar;
        this.b = nhiVar;
        this.c = nhiVar;
        this.d = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0000\u0004\u0000\u0000\u0004\u0007\u0004\u0000\u0004\u0000\u0004Ț\u0005Ț\u0006Ț\u0007Ț", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ncx();
            }
            if (i2 == 4) {
                return new nfh((float[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (ncx.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
