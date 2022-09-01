package defpackage;

/* compiled from: PG */
/* renamed from: nkt  reason: default package */
/* loaded from: classes2.dex */
public final class nkt extends nfk implements nha {
    public static final nkt c;
    private static volatile nhf g;
    public int a;
    public int b;
    private int e;
    private byte f = 2;

    static {
        nkt nktVar = new nkt();
        c = nktVar;
        nfm.L(nkt.class, nktVar);
    }

    private nkt() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"e", "a", mxe.u, "b"});
            }
            if (i2 == 3) {
                return new nkt();
            }
            if (i2 == 4) {
                return new nfj(c);
            }
            if (i2 == 5) {
                return c;
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
                synchronized (nkt.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.f);
    }
}
