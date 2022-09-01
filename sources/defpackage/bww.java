package defpackage;

/* compiled from: PG */
/* renamed from: bww  reason: default package */
/* loaded from: classes.dex */
public final class bww extends nfm implements nha {
    public static final bww f;
    private static volatile nhf g;
    public int a;
    public long b;
    public long c;
    public String d = "";
    public bwx e;

    static {
        bww bwwVar = new bww();
        f = bwwVar;
        nfm.L(bww.class, bwwVar);
    }

    private bww() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new bww();
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
                synchronized (bww.class) {
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
