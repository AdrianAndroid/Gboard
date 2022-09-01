package defpackage;

/* compiled from: PG */
/* renamed from: onx  reason: default package */
/* loaded from: classes2.dex */
public final class onx extends nfm implements nha {
    public static final onx b;
    private static volatile nhf f;
    private int c;
    private ooa d;
    private byte e = 2;
    public nga a = nhi.b;

    static {
        onx onxVar = new onx();
        b = onxVar;
        nfm.L(onx.class, onxVar);
    }

    private onx() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return K(b, "\u0001\u0002\u0000\u0001\u0002\u0006\u0002\u0000\u0001\u0001\u0002Л\u0006ဉ\u0004", new Object[]{"c", "a", ony.class, "d"});
            }
            if (i2 == 3) {
                return new onx();
            }
            if (i2 == 4) {
                return new nfh((byte[][]) null);
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (onx.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.e);
    }
}
