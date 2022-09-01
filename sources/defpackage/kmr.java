package defpackage;

/* compiled from: PG */
/* renamed from: kmr  reason: default package */
/* loaded from: classes.dex */
public final class kmr extends nfm implements nha {
    public static final kmr d;
    private static volatile nhf f;
    public kmv a;
    public String b = "";
    public String c = "";
    private int e;

    static {
        kmr kmrVar = new kmr();
        d = kmrVar;
        nfm.L(kmr.class, kmrVar);
    }

    private kmr() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new kmr();
            }
            if (i2 == 4) {
                return new nfh(d);
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (kmr.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
