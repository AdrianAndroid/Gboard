package defpackage;

/* compiled from: PG */
/* renamed from: cky  reason: default package */
/* loaded from: classes.dex */
public final class cky extends nfm implements nha {
    public static final cky d;
    private static volatile nhf e;
    public int a;
    public nga b = nhi.b;
    public long c;

    static {
        cky ckyVar = new cky();
        d = ckyVar;
        nfm.L(cky.class, ckyVar);
    }

    private cky() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000", new Object[]{"a", "b", cks.class, "c"});
            }
            if (i2 == 3) {
                return new cky();
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
                synchronized (cky.class) {
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
