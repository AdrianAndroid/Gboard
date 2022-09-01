package defpackage;

/* compiled from: PG */
/* renamed from: nng  reason: default package */
/* loaded from: classes2.dex */
public final class nng extends nfm implements nha {
    public static final nng e;
    private static volatile nhf g;
    public int a;
    public nne d;
    private byte f = 2;
    public String b = "";
    public String c = "";

    static {
        nng nngVar = new nng();
        e = nngVar;
        nfm.L(nng.class, nngVar);
    }

    private nng() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\b\u000b\u0003\u0000\u0000\u0000\bဈ\u0000\nဈ\u0002\u000bဉ\u0003", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new nng();
            }
            if (i2 == 4) {
                return new nfh(e);
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
                synchronized (nng.class) {
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
