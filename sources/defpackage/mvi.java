package defpackage;

/* compiled from: PG */
/* renamed from: mvi  reason: default package */
/* loaded from: classes2.dex */
public final class mvi extends nfm implements nha {
    public static final mvi K;
    private static volatile nhf M;
    public mqi A;
    public int B;
    public boolean C;
    public mvf D;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    private boolean L;
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public mvg g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean m;
    public int n;
    public boolean o;
    public mvh p;
    public boolean q;
    public boolean r;
    public int s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public int z;
    public String l = "";
    public boolean E = true;
    public int F = -1;

    static {
        mvi mviVar = new mvi();
        K = mviVar;
        nfm.L(mvi.class, mviVar);
    }

    private mvi() {
    }

    public static /* synthetic */ void b(mvi mviVar) {
        mviVar.a |= 131072;
        mviVar.L = false;
    }

    public static /* synthetic */ void c(mvi mviVar) {
        mviVar.a |= Integer.MIN_VALUE;
        mviVar.E = false;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(K, "\u0001#\u0000\u0002\u00012#\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0005\u0003ဇ\u0006\u0004ဇ\u0007\u0005ဇ\b\u0006ဇ\n\u0007ဌ\f\bဇ\r\tဉ\u000e\u000bဇ\u0010\fဇ\u0011\rဌ\u0013\u000eဇ\u0014\u0010င\u0015\u0011င\u0016\u0012င\u0017\u0013င\u0018\u0014ဇ\u0019\u0016င\u001a\u0019ဉ\u001b\u001aဇ\u0012\u001dဌ\u001c\u001fဇ\u001d ဉ\u001e\"ဇ\u001f#ဇ\u0001$င %ဇ\"&ဇ#'ဇ\u0002*ဈ\t/ဇ\u00030ဇ$1င!2ဉ\u0004", new Object[]{"a", "b", "c", "h", "i", "j", "k", "m", "n", msb.n, "o", "p", "q", "L", "s", msb.o, "t", "u", "v", "w", "x", "y", "z", "A", "r", "B", msb.p, "C", "D", "E", "d", "F", "H", "I", "e", "l", "f", "J", "G", "g"});
            }
            if (i2 == 3) {
                return new mvi();
            }
            if (i2 == 4) {
                return new nfh(K);
            }
            if (i2 == 5) {
                return K;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = M;
            if (nhfVar == null) {
                synchronized (mvi.class) {
                    nhfVar = M;
                    if (nhfVar == null) {
                        nhfVar = new nfi(K);
                        M = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
