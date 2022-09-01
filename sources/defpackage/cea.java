package defpackage;

/* compiled from: PG */
/* renamed from: cea  reason: default package */
/* loaded from: classes.dex */
public final class cea extends nfm implements nha {
    public static final cea c;
    private static volatile nhf e;
    public String a = "";
    public nga b = nhi.b;
    private int d;

    static {
        cea ceaVar = new cea();
        c = ceaVar;
        nfm.L(cea.class, ceaVar);
    }

    private cea() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new cea();
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
                synchronized (cea.class) {
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
