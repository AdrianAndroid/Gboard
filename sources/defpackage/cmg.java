package defpackage;

/* compiled from: PG */
/* renamed from: cmg  reason: default package */
/* loaded from: classes.dex */
public final class cmg extends nfm implements nha {
    public static final cmg e;
    private static volatile nhf f;
    public int a;
    public int c;
    public String b = "";
    public String d = "";

    static {
        cmg cmgVar = new cmg();
        e = cmgVar;
        nfm.L(cmg.class, cmgVar);
    }

    private cmg() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\u000b\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new cmg();
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
                synchronized (cmg.class) {
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
