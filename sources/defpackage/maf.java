package defpackage;

/* compiled from: PG */
/* renamed from: maf  reason: default package */
/* loaded from: classes.dex */
public final class maf extends nfm implements nha {
    public static final maf o;
    private static volatile nhf p;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public mbu h;
    public boolean i;
    public int j;
    public int k;
    public nga l = nhi.b;
    public int m;
    public int n;

    static {
        maf mafVar = new maf();
        o = mafVar;
        nfm.L(maf.class, mafVar);
    }

    private maf() {
        nff nffVar = nff.b;
        nfn nfnVar = nfn.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(o, "\u0001\r\u0000\u0001\u0001\u0018\r\u0000\u0001\u0000\u0001င\u0000\u0004င\u0003\u0007င\u0007\bဇ\f\tင\u0005\nင\u0006\u000bင\b\rင\u000e\u000eင\u000f\u000f\u001b\u0010င\u0010\u0011င\u0011\u0018ဉ\n", new Object[]{"a", "b", "c", "f", "i", "d", "e", "g", "j", "k", "l", mei.class, "m", "n", "h"});
            }
            if (i2 == 3) {
                return new maf();
            }
            if (i2 == 4) {
                return new nfh(o);
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = p;
            if (nhfVar == null) {
                synchronized (maf.class) {
                    nhfVar = p;
                    if (nhfVar == null) {
                        nhfVar = new nfi(o);
                        p = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
