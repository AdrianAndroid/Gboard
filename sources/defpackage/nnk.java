package defpackage;

/* compiled from: PG */
/* renamed from: nnk  reason: default package */
/* loaded from: classes2.dex */
public final class nnk extends nfm implements nha {
    public static final nnk e;
    private static volatile nhf f;
    public int a;
    public String b = "";
    public String c = "";
    public nns d;

    static {
        nnk nnkVar = new nnk();
        e = nnkVar;
        nfm.L(nnk.class, nnkVar);
    }

    private nnk() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဉ\u0003", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new nnk();
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
                synchronized (nnk.class) {
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
