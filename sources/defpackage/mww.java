package defpackage;

/* compiled from: PG */
/* renamed from: mww  reason: default package */
/* loaded from: classes2.dex */
public final class mww extends nfm implements nha {
    public static final mww g;
    private static volatile nhf h;
    public int a;
    public mdm b;
    public mbw c;
    public mfb d;
    public long e;
    public mwz f;

    static {
        mww mwwVar = new mww();
        g = mwwVar;
        nfm.L(mww.class, mwwVar);
    }

    private mww() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new mww();
            }
            if (i2 == 4) {
                return new nfh(g);
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = h;
            if (nhfVar == null) {
                synchronized (mww.class) {
                    nhfVar = h;
                    if (nhfVar == null) {
                        nhfVar = new nfi(g);
                        h = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
