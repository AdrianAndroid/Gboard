package defpackage;

/* compiled from: PG */
/* renamed from: mze  reason: default package */
/* loaded from: classes2.dex */
public final class mze extends nfm implements nha {
    public static final mze A;
    private static volatile nhf B;
    public long a;
    public long b;
    public long c;
    public boolean d;
    public boolean e;
    public long f;
    public boolean g;
    public boolean h;
    public long i;
    public long j;
    public long k;
    public float l;
    public long m;
    public float n;
    public nfs o = nfn.b;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public boolean z;

    static {
        mze mzeVar = new mze();
        A = mzeVar;
        nfm.L(mze.class, mzeVar);
    }

    private mze() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(A, "\u0000\u001a\u0000\u0000\u00014\u001a\u0000\u0001\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0007\b\u0002\f\u0007\u0012\u0007\u0014\u0002\u0015\u0002\u0019\u0002\u001a\u0001\u001b\u0002\u001c\u0001\u001d''\u0007)\u0007*\u0007,\u0007-\u0004/\u00070\u00071\u00072\u00073\u00044\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"});
            }
            if (i2 == 3) {
                return new mze();
            }
            if (i2 == 4) {
                return new nfh((int[][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return A;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = B;
            if (nhfVar == null) {
                synchronized (mze.class) {
                    nhfVar = B;
                    if (nhfVar == null) {
                        nhfVar = new nfi(A);
                        B = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
