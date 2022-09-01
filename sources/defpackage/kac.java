package defpackage;

/* compiled from: PG */
/* renamed from: kac  reason: default package */
/* loaded from: classes.dex */
public final class kac extends nfm implements nha {
    public static final kac g;
    private static volatile nhf j;
    public Object b;
    public kag e;
    public boolean f;
    public int a = 0;
    private ngu h = ngu.a;
    private byte i = 2;
    public String c = "";
    public String d = "";

    static {
        kac kacVar = new kac();
        g = kacVar;
        nfm.L(kac.class, kacVar);
    }

    private kac() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(g, "\u0000\u0007\u0001\u0000\u0001\b\u0007\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t\u0004<\u0000\u0005<\u0000\u0007\u0007\b2", new Object[]{"b", "a", "c", "d", "e", kaf.class, kae.class, "f", "h", kab.a});
            }
            if (i2 == 3) {
                return new kac();
            }
            if (i2 == 4) {
                return new nfh(g);
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            nhf nhfVar = j;
            if (nhfVar == null) {
                synchronized (kac.class) {
                    nhfVar = j;
                    if (nhfVar == null) {
                        nhfVar = new nfi(g);
                        j = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.i);
    }
}
