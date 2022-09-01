package defpackage;

/* compiled from: PG */
/* renamed from: bkn  reason: default package */
/* loaded from: classes.dex */
public final class bkn extends nfm implements nha {
    public static final bkn c;
    private static volatile nhf d;
    public int a = 0;
    public Object b;

    static {
        bkn bknVar = new bkn();
        c = bknVar;
        nfm.L(bkn.class, bknVar);
    }

    private bkn() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0000\u000b\u0001\u0000\u0001\r\u000b\u0000\u0000\u0000\u0001<\u0000\u0003<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000", new Object[]{"b", "a", bkr.class, bkr.class, bkr.class, bkr.class, bks.class, fid.class, fid.class, bkr.class, bkm.class, bki.class, bkr.class});
            }
            if (i2 == 3) {
                return new bkn();
            }
            if (i2 == 4) {
                return new nfh(c);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (bkn.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
