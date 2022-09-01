package defpackage;

/* compiled from: PG */
/* renamed from: njo  reason: default package */
/* loaded from: classes2.dex */
public final class njo extends nfk implements nha {
    public static final njo b;
    private static volatile nhf f;
    private int c;
    private byte e = 2;
    public float a = 25.0f;

    static {
        njo njoVar = new njo();
        b = njoVar;
        nfm.L(njo.class, njoVar);
    }

    private njo() {
        nfn nfnVar = nfn.b;
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return K(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ခ\u0003", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new njo();
            }
            if (i2 == 4) {
                return new nfj(b);
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
                synchronized (njo.class) {
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
