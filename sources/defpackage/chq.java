package defpackage;

/* compiled from: PG */
/* renamed from: chq  reason: default package */
/* loaded from: classes.dex */
public final class chq extends nfm implements nha {
    public static final chq d;
    private static volatile nhf e;
    public int a;
    public int b;
    public nga c = nhi.b;

    static {
        chq chqVar = new chq();
        d = chqVar;
        nfm.L(chq.class, chqVar);
    }

    private chq() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"a", "b", cgs.d, "c", chp.class});
            }
            if (i2 == 3) {
                return new chq();
            }
            if (i2 == 4) {
                return new nfh(d);
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (chq.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
