package defpackage;

/* compiled from: PG */
/* renamed from: lzw  reason: default package */
/* loaded from: classes.dex */
public final class lzw extends nfm implements nha {
    public static final lzw e;
    private static volatile nhf f;
    public int a;
    public long b;
    public int c;
    public int d;

    static {
        lzw lzwVar = new lzw();
        e = lzwVar;
        nfm.L(lzw.class, lzwVar);
    }

    private lzw() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new lzw();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (lzw.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
