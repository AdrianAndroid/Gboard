package defpackage;

/* compiled from: PG */
/* renamed from: izr  reason: default package */
/* loaded from: classes.dex */
public final class izr extends nfm implements nha {
    public static final izr c;
    private static volatile nhf e;
    public Object b;
    public int a = 0;
    private byte d = 2;

    static {
        izr izrVar = new izr();
        c = izrVar;
        nfm.L(izr.class, izrVar);
    }

    private izr() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(c, "\u0001\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0001\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bᐼ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000", new Object[]{"b", "a", izx.class, ize.class, izn.class, iyr.class, iyj.class, iyh.class, iyq.class, iyt.class, iys.class, mxi.class, izx.class});
            }
            if (i2 == 3) {
                return new izr();
            }
            if (i2 == 4) {
                return new nfh(c);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (izr.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.d);
    }
}
