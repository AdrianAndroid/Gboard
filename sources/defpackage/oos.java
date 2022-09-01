package defpackage;

/* compiled from: PG */
/* renamed from: oos  reason: default package */
/* loaded from: classes2.dex */
public final class oos extends nfm implements nha {
    public static final oos u;
    private static volatile nhf x;
    public int a;
    public long b;
    public onr e;
    public onw f;
    public oog g;
    public oon h;
    public ond i;
    public ook j;
    public onx k;
    public omz l;
    public oor m;
    public ooh n;
    public ooe p;
    public ooq q;
    public ooi r;
    public onm s;
    public ood t;
    private oof v;
    private byte w = 2;
    public String c = "";
    public String d = "";
    public nga o = nhi.b;

    static {
        oos oosVar = new oos();
        u = oosVar;
        nfm.L(oos.class, oosVar);
    }

    private oos() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(u, "\u0001\u0014\u0000\u0001\u0001\"\u0014\u0000\u0001\b\u0001ᐉ\u0003\u0002စ\u0000\u0003ဈ\u0001\u0005ဉ\u0018\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0019\tဉ\u0007\nᐉ\b\fဉ\n\u000eᐉ\u001b\u0010ᐉ\f\u0011ဈ\u0002\u0015ဉ\u001c\u0017ဉ\u001a\u001dᐉ\u0015\u001eဉ\u0016\u001fဉ\u0017 ဉ\u0013\"\u001b", new Object[]{"a", "e", "b", "c", "p", "f", "g", "q", "h", "i", "j", "s", "k", "d", "t", "r", "v", "m", "n", "l", "o", onn.class});
            }
            if (i2 == 3) {
                return new oos();
            }
            if (i2 == 4) {
                return new nfh((int[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return u;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.w = b;
                return null;
            }
            nhf nhfVar = x;
            if (nhfVar == null) {
                synchronized (oos.class) {
                    nhfVar = x;
                    if (nhfVar == null) {
                        nhfVar = new nfi(u);
                        x = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.w);
    }
}
