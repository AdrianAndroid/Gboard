package defpackage;

/* compiled from: PG */
/* renamed from: muo  reason: default package */
/* loaded from: classes2.dex */
public final class muo extends nfm implements nha {
    public static final muo f;
    private static volatile nhf g;
    public int a;
    public mvm b;
    public boolean c;
    public long d;
    public boolean e;

    static {
        muo muoVar = new muo();
        f = muoVar;
        nfm.L(muo.class, muoVar);
    }

    private muo() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0005ဇ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new muo();
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
                synchronized (muo.class) {
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
