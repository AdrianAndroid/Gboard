package defpackage;

/* compiled from: PG */
/* renamed from: cmk  reason: default package */
/* loaded from: classes.dex */
public final class cmk extends nfm implements nha {
    public static final cmk c;
    private static volatile nhf d;
    public String a = "";
    public cmj b;

    static {
        cmk cmkVar = new cmk();
        c = cmkVar;
        nfm.L(cmk.class, cmkVar);
    }

    private cmk() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new cmk();
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
                synchronized (cmk.class) {
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
