package defpackage;

/* compiled from: PG */
/* renamed from: mue  reason: default package */
/* loaded from: classes2.dex */
public final class mue extends nfm implements nha {
    public static final mue c;
    private static volatile nhf e;
    public String a = "";
    public boolean b;
    private int d;

    static {
        mue mueVar = new mue();
        c = mueVar;
        nfm.L(mue.class, mueVar);
    }

    private mue() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0001\u0007\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0007ဇ\u0005", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new mue();
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
                synchronized (mue.class) {
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
