package defpackage;

/* compiled from: PG */
/* renamed from: kiu  reason: default package */
/* loaded from: classes.dex */
public final class kiu extends nfm implements nha {
    public static final kiu j;
    private static volatile nhf l;
    public int a;
    public onl b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public onm i;
    private byte k = 2;
    public String h = "";

    static {
        kiu kiuVar = new kiu();
        j = kiuVar;
        nfm.L(kiu.class, kiuVar);
    }

    private kiu() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return K(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005စ\u0004\u0006င\u0005\u0007ဈ\u0006\tᐉ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new kiu();
            }
            if (i2 == 4) {
                return new nfh(j);
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            }
            nhf nhfVar = l;
            if (nhfVar == null) {
                synchronized (kiu.class) {
                    nhfVar = l;
                    if (nhfVar == null) {
                        nhfVar = new nfi(j);
                        l = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return Byte.valueOf(this.k);
    }
}
