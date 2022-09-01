package defpackage;

/* compiled from: PG */
/* renamed from: jht  reason: default package */
/* loaded from: classes.dex */
public final class jht extends nfm implements nha {
    public static final jht c;
    private static volatile nhf d;
    public int a;
    public int b;

    static {
        jht jhtVar = new jht();
        c = jhtVar;
        nfm.L(jht.class, jhtVar);
    }

    private jht() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{"a", "b", ggq.r});
            }
            if (i2 == 3) {
                return new jht();
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
                synchronized (jht.class) {
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
