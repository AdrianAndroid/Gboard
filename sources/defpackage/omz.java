package defpackage;

/* compiled from: PG */
/* renamed from: omz  reason: default package */
/* loaded from: classes2.dex */
public final class omz extends nfm implements nha {
    public static final omz e;
    private static volatile nhf f;
    public int a;
    public nga b = nhi.b;
    public ona c;
    public int d;

    static {
        omz omzVar = new omz();
        e = omzVar;
        nfm.L(omz.class, omzVar);
    }

    private omz() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003င\u0001", new Object[]{"a", "b", omy.class, "c", "d"});
            }
            if (i2 == 3) {
                return new omz();
            }
            if (i2 == 4) {
                return new nfh((byte[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (omz.class) {
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
