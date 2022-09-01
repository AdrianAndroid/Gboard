package defpackage;

/* compiled from: PG */
/* renamed from: moz  reason: default package */
/* loaded from: classes2.dex */
public final class moz extends nfm implements nha {
    public static final moz c;
    private static volatile nhf f;
    public int b;
    private int d;
    private ngu e = ngu.a;
    public String a = "";

    static {
        moz mozVar = new moz();
        c = mozVar;
        nfm.L(moz.class, mozVar);
    }

    private moz() {
        nhi nhiVar = nhi.b;
        nfn nfnVar = nfn.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0003\u0000\u0001\u0001\u0015\u0003\u0001\u0000\u0000\u0001ဈ\u0000\u0004င\u0002\u0015࠲", new Object[]{"d", "a", "b", "e", moy.a, mxe.q});
            }
            if (i2 == 3) {
                return new moz();
            }
            if (i2 == 4) {
                return new nfh(c);
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (moz.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
