package defpackage;

/* compiled from: PG */
/* renamed from: onw  reason: default package */
/* loaded from: classes2.dex */
public final class onw extends nfm implements nha {
    public static final onw b;
    private static volatile nhf d;
    private byte c = 2;
    public nga a = nhi.b;

    static {
        onw onwVar = new onw();
        b = onwVar;
        nfm.L(onw.class, onwVar);
    }

    private onw() {
    }

    public final void c() {
        nga ngaVar = this.a;
        if (!ngaVar.c()) {
            this.a = nfm.H(ngaVar);
        }
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", onv.class});
            }
            if (i2 == 3) {
                return new onw();
            }
            if (i2 == 4) {
                return new nfh((int[][][]) null);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (onw.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.c);
    }
}
