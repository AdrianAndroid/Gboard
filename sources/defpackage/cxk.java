package defpackage;

/* compiled from: PG */
/* renamed from: cxk  reason: default package */
/* loaded from: classes.dex */
public final class cxk extends nfm implements nha {
    public static final cxk d;
    private static volatile nhf e;
    public int a;
    public String b = "";
    public long c;

    static {
        cxk cxkVar = new cxk();
        d = cxkVar;
        nfm.L(cxk.class, cxkVar);
    }

    private cxk() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new cxk();
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
                synchronized (cxk.class) {
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
