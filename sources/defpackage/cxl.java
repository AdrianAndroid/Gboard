package defpackage;

/* compiled from: PG */
/* renamed from: cxl  reason: default package */
/* loaded from: classes.dex */
public final class cxl extends nfm implements nha {
    public static final cxl d;
    private static volatile nhf e;
    public nga a;
    public nga b;
    public nga c;

    static {
        cxl cxlVar = new cxl();
        d = cxlVar;
        nfm.L(cxl.class, cxlVar);
    }

    private cxl() {
        nhi nhiVar = nhi.b;
        this.a = nhiVar;
        this.b = nhiVar;
        this.c = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"a", cxk.class, "b", cxk.class, "c", cxk.class});
            }
            if (i2 == 3) {
                return new cxl();
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
                synchronized (cxl.class) {
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
