package defpackage;

/* compiled from: PG */
/* renamed from: myb  reason: default package */
/* loaded from: classes2.dex */
public final class myb extends nfm implements nha {
    public static final myb f;
    private static volatile nhf h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    private int g;

    static {
        myb mybVar = new myb();
        f = mybVar;
        nfm.L(myb.class, mybVar);
    }

    private myb() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"g", "a", mxe.g, "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new myb();
            }
            if (i2 == 4) {
                return new nfh(f);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = h;
            if (nhfVar == null) {
                synchronized (myb.class) {
                    nhfVar = h;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        h = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
