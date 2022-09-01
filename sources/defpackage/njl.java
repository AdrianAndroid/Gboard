package defpackage;

/* compiled from: PG */
/* renamed from: njl  reason: default package */
/* loaded from: classes2.dex */
public final class njl extends nfm implements nha {
    public static final njl j;
    private static volatile nhf k;
    public int a;
    public njj b;
    public boolean c;
    public boolean d;
    public long e;
    public int f;
    public nga g = nhi.b;
    public boolean h;
    public boolean i;

    static {
        njl njlVar = new njl();
        j = njlVar;
        nfm.L(njl.class, njlVar);
    }

    private njl() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0006ဂ\u0005\u0007င\u0006\b\u001b\tဇ\u0007\nဇ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", njk.class, "h", "i"});
            }
            if (i2 == 3) {
                return new njl();
            }
            if (i2 == 4) {
                return new nfh((short[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = k;
            if (nhfVar == null) {
                synchronized (njl.class) {
                    nhfVar = k;
                    if (nhfVar == null) {
                        nhfVar = new nfi(j);
                        k = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
