package defpackage;

/* compiled from: PG */
/* renamed from: myf  reason: default package */
/* loaded from: classes2.dex */
public final class myf extends nfm implements nha {
    public static final myf c;
    private static volatile nhf e;
    public String a = "";
    public myc b;
    private int d;

    static {
        myf myfVar = new myf();
        c = myfVar;
        nfm.L(myf.class, myfVar);
    }

    private myf() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new myf();
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
                synchronized (myf.class) {
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
