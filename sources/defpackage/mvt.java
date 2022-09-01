package defpackage;

/* compiled from: PG */
/* renamed from: mvw  reason: default package */
/* loaded from: classes2.dex */
public final class mvw extends nfm implements nha {
    public static final mvw c;
    private static volatile nhf d;
    public int a;
    public float b;

    static {
        mvw mvwVar = new mvw();
        c = mvwVar;
        nfm.L(mvw.class, mvwVar);
    }

    private mvw() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0013\u0013\u0001\u0000\u0000\u0000\u0013ခ\u000f", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new mvw();
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
                synchronized (mvw.class) {
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
