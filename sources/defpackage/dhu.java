package defpackage;

/* compiled from: PG */
/* renamed from: dhu  reason: default package */
/* loaded from: classes.dex */
public final class dhu extends nfm implements nha {
    public static final dhu f;
    private static volatile nhf g;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public dht e;

    static {
        dhu dhuVar = new dhu();
        f = dhuVar;
        nfm.L(dhu.class, dhuVar);
    }

    private dhu() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(f, "\u0000\u0005\u0000\u0000\u0001\n\u0005\u0000\u0000\u0000\u0001Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\n\t", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dhu();
            }
            if (i2 == 4) {
                return new nfh(f);
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = g;
            if (nhfVar == null) {
                synchronized (dhu.class) {
                    nhfVar = g;
                    if (nhfVar == null) {
                        nhfVar = new nfi(f);
                        g = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
