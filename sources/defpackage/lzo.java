package defpackage;

/* compiled from: PG */
/* renamed from: lzo  reason: default package */
/* loaded from: classes.dex */
public final class lzo extends nfm implements nha {
    public static final lzo a;
    private static volatile nhf e;
    private ngu b = ngu.a;
    private ngu c;
    private ngu d;

    static {
        lzo lzoVar = new lzo();
        a = lzoVar;
        nfm.L(lzo.class, lzoVar);
    }

    private lzo() {
        ngu nguVar = ngu.a;
        this.c = nguVar;
        this.d = nguVar;
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(a, "\u0001\u0003\u0000\u0000\u0003\f\u0003\u0003\u0000\u0000\u00032\u00072\f2", new Object[]{"b", lzm.a, "c", lzn.a, "d", lzl.a});
            }
            if (i2 == 3) {
                return new lzo();
            }
            if (i2 == 4) {
                return new nfh(a);
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (lzo.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(a);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
