package defpackage;

/* compiled from: PG */
/* renamed from: mtd  reason: default package */
/* loaded from: classes2.dex */
public final class mtd extends nfm implements nha {
    public static final mtd d;
    private static volatile nhf f;
    public int a;
    public nga b = nhi.b;
    public boolean c;
    private int e;

    static {
        mtd mtdVar = new mtd();
        d = mtdVar;
        nfm.L(mtd.class, mtdVar);
    }

    private mtd() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"e", "a", mtv.c(), "b", mqr.class, "c"});
            }
            if (i2 == 3) {
                return new mtd();
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
            nhf nhfVar = f;
            if (nhfVar == null) {
                synchronized (mtd.class) {
                    nhfVar = f;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        f = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
