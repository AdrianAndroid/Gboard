package defpackage;

/* compiled from: PG */
/* renamed from: kig  reason: default package */
/* loaded from: classes.dex */
public final class kig extends nfk implements nha {
    public static final kig c;
    private static volatile nhf f;
    public int a;
    public oos b;
    private byte e = 2;

    static {
        kig kigVar = new kig();
        c = kigVar;
        nfm.L(kig.class, kigVar);
    }

    private kig() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new kig();
            }
            if (i2 == 4) {
                return new nfj(c);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (kig.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.e);
    }
}
