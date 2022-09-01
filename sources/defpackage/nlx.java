package defpackage;

/* compiled from: PG */
/* renamed from: nlx  reason: default package */
/* loaded from: classes2.dex */
public final class nlx extends nfk implements nha {
    public static final nlx e;
    private static volatile nhf g;
    public int a;
    public nmc c;
    private byte f = 2;
    public nga b = nhi.b;

    static {
        nlx nlxVar = new nlx();
        e = nlxVar;
        nfm.L(nlx.class, nlxVar);
    }

    private nlx() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(e, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0001\u0000\u0001\u001a\u0005ဉ\u0004", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new nlx();
            }
            if (i2 == 4) {
                return new nfj(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (nlx.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.f);
    }
}
