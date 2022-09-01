package defpackage;

/* compiled from: PG */
/* renamed from: chp  reason: default package */
/* loaded from: classes.dex */
public final class chp extends nfm implements nha {
    public static final chp k;
    private static volatile nhf l;
    public int a;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public int j;

    static {
        chp chpVar = new chp();
        k = chpVar;
        nfm.L(chp.class, chpVar);
    }

    private chp() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဌ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", mbr.c()});
            }
            if (i2 == 3) {
                return new chp();
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
                synchronized (chp.class) {
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
