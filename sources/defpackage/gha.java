package defpackage;

/* compiled from: PG */
/* renamed from: gha  reason: default package */
/* loaded from: classes.dex */
public final class gha extends nfm implements nha {
    public static final gha e;
    private static volatile nhf g;
    public int a;
    public long c;
    public ghb d;
    private byte f = 2;
    public int b = 1;

    static {
        gha ghaVar = new gha();
        e = ghaVar;
        nfm.L(gha.class, ghaVar);
    }

    private gha() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔌ\u0000\u0002ဃ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", ggz.c(), "c", "d"});
            }
            if (i2 == 3) {
                return new gha();
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
                synchronized (gha.class) {
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
