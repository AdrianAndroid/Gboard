package defpackage;

/* compiled from: PG */
/* renamed from: mys  reason: default package */
/* loaded from: classes2.dex */
public final class mys extends nfm implements nha {
    public static final mys d;
    private static volatile nhf e;
    public int a;
    public myq b;
    public String c = "";

    static {
        mys mysVar = new mys();
        d = mysVar;
        nfm.L(mys.class, mysVar);
    }

    private mys() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003Ȉ", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new mys();
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
                synchronized (mys.class) {
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
