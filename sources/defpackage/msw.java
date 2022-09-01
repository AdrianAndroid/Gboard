package defpackage;

/* compiled from: PG */
/* renamed from: msw  reason: default package */
/* loaded from: classes2.dex */
public final class msw extends nfm implements nha {
    public static final msw h;
    private static volatile nhf i;
    public int a;
    public float b;
    public float c;
    public long d;
    public long e;
    public mtj f;
    public int g;

    static {
        msw mswVar = new msw();
        h = mswVar;
        nfm.L(msw.class, mswVar);
    }

    private msw() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0006ဉ\u0004\u0007ဌ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g", msb.t});
            }
            if (i3 == 3) {
                return new msw();
            }
            if (i3 == 4) {
                return new nfh(h);
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (msw.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(h);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
