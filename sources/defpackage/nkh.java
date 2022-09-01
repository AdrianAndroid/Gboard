package defpackage;

/* compiled from: PG */
/* renamed from: nkh  reason: default package */
/* loaded from: classes2.dex */
public final class nkh extends nfk implements nha {
    public static final nkh g;
    private static volatile nhf k;
    public int a;
    public int b;
    public nkj c;
    public nkd e;
    public nkj f;
    private nkj h;
    private nkg i;
    private byte j = 2;

    static {
        nkh nkhVar = new nkh();
        g = nkhVar;
        nfm.L(nkh.class, nkhVar);
    }

    private nkh() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(g, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0004\u0001ဌ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0005\nဉ\b", new Object[]{"a", "b", mxe.s, "c", "e", "f", "h", "i"});
            }
            if (i2 == 3) {
                return new nkh();
            }
            if (i2 == 4) {
                return new nfj(g);
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            nhf nhfVar = k;
            if (nhfVar == null) {
                synchronized (nkh.class) {
                    nhfVar = k;
                    if (nhfVar == null) {
                        nhfVar = new nfi(g);
                        k = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.j);
    }
}
