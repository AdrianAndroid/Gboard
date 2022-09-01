package defpackage;

/* compiled from: PG */
/* renamed from: nmr  reason: default package */
/* loaded from: classes2.dex */
public final class nmr extends nfm implements nha {
    public static final nmr e;
    private static volatile nhf g;
    public int a;
    public Object c;
    public int b = 0;
    private byte f = 2;
    public String d = "";

    static {
        nmr nmrVar = new nmr();
        e = nmrVar;
        nfm.L(nmr.class, nmrVar);
    }

    private nmr() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ြ\u0000\u0003ᐼ\u0000", new Object[]{"c", "b", "a", "d", nmq.class, nmo.class});
            }
            if (i2 == 3) {
                return new nmr();
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
                synchronized (nmr.class) {
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
