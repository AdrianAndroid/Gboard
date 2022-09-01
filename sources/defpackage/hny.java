package defpackage;

/* compiled from: PG */
/* renamed from: hny */
/* loaded from: classes.dex */
public final class hny extends nfm implements nha {
    public static final hny g;
    private static volatile nhf i;
    public int a;
    public float c;
    public float d;
    public int e;
    private byte h = 2;
    public String b = "";
    public String f = "";

    static {
        hny hnyVar = new hny();
        g = hnyVar;
        nfm.L(hny.class, hnyVar);
    }

    private hny() {
    }

    public static /* synthetic */ void b(hny hnyVar) {
        hnyVar.a |= 16;
        hnyVar.f = "google-sans-text";
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new hny();
            }
            if (i3 == 4) {
                return new nfh(g);
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
                synchronized (hny.class) {
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
