package defpackage;

/* compiled from: PG */
/* renamed from: mej  reason: default package */
/* loaded from: classes.dex */
public final class mej extends nfm implements nha {
    public static final mej g;
    private static volatile nhf h;
    public int a;
    public int b;
    public boolean c;
    public int d;
    public nga e = nhi.b;
    public int f;

    static {
        mej mejVar = new mej();
        g = mejVar;
        nfm.L(mej.class, mejVar);
    }

    private mej() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004\u001b\u0005င\u0003", new Object[]{"a", "b", mdw.g, "c", "d", "e", meq.class, "f"});
            }
            if (i2 == 3) {
                return new mej();
            }
            if (i2 == 4) {
                return new nfh(g);
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = h;
            if (nhfVar == null) {
                synchronized (mej.class) {
                    nhfVar = h;
                    if (nhfVar == null) {
                        nhfVar = new nfi(g);
                        h = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
