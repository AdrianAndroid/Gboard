package defpackage;

/* compiled from: PG */
/* renamed from: onv  reason: default package */
/* loaded from: classes2.dex */
public final class onv extends nfm implements nha {
    public static final onv u;
    private static volatile nhf w;
    public int a;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public oob j;
    public int k;
    public ont l;
    public long m;
    public int n;
    public int o;
    public int p;
    public int q;
    private byte v = 2;
    public String b = "";
    public String c = "";
    public String r = "";
    public nfv s = ngp.b;
    public String t = "";

    static {
        onv onvVar = new onv();
        u = onvVar;
        nfm.L(onv.class, onvVar);
    }

    private onv() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(u, "\u0001\u0003\u0000\u0001\u0005\u0015\u0003\u0000\u0001\u0000\u0005င\u0005\u0011ဈ\u0013\u0015(", new Object[]{"a", "f", "r", "s"});
            }
            if (i2 == 3) {
                return new onv();
            }
            if (i2 == 4) {
                return new nfh((int[][]) null);
            }
            if (i2 == 5) {
                return u;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.v = b;
                return null;
            }
            nhf nhfVar = w;
            if (nhfVar == null) {
                synchronized (onv.class) {
                    nhfVar = w;
                    if (nhfVar == null) {
                        nhfVar = new nfi(u);
                        w = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.v);
    }
}
