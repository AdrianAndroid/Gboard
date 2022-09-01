package defpackage;

/* compiled from: PG */
/* renamed from: nko  reason: default package */
/* loaded from: classes2.dex */
public final class nko extends nfk implements nha {
    public static final nko g;
    private static volatile nhf i;
    public int a;
    public int b;
    public boolean c;
    private byte h = 2;
    public String e = "";
    public String f = "";

    static {
        nko nkoVar = new nko();
        g = nkoVar;
        nfm.L(nko.class, nkoVar);
    }

    private nko() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return K(g, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဈ\u0002\u0002ဈ\u0003\u0004င\u0000\u0007ဇ\u0001", new Object[]{"a", "e", "f", "b", "c"});
            }
            if (i3 == 3) {
                return new nko();
            }
            if (i3 == 4) {
                return new nfj(g);
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (nko.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(g);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.h);
    }
}
