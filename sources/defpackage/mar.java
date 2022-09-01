package defpackage;

/* compiled from: PG */
/* renamed from: mar  reason: default package */
/* loaded from: classes.dex */
public final class mar extends nfm implements nha {
    public static final mar e;
    private static volatile nhf f;
    public int a;
    public String b = "";
    public nga c = nhi.b;
    public boolean d;

    static {
        mar marVar = new mar();
        e = marVar;
        nfm.L(mar.class, marVar);
    }

    private mar() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဇ\u0001", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new mar();
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
                synchronized (mar.class) {
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
