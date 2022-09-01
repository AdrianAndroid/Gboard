package defpackage;

/* compiled from: PG */
/* renamed from: cme  reason: default package */
/* loaded from: classes.dex */
public final class cme extends nfm implements nha {
    public static final cme c;
    private static volatile nhf d;
    public String a = "";
    public nga b = nhi.b;

    static {
        cme cmeVar = new cme();
        c = cmeVar;
        nfm.L(cme.class, cmeVar);
    }

    private cme() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"a", "b", cmk.class});
            }
            if (i2 == 3) {
                return new cme();
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
            nhf nhfVar = d;
            if (nhfVar == null) {
                synchronized (cme.class) {
                    nhfVar = d;
                    if (nhfVar == null) {
                        nhfVar = new nfi(c);
                        d = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
