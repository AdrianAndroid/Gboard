package defpackage;

/* compiled from: PG */
/* renamed from: nmp  reason: default package */
/* loaded from: classes2.dex */
public final class nmp extends nfk implements nha {
    public static final nmp e;
    private static volatile nhf g;
    public int a;
    public float c;
    private byte f = 2;
    public String b = "";

    static {
        nmp nmpVar = new nmp();
        e = nmpVar;
        nfm.L(nmp.class, nmpVar);
    }

    private nmp() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(e, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new nmp();
            }
            if (i2 == 4) {
                return new nfj(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (nmp.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.f);
    }
}
