package defpackage;

/* compiled from: PG */
/* renamed from: msv  reason: default package */
/* loaded from: classes2.dex */
public final class msv extends nfm implements nha {
    public static final msv j;
    private static volatile nhf l;
    public int a;
    public nga b = nhi.b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    private int k;

    static {
        msv msvVar = new msv();
        j = msvVar;
        nfm.L(msv.class, msvVar);
    }

    private msv() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(j, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001ဌ\u0001\u0002\u001b\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\nဇ\n", new Object[]{"k", "a", mtv.c(), "b", muc.class, "c", "d", "e", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new msv();
            }
            if (i2 == 4) {
                return new nfh(j);
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = l;
            if (nhfVar == null) {
                synchronized (msv.class) {
                    nhfVar = l;
                    if (nhfVar == null) {
                        nhfVar = new nfi(j);
                        l = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
