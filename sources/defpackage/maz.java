package defpackage;

/* compiled from: PG */
/* renamed from: maz  reason: default package */
/* loaded from: classes.dex */
public final class maz extends nfm implements nha {
    public static final maz k;
    private static volatile nhf l;
    public int a;
    public long b;
    public int c;
    public int d;
    public long e;
    public long f;
    public int g;
    public boolean h;
    public String i = "";
    public max j;

    static {
        maz mazVar = new maz();
        k = mazVar;
        nfm.L(maz.class, mazVar);
    }

    private maz() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဌ\u0005\u0007ဇ\u0006\bဈ\u0007\tဉ\b", new Object[]{"a", "b", "c", maw.c, "d", maw.d, "e", "f", "g", may.c(), "h", "i", "j"});
            }
            if (i2 == 3) {
                return new maz();
            }
            if (i2 == 4) {
                return new nfh(k);
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = l;
            if (nhfVar == null) {
                synchronized (maz.class) {
                    nhfVar = l;
                    if (nhfVar == null) {
                        nhfVar = new nfi(k);
                        l = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
