package defpackage;

/* compiled from: PG */
/* renamed from: mbg  reason: default package */
/* loaded from: classes.dex */
public final class mbg extends nfm implements nha {
    public static final mbg d;
    private static volatile nhf e;
    public int a;
    public String b = "";
    public mbb c;

    static {
        mbg mbgVar = new mbg();
        d = mbgVar;
        nfm.L(mbg.class, mbgVar);
    }

    private mbg() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0003\n\u0002\u0000\u0000\u0000\u0003ဈ\u0002\nဉ\t", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new mbg();
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
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (mbg.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
