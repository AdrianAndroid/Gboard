package defpackage;

/* compiled from: PG */
/* renamed from: msg  reason: default package */
/* loaded from: classes2.dex */
public final class msg extends nfm implements nha {
    public static final msg l;
    private static volatile nhf m;
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public long k;

    static {
        msg msgVar = new msg();
        l = msgVar;
        nfm.L(msg.class, msgVar);
    }

    private msg() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004င\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဌ\u0006\bဇ\u0007\tဇ\b\nဂ\t", new Object[]{"a", "b", mtv.c(), "c", "d", "e", "f", "g", "h", msb.c, "i", "j", "k"});
            }
            if (i2 == 3) {
                return new msg();
            }
            if (i2 == 4) {
                return new nfh(l);
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = m;
            if (nhfVar == null) {
                synchronized (msg.class) {
                    nhfVar = m;
                    if (nhfVar == null) {
                        nhfVar = new nfi(l);
                        m = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
