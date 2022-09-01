package defpackage;

/* compiled from: PG */
/* renamed from: ghe  reason: default package */
/* loaded from: classes.dex */
public final class ghe extends nfm implements nha {
    public static final ghe e;
    private static volatile nhf f;
    public int a;
    public int b;
    public nga c = nhi.b;
    public String d = "";

    static {
        ghe gheVar = new ghe();
        e = gheVar;
        nfm.L(ghe.class, gheVar);
    }

    private ghe() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002\u001a\u0003ဈ\u0001", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ghe();
            }
            if (i2 == 4) {
                return new nfh(e);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (ghe.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(e);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
