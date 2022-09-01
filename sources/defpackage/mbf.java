package defpackage;

/* compiled from: PG */
/* renamed from: mbf  reason: default package */
/* loaded from: classes.dex */
public final class mbf extends nfm implements nha {
    public static final mbf d;
    private static volatile nhf e;
    public int a;
    public float b;
    public float c;

    static {
        mbf mbfVar = new mbf();
        d = mbfVar;
        nfm.L(mbf.class, mbfVar);
    }

    private mbf() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new mbf();
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
                synchronized (mbf.class) {
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
