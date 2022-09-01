package defpackage;

/* compiled from: PG */
/* renamed from: mrj  reason: default package */
/* loaded from: classes2.dex */
public final class mrj extends nfm implements nha {
    public static final mrj e;
    private static volatile nhf f;
    public int a;
    public int b;
    public nga c;
    public nga d;

    static {
        mrj mrjVar = new mrj();
        e = mrjVar;
        nfm.L(mrj.class, mrjVar);
    }

    private mrj() {
        nhi nhiVar = nhi.b;
        this.c = nhiVar;
        this.d = nhiVar;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001င\u0000\u0002\u001a\u0003\u001a", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new mrj();
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
                synchronized (mrj.class) {
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
