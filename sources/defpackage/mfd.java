package defpackage;

/* compiled from: PG */
/* renamed from: mwm  reason: default package */
/* loaded from: classes2.dex */
public final class mwm extends nfm implements nha {
    public static final mwm b;
    private static volatile nhf d;
    private byte c = 2;
    public nga a = nhi.b;

    static {
        mwm mwmVar = new mwm();
        b = mwmVar;
        nfm.L(mwm.class, mwmVar);
    }

    private mwm() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", mwl.class});
            }
            if (i2 == 3) {
                return new mwm();
            }
            if (i2 == 4) {
                return new nfh(b);
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
                synchronized (mwm.class) {
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
}fVar;
        }
        return Byte.valueOf(this.e);
    }
}
