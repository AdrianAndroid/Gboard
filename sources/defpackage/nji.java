package defpackage;

/* compiled from: PG */
/* renamed from: nji  reason: default package */
/* loaded from: classes2.dex */
public final class nji extends nfm implements nha {
    public static final nji n;
    private static volatile nhf o;
    public int a;
    public njj b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public long m;

    static {
        nji njiVar = new nji();
        n = njiVar;
        nfm.L(nji.class, njiVar);
    }

    private nji() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဌ\n\fဂ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", mxe.n, "m"});
            }
            if (i2 == 3) {
                return new nji();
            }
            if (i2 == 4) {
                return new nfh(n);
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = o;
            if (nhfVar == null) {
                synchronized (nji.class) {
                    nhfVar = o;
                    if (nhfVar == null) {
                        nhfVar = new nfi(n);
                        o = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
