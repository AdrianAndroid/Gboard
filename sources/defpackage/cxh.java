package defpackage;

/* compiled from: PG */
/* renamed from: cxh  reason: default package */
/* loaded from: classes.dex */
public final class cxh extends nfm implements nha {
    public static final cxh d;
    private static volatile nhf e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        cxh cxhVar = new cxh();
        d = cxhVar;
        nfm.L(cxh.class, cxhVar);
    }

    private cxh() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new cxh();
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
                synchronized (cxh.class) {
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
