package defpackage;

/* compiled from: PG */
/* renamed from: gvr  reason: default package */
/* loaded from: classes.dex */
public final class gvr extends nfm implements nha {
    public static final gvr d;
    private static volatile nhf e;
    public int a;
    public String b = "";
    public nga c = nhi.b;

    static {
        gvr gvrVar = new gvr();
        d = gvrVar;
        nfm.L(gvr.class, gvrVar);
    }

    private gvr() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", "c", gvq.class});
            }
            if (i2 == 3) {
                return new gvr();
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
                synchronized (gvr.class) {
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
