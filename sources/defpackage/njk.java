package defpackage;

/* compiled from: PG */
/* renamed from: njk  reason: default package */
/* loaded from: classes2.dex */
public final class njk extends nfm implements nha {
    public static final njk F;
    private static volatile nhf G;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public int r;
    public int s;
    public int t;
    public float u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    static {
        njk njkVar = new njk();
        F = njkVar;
        nfm.L(njk.class, njkVar);
    }

    private njk() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(F, "\u0001\u001e\u0000\u0001\u0001\u001f\u001e\u0000\u0000\u0000\u0001ဌ\u0000\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bင\n\fင\u000b\rခ\f\u000eခ\r\u000fခ\u000e\u0010ခ\u000f\u0011ခ\u0010\u0012င\u0011\u0013င\u0012\u0014င\u0013\u0015ခ\u0014\u0016င\u0015\u0017င\u0016\u0018င\u0017\u0019င\u0018\u001aင\u0019\u001bင\u001a\u001cင\u001b\u001dင\u001c\u001eင\u001d\u001fင\u001e", new Object[]{"a", "b", njh.c(), "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E"});
            }
            if (i2 == 3) {
                return new njk();
            }
            if (i2 == 4) {
                return new nfh(F);
            }
            if (i2 == 5) {
                return F;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = G;
            if (nhfVar == null) {
                synchronized (njk.class) {
                    nhfVar = G;
                    if (nhfVar == null) {
                        nhfVar = new nfi(F);
                        G = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
