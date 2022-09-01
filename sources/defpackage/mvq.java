package defpackage;

/* compiled from: PG */
/* renamed from: mvq  reason: default package */
/* loaded from: classes2.dex */
public final class mvq extends nfm implements nha {
    public static final mvq c;
    private static volatile nhf e;
    public int a;
    public nga b = nhi.b;
    private int d;

    static {
        mvq mvqVar = new mvq();
        c = mvqVar;
        nfm.L(mvq.class, mvqVar);
    }

    private mvq() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"d", "a", "b", mvr.class});
            }
            if (i2 == 3) {
                return new mvq();
            }
            if (i2 == 4) {
                return new nfh(c);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (mvq.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
