package defpackage;

/* compiled from: PG */
/* renamed from: msh  reason: default package */
/* loaded from: classes2.dex */
public final class msh extends nfm implements nha {
    public static final msh c;
    private static volatile nhf e;
    public boolean a;
    public boolean b;
    private int d;

    static {
        msh mshVar = new msh();
        c = mshVar;
        nfm.L(msh.class, mshVar);
    }

    private msh() {
        nhi nhiVar = nhi.b;
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0007\u0010\u0002\u0000\u0000\u0000\u0007ဇ\u0004\u0010ဇ\u0007", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new msh();
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
                synchronized (msh.class) {
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
