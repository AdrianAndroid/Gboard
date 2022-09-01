package defpackage;

/* compiled from: PG */
/* renamed from: mvv  reason: default package */
/* loaded from: classes2.dex */
public final class mvv extends nfm implements nha {
    public static final mvv c;
    private static volatile nhf d;
    public int a;
    public mvw b;

    static {
        mvv mvvVar = new mvv();
        c = mvvVar;
        nfm.L(mvv.class, mvvVar);
    }

    private mvv() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\n\n\u0001\u0000\u0000\u0000\nဉ\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new mvv();
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
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (mvv.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
