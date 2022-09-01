package defpackage;

/* compiled from: PG */
/* renamed from: ggy  reason: default package */
/* loaded from: classes.dex */
public final class ggy extends nfm implements nha {
    public static final ggy h;
    private static volatile nhf j;
    public int a;
    public int b;
    public long c;
    public long d;
    public boolean g;
    private byte i = 2;
    public String e = "";
    public String f = "";

    static {
        ggy ggyVar = new ggy();
        h = ggyVar;
        nfm.L(ggy.class, ggyVar);
    }

    private ggy() {
        nfn nfnVar = nfn.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0001\u0001ᔌ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဈ\u0003\u0007ဈ\u0005\bဇ\u0006", new Object[]{"a", "b", ggq.k, "c", "d", "e", "f", "g"});
            }
            if (i2 == 3) {
                return new ggy();
            }
            if (i2 == 4) {
                return new nfh(h);
            }
            if (i2 == 5) {
                return h;
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
                synchronized (ggy.class) {
                    nhfVar = j;
                    if (nhfVar == null) {
                        nhfVar = new nfi(h);
                        j = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.i);
    }
}
