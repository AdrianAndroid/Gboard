package defpackage;

/* compiled from: PG */
/* renamed from: ggt  reason: default package */
/* loaded from: classes.dex */
public final class ggt extends nfm implements nha {
    public static final ggt f;
    private static volatile nhf h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    private byte g = 2;

    static {
        ggt ggtVar = new ggt();
        f = ggtVar;
        nfm.L(ggt.class, ggtVar);
    }

    private ggt() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ᔌ\u0000\u0002င\u0001\u0003ဌ\u0002\u0005ဋ\u0004", new Object[]{"a", "b", ggq.d, "c", "d", cgs.n, "e"});
            }
            if (i2 == 3) {
                return new ggt();
            }
            if (i2 == 4) {
                return new nfh(f);
            }
            if (i2 == 5) {
                return f;
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
                synchronized (ggt.class) {
                    nhfVar = h;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        h = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.g);
    }
}
