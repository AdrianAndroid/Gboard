package defpackage;

/* compiled from: PG */
/* renamed from: euv  reason: default package */
/* loaded from: classes.dex */
public final class euv extends nfm implements nha {
    public static final euv g;
    private static volatile nhf h;
    public int a;
    public int c;
    public eut d;
    public int f;
    public nga b = nhi.b;
    public String e = "";

    static {
        euv euvVar = new euv();
        g = euvVar;
        nfm.L(euv.class, euvVar);
    }

    private euv() {
    }

    public final void b() {
        nga ngaVar = this.b;
        if (!ngaVar.c()) {
            this.b = nfm.H(ngaVar);
        }
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001a\u0002ဌ\u0000\u0003ဉ\u0001\u0004ဈ\u0002\u0005ဌ\u0003", new Object[]{"a", "b", "c", euu.c(), "d", "e", "f", eup.c()});
            }
            if (i2 == 3) {
                return new euv();
            }
            if (i2 == 4) {
                return new nfh(g);
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = h;
            if (nhfVar == null) {
                synchronized (euv.class) {
                    nhfVar = h;
                    if (nhfVar == null) {
                        nhfVar = new nfi(g);
                        h = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
