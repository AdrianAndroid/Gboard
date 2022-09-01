package defpackage;

/* compiled from: PG */
/* renamed from: bkk  reason: default package */
/* loaded from: classes.dex */
public final class bkk extends nfm implements nha {
    public static final bkk g;
    private static volatile nhf h;
    public String a = "";
    public nga b = nhi.b;
    public boolean c;
    public bkj d;
    public boolean e;
    public boolean f;

    static {
        bkk bkkVar = new bkk();
        g = bkkVar;
        nfm.L(bkk.class, bkkVar);
    }

    private bkk() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(g, "\u0000\u0006\u0000\u0000\u0001\t\u0006\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0004\u0007\u0006\t\u0007\u0007\t\u0007", new Object[]{"a", "b", bkj.class, "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new bkk();
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
                synchronized (bkk.class) {
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
