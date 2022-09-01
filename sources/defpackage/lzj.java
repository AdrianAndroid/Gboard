package defpackage;

/* compiled from: PG */
/* renamed from: lzj  reason: default package */
/* loaded from: classes.dex */
public final class lzj extends nfm implements nha {
    public static final lzj a;
    private static volatile nhf g;
    private int b;
    private int c;
    private mfv d;
    private mgr e;
    private byte f = 2;

    static {
        lzj lzjVar = new lzj();
        a = lzjVar;
        nfm.L(lzj.class, lzjVar);
    }

    private lzj() {
        nhi nhiVar = nhi.b;
        nfn nfnVar = nfn.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(a, "\u0001\u0002\u0000\u00029v\u0002\u0000\u0000\u00029ᐉ\u0006vᐉ2", new Object[]{"b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new lzj();
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
                this.f = b;
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (lzj.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.f);
    }
}
