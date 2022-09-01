package defpackage;

/* compiled from: PG */
/* renamed from: mcx  reason: default package */
/* loaded from: classes.dex */
public final class mcx extends nfm implements nha {
    public static final mcx l;
    private static volatile nhf m;
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;

    static {
        mcx mcxVar = new mcx();
        l = mcxVar;
        nfm.L(mcx.class, mcxVar);
    }

    private mcx() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            }
            if (i2 == 3) {
                return new mcx();
            }
            if (i2 == 4) {
                return new nfh(l);
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = m;
            if (nhfVar == null) {
                synchronized (mcx.class) {
                    nhfVar = m;
                    if (nhfVar == null) {
                        nhfVar = new nfi(l);
                        m = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
