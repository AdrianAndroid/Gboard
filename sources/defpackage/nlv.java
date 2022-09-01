package defpackage;

/* compiled from: PG */
/* renamed from: nlv  reason: default package */
/* loaded from: classes2.dex */
public final class nlv extends nfk implements nha {
    public static final nlv c;
    private static volatile nhf h;
    public nmd b;
    private int e;
    private nmc f;
    private byte g = 2;
    public nga a = nhi.b;

    static {
        nlv nlvVar = new nlv();
        c = nlvVar;
        nfm.L(nlv.class, nlvVar);
    }

    private nlv() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(c, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"e", "a", "f", "b"});
            }
            if (i2 == 3) {
                return new nlv();
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
                this.g = b;
                return null;
            }
            nhf nhfVar = h;
            if (nhfVar == null) {
                synchronized (nlv.class) {
                    nhfVar = h;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        h = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.g);
    }
}
