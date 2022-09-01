package defpackage;

/* compiled from: PG */
/* renamed from: gvq  reason: default package */
/* loaded from: classes.dex */
public final class gvq extends nfm implements nha {
    public static final gvq d;
    private static volatile nhf e;
    public int a;
    public String b = "";
    public long c;

    static {
        gvq gvqVar = new gvq();
        d = gvqVar;
        nfm.L(gvq.class, gvqVar);
    }

    private gvq() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new gvq();
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
                synchronized (gvq.class) {
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
