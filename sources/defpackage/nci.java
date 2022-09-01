package defpackage;

/* compiled from: PG */
/* renamed from: nci  reason: default package */
/* loaded from: classes2.dex */
public final class nci extends nfm implements nha {
    public static final nci d;
    private static volatile nhf e;
    public int a;
    public int b;
    public ncj c;

    static {
        nci nciVar = new nci();
        d = nciVar;
        nfm.L(nci.class, nciVar);
    }

    private nci() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", mpq.a, "c"});
            }
            if (i2 == 3) {
                return new nci();
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
            nhf nhfVar = e;
            if (nhfVar == null) {
                synchronized (nci.class) {
                    nhfVar = e;
                    if (nhfVar == null) {
                        nhfVar = new nfi(d);
                        e = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
