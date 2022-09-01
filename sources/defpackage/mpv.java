package defpackage;

/* compiled from: PG */
/* renamed from: mpv  reason: default package */
/* loaded from: classes2.dex */
public final class mpv extends nfm implements nha {
    public static final mpv f;
    private static volatile nhf g;
    public int a;
    public String b = "";
    public String c = "";
    public float d;
    public float e;

    static {
        mpv mpvVar = new mpv();
        f = mpvVar;
        nfm.L(mpv.class, mpvVar);
    }

    private mpv() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0016\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0015ခ\u0003\u0016ခ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new mpv();
            }
            if (i2 == 4) {
                return new nfh(f);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (mpv.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
