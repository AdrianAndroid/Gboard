package defpackage;

/* compiled from: PG */
/* renamed from: mpb  reason: default package */
/* loaded from: classes2.dex */
public final class mpb extends nfm implements nha {
    public static final mpb f;
    private static volatile nhf g;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public mpd e;

    static {
        mpb mpbVar = new mpb();
        f = mpbVar;
        nfm.L(mpb.class, mpbVar);
    }

    private mpb() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", mgk.f, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new mpb();
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
                synchronized (mpb.class) {
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
