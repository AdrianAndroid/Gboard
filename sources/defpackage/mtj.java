package defpackage;

/* compiled from: PG */
/* renamed from: mtj  reason: default package */
/* loaded from: classes2.dex */
public final class mtj extends nfm implements nha {
    public static final mtj d;
    private static volatile nhf e;
    public int a;
    public boolean b;
    public int c;

    static {
        mtj mtjVar = new mtj();
        d = mtjVar;
        nfm.L(mtj.class, mtjVar);
    }

    private mtj() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new mtj();
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
                synchronized (mtj.class) {
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
