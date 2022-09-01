package defpackage;

/* compiled from: PG */
/* renamed from: hyb  reason: default package */
/* loaded from: classes.dex */
public final class hyb extends nfm implements nha {
    public static final hyb l;
    private static volatile nhf m;
    public int a;
    public boolean b;
    public boolean c;
    public long d;
    public nga e = nhi.b;
    public boolean f;
    public int g;
    public boolean h;
    public int i;
    public boolean j;
    public int k;

    static {
        hyb hybVar = new hyb();
        l = hybVar;
        nfm.L(hyb.class, hybVar);
    }

    private hyb() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004\u001a\u0006ဇ\u0004\u0007ဌ\u0005\bဇ\u0006\tင\u0007\nဇ\b\u000bင\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", hyd.c(), "h", "i", "j", "k"});
            }
            if (i2 == 3) {
                return new hyb();
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
                synchronized (hyb.class) {
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
