package defpackage;

/* compiled from: PG */
/* renamed from: nkd  reason: default package */
/* loaded from: classes2.dex */
public final class nkd extends nfm implements nha {
    public static final nkd b;
    private static volatile nhf h;
    private int c;
    private njv d;
    private njv e;
    private njv f;
    private byte g = 2;
    public nga a = nhi.b;

    static {
        nkd nkdVar = new nkd();
        b = nkdVar;
        nfm.L(nkd.class, nkdVar);
    }

    private nkd() {
        nem nemVar = nem.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return K(b, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0001\u0004\u0001Л\u0004ᐉ\u0003\u0005ᐉ\u0004\nᐉ\u0005", new Object[]{"c", "a", nkc.class, "d", "e", "f"});
            }
            if (i2 == 3) {
                return new nkd();
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
                this.g = b2;
                return null;
            }
            nhf nhfVar = h;
            if (nhfVar == null) {
                synchronized (nkd.class) {
                    nhfVar = h;
                    if (nhfVar == null) {
                        nhfVar = new nfi(b);
                        h = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.g);
    }
}
