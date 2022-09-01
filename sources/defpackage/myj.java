package defpackage;

/* compiled from: PG */
/* renamed from: myj  reason: default package */
/* loaded from: classes2.dex */
public final class myj extends nfm implements nha {
    public static final myj c;
    private static volatile nhf e;
    public String a = "";
    public int b = 100;
    private int d;

    static {
        myj myjVar = new myj();
        c = myjVar;
        nfm.L(myj.class, myjVar);
    }

    private myj() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new myj();
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
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (myj.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
