package defpackage;

/* compiled from: PG */
/* renamed from: jzx  reason: default package */
/* loaded from: classes.dex */
public final class jzx extends nfm implements nha {
    public static final jzx l;
    private static volatile nhf n;
    public long a;
    public long b;
    public long c;
    public long d;
    public jzw e;
    public boolean f;
    public int g;
    public int h;
    public int j;
    public boolean k;
    private byte m = 2;
    public nga i = nhi.b;

    static {
        jzx jzxVar = new jzx();
        l = jzxVar;
        nfm.L(jzx.class, jzxVar);
    }

    private jzx() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(l, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002\u0005\t\u0006\u0007\u0007\u0004\b\u0004\t\u001b\n\u0004\u000b\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", kaa.class, "j", "k"});
            }
            if (i2 == 3) {
                return new jzx();
            }
            if (i2 == 4) {
                return new nfh(l);
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            }
            nhf nhfVar = n;
            if (nhfVar == null) {
                synchronized (jzx.class) {
                    nhfVar = n;
                    if (nhfVar == null) {
                        nhfVar = new nfi(l);
                        n = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.m);
    }
}
