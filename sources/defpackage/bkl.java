package defpackage;

/* compiled from: PG */
/* renamed from: bkl  reason: default package */
/* loaded from: classes.dex */
public final class bkl extends nfm implements nha {
    public static final bkl x;
    private static volatile nhf y;
    public boolean c;
    public int d;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public fhs s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public nga a = nhi.b;
    public String b = "";
    public String e = "";
    public String m = "";

    static {
        bkl bklVar = new bkl();
        x = bklVar;
        nfm.L(bkl.class, bklVar);
    }

    private bkl() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(x, "\u0000\u0017\u0000\u0000\u0001\u001b\u0017\u0000\u0001\u0000\u0001Ț\u0002\u0004\u0003\u0004\u0004\u0007\u0005\u0007\u0006\u0002\u0007\u0007\b\u0007\t\u0007\u000bȈ\f\u0007\u000eȈ\u000f\t\u0010\u0007\u0011\u0007\u0012\u0007\u0013Ȉ\u0014\u0007\u0017\u0007\u0018\u0007\u0019\u0007\u001a\u0007\u001b\u0007", new Object[]{"a", "d", "h", "i", "j", "l", "n", "o", "f", "b", "g", "e", "s", "t", "u", "v", "m", "q", "p", "r", "c", "k", "w"});
            }
            if (i2 == 3) {
                return new bkl();
            }
            if (i2 == 4) {
                return new nfh(x);
            }
            if (i2 == 5) {
                return x;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = y;
            if (nhfVar == null) {
                synchronized (bkl.class) {
                    nhfVar = y;
                    if (nhfVar == null) {
                        nhfVar = new nfi(x);
                        y = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
