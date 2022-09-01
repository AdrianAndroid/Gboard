package defpackage;

/* compiled from: PG */
/* renamed from: mgx  reason: default package */
/* loaded from: classes.dex */
public final class mgx extends nfm implements nha {
    public static final mgx f;
    private static volatile nhf h;
    public int a;
    public Object c;
    public mgu d;
    public int b = 0;
    private byte g = 2;
    public nga e = nhi.b;

    static {
        mgx mgxVar = new mgx();
        f = mgxVar;
        nfm.L(mgx.class, mgxVar);
    }

    private mgx() {
    }

    public final void b() {
        nga ngaVar = this.e;
        if (!ngaVar.c()) {
            this.e = nfm.H(ngaVar);
        }
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(f, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᔉ\u0000\u0002Л\u0004ᐼ\u0000", new Object[]{"c", "b", "a", "d", "e", mgu.class, mgv.class});
            }
            if (i2 == 3) {
                return new mgx();
            }
            if (i2 == 4) {
                return new nfh(f);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            nhf nhfVar = h;
            if (nhfVar == null) {
                synchronized (mgx.class) {
                    nhfVar = h;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        h = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.g);
    }
}
