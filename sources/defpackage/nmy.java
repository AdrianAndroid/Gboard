package defpackage;

/* compiled from: PG */
/* renamed from: nmy  reason: default package */
/* loaded from: classes2.dex */
public final class nmy extends nfk implements nha {
    public static final nmy e;
    public static final ngt f;
    private static volatile nhf i;
    public Object b;
    private int g;
    public int a = 0;
    private byte h = 2;
    public String c = "";

    static {
        nmy nmyVar = new nmy();
        e = nmyVar;
        nfm.L(nmy.class, nmyVar);
        f = nfm.P(nkt.c, nmyVar, nmyVar, 1253625, nik.MESSAGE);
    }

    private nmy() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return K(e, "\u0001\u000e\u0001\u0001\u0001\u0010\u000e\u0000\u0000\u0003\u0001ᐼ\u0000\u0002ြ\u0000\u0003ဈ\r\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bᐼ\u0000\fြ\u0000\rြ\u0000\u000fြ\u0000\u0010ᐼ\u0000", new Object[]{"b", "a", "g", nkh.class, njz.class, "c", njw.class, njy.class, nke.class, nmx.class, njx.class, nmw.class, njf.class, njd.class, nnb.class, nkb.class, nje.class});
            }
            if (i3 == 3) {
                return new nmy();
            }
            if (i3 == 4) {
                return new nfj(e);
            }
            if (i3 == 5) {
                return e;
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
                synchronized (nmy.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.h);
    }
}
